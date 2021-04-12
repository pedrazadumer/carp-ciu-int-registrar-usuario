package co.edu.uniandes.carpciu.regusr.mapeadores;

import co.edu.uniandes.carpciu.regusr.dto.PeticionRegistrarUsuarioDto;
import co.edu.uniandes.carpciu.regusr.dto.UsuarioDto;
import co.gov.registraduria.commoncannonical.v3.schemas.GetCustomerStatusRq;
import co.gov.registraduria.commoncannonical.v3.schemas.HeaderRequest;
import co.gov.registraduria.commoncannonical.v3.schemas.IssuedIdent;
import co.gov.registraduria.commoncannonical.v3.schemas.MessageHeader;
import co.gov.registraduria.commoncannonical.v3.schemas.MessageInfo;
import co.gov.registraduria.commoncannonical.v3.schemas.MessageKey;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapeadorUsuarios {

    private static final String ORIGEN_PORTAL = "Portal";
    private static final Map<String, Integer> tipoIdentificacionMapaEquivalencia;

    static {
        Map<String, Integer> tipoIdentificacionMapaInicial = new HashMap<>();
        tipoIdentificacionMapaInicial.put("Cedula", 1);
        tipoIdentificacionMapaEquivalencia = Collections.unmodifiableMap(tipoIdentificacionMapaInicial);
    }

    private MapeadorUsuarios() {
    }

    public static GetCustomerStatusRq mapearPeticionValidarUsuario(PeticionRegistrarUsuarioDto peticion) {
        GetCustomerStatusRq soapRequest = new GetCustomerStatusRq();
        HeaderRequest headerRequest = new HeaderRequest();
        MessageHeader messageHeader = new MessageHeader();
        MessageInfo messageInfo = new MessageInfo();
        MessageKey messageKey = new MessageKey();
        IssuedIdent issuedIdent = new IssuedIdent();

        messageInfo.setOriginatorName(ORIGEN_PORTAL);
        messageInfo.setSystemId(peticion.getOperador().getNombre());
        messageInfo.setDateTime(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        messageKey.setRequestUUID(UUID.randomUUID().toString());

        messageHeader.setMessageInfo(messageInfo);
        messageHeader.setMessageKey(messageKey);

        UsuarioDto usuario = peticion.getOperador().getUsuario();
        issuedIdent.setIssuedIdentValue(usuario.getNumIdentificacion());

        Integer tipoIdentificacion = tipoIdentificacionMapaEquivalencia.get(usuario.getTipoDocIdentidad());
        if (tipoIdentificacion == null)
            throw new IllegalArgumentException("Tipo de identificacion [" + usuario.getTipoDocIdentidad() + "] no soportado.");

        issuedIdent.setIssuedIdentType(tipoIdentificacion);

        headerRequest.setMessageHeader(messageHeader);

        soapRequest.setHeaderRequest(headerRequest);
        soapRequest.setIssuedIdent(issuedIdent);

        return soapRequest;
    }
}

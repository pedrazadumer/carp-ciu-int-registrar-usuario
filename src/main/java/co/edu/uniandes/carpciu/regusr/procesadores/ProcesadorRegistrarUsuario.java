package co.edu.uniandes.carpciu.regusr.procesadores;

import co.edu.uniandes.carpciu.regusr.dto.PeticionRegistrarUsuarioDto;
import co.edu.uniandes.carpciu.regusr.mapeadores.MapeadorUsuarios;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcesadorRegistrarUsuario implements Processor {

    private ObjectMapper objectMapper;

    public ProcesadorRegistrarUsuario() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        PeticionRegistrarUsuarioDto peticion = exchange.getIn().getBody(PeticionRegistrarUsuarioDto.class);
//        System.out.println("From the processor!!!!!!");
//        System.out.println("peticionPlana = " + exchange.getIn().getBody());
        //System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(peticion));
        //PeticionRegistrarUsuarioDto peticion = objectMapper.readValue(peticionPlana, PeticionRegistrarUsuarioDto.class);
//        System.out.println("peticion.getOperador().getNombre() = " + peticion.getOperador().getNombre());
        exchange.getOut().setBody(MapeadorUsuarios.mapearPeticionValidarUsuario(peticion));
    }
}

package co.edu.uniandes.carpciu.regusr.recursos;

import co.edu.uniandes.carpciu.regusr.dto.PeticionRegistrarUsuarioDto;
import co.edu.uniandes.carpciu.regusr.dto.RespuestaRegistrarUsuarioDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public class RecursoUsuario {

    @POST
    @Path("/usuarios")
    @Consumes("application/json")
    public RespuestaRegistrarUsuarioDto registrarUsuario(PeticionRegistrarUsuarioDto peticionPlana) {
        return null;
    }
}

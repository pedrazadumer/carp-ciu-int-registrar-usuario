package co.edu.uniandes.carpciu.regusr.dto;

import lombok.Data;

@Data
public class OperadorDto {

    private String nombre;
    private boolean esServicioPremium;
    private UsuarioDto usuario;

}

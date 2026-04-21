package com.maestria.gestionSolicitudes.dto.rest.request;

import lombok.Data;

@Data
public class InfoAdicionAsignaturaRequest {
    private String nombreAsignatura;
    private Long idDocente;
    private String grupo;
}






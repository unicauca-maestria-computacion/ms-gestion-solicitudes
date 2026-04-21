package com.maestria.gestionSolicitudes.dto.rest.request.homologaciones;

import lombok.Data;

@Data
public class AprobarHomologacionRequest {
    private Long idHomologacion;    
    private String nombreAsignatura;
    private Integer creditos;
    private Long intensidadHoraria;
    private Double calificacion;
    private String nombrePrograma;
    private String nombreInstitucion;
    private Boolean aprobado;
}






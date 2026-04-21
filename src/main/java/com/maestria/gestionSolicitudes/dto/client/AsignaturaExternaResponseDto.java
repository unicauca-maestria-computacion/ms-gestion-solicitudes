package com.maestria.gestionSolicitudes.dto.client;

import lombok.Data;

@Data
public class AsignaturaExternaResponseDto {
    private Long idAsignatura;
    private String nombre;
    private Integer creditos;
    private Long intensidadHoraria;
    private Double calificacion;
    private String programa;
    private String institucion;
    private String contenidoProgramatico;
}






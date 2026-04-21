package com.maestria.gestionSolicitudes.dto.rest.request.AvalComite;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AprobarAvalComiteRequest {
    private Long idSubtipo;
    private String nombreActividad;
    private BigDecimal horasReconocer;
    private Integer creditosReconocer;
    private Boolean aprobado;
}






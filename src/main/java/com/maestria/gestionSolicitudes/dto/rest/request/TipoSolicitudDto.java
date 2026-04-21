package com.maestria.gestionSolicitudes.dto.rest.request;

import lombok.Data;

@Data
public class TipoSolicitudDto {
    private Long idSolicitud;
    private String codigoSolicitud;
    private String nombreSolicitud;
    private String fechaInicio;
    private String fechaFinal;
}






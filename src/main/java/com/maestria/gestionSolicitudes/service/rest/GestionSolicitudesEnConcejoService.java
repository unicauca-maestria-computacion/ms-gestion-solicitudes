package com.maestria.gestionSolicitudes.service.rest;

import com.maestria.gestionSolicitudes.dto.rest.response.SolicitudEnConcejoResponse;

public interface GestionSolicitudesEnConcejoService {

    SolicitudEnConcejoResponse obtenerSolicitudEnConcejo(Long idSolicitud);

    Boolean guardarSolicitudEnConcejo(SolicitudEnConcejoResponse datosSolicitudEnConcejo);
    
}






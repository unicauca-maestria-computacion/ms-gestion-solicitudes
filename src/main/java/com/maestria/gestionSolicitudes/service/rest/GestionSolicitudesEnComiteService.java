package com.maestria.gestionSolicitudes.service.rest;

import com.maestria.gestionSolicitudes.dto.rest.response.SolicitudEnComiteResponse;

public interface GestionSolicitudesEnComiteService {

    SolicitudEnComiteResponse obtenerSolicitudEnComite(Long idSolicitud);

    Boolean guardarSolicitudEnComite(SolicitudEnComiteResponse datosSolicitudEnComite);
    
}






package com.maestria.gestionSolicitudes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.ApoyoEconomicoPublicacionEvento;
import com.maestria.gestionSolicitudes.domain.Solicitudes;

public interface ApoyoEconomicoPublicacionEventoRepository extends JpaRepository<ApoyoEconomicoPublicacionEvento, Long> {
    ApoyoEconomicoPublicacionEvento findBySolicitud(Solicitudes solicitud);
}






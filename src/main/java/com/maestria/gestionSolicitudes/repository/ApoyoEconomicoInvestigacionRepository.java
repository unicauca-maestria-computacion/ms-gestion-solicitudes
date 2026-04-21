package com.maestria.gestionSolicitudes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.ApoyoEconomicoInvestigacion;
import com.maestria.gestionSolicitudes.domain.Solicitudes;

public interface ApoyoEconomicoInvestigacionRepository extends JpaRepository<ApoyoEconomicoInvestigacion, Long> {
    ApoyoEconomicoInvestigacion findBySolicitud(Solicitudes solicitud);
}






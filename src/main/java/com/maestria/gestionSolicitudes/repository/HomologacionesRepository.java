package com.maestria.gestionSolicitudes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.Homologaciones;
import com.maestria.gestionSolicitudes.domain.Solicitudes;

public interface HomologacionesRepository extends JpaRepository<Homologaciones, Long> {
    Homologaciones findBySolicitud(Solicitudes solicitud);
}






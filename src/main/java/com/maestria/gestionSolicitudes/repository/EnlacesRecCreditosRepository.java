package com.maestria.gestionSolicitudes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.EnlacesRecCreditos;
import com.maestria.gestionSolicitudes.domain.ReconocimientoCreditos;

public interface EnlacesRecCreditosRepository extends JpaRepository<EnlacesRecCreditos, Long> {
    List<EnlacesRecCreditos> findAllByReconocimientoCreditos(ReconocimientoCreditos reconocimientoCreditos);
}






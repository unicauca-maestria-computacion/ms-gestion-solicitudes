package com.maestria.gestionSolicitudes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.DocumentosRecCreditos;
import com.maestria.gestionSolicitudes.domain.ReconocimientoCreditos;

public interface DocumentosRecCreditosRepository extends JpaRepository<DocumentosRecCreditos, Long> {
    List<DocumentosRecCreditos> findAllByReconocimientoCreditos(ReconocimientoCreditos reconocimientoCreditos);
}






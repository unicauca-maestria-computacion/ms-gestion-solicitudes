package com.maestria.gestionSolicitudes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maestria.gestionSolicitudes.domain.AsignaturasHomologadas;
import com.maestria.gestionSolicitudes.domain.Homologaciones;

public interface AsignaturasHomologadasRepository extends JpaRepository<AsignaturasHomologadas, Long> {
    
    List<AsignaturasHomologadas> findAllByHomologacion(Homologaciones homologacion);
}






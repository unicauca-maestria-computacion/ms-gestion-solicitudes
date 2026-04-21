package com.maestria.gestionSolicitudes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.maestria.gestionSolicitudes.domain.Coordinador;


public interface CoordinadorRepository extends JpaRepository<Coordinador, Long> {
    @Query(
        value = "SELECT p.correo_electronico " +
                "FROM personas p " +
                "INNER JOIN coordinadores c ON c.id_persona = p.id " +
                "LIMIT 1",
        nativeQuery = true
    )
    String obtenerCorreoCoordinador();

    @Query(
        value = "SELECT CONCAT(p.nombre, ' ', p.apellido) AS nombre_completo " +
                "FROM personas p " +
                "INNER JOIN coordinadores c ON c.id_persona = p.id " +
                "LIMIT 1",
        nativeQuery = true
    )
    String obtenerNombreCompletoCoordinador();
}






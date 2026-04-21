package com.maestria.gestionSolicitudes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="notas_documentos_requerido")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NotaDocumentoRequerido extends EntidadPrincipal {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nota")
    private String nota;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_req_solicitud")
    private RequisitoSolicitud requisitoSolicitud;      
}






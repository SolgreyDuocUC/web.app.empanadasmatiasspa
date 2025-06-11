package com.smedina.msvcempleados.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.aspectj.bridge.IMessageHandler;

@Entity
@Table(name= "region")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Region {

    @Id
    @Column(name = "id_region", nullable = false)
    private Long idRegion;

    @Column(name = "nombre_region", nullable = false)
    @NotBlank(message = "El nombre de la region, no puede estar vacio")
    private String nombreRegion;
}

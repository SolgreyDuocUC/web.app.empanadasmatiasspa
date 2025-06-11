package com.smedina.msvcempleados.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleado")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class empleado {

    @Id
    @Column(name = "id_empleado", nullable = false)
    private Long idEmpleado;

    private String runEmpleado;

    private String nombresEmpleado;

    private String apellidosEmpleado;

    private Date fechaNacEmpleado;

    private String direccionEmpleado;
    
}

package com.smedina.msvcempleados.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "run_empleado", nullable = false)
    @NotBlank(message = "El RUN del empleado no puede estar vacío")
    @Pattern(regexp = "\\d{7,8}-[\\dKk]", message = "El formato de RUN debe ser 11111111-X")
    private String runEmpleado;

    @Column(name = "nombre_empleado", nullable = false)
    @NotBlank(message = "Los nombres de los empleados no pueden estar vacios")
    private String nombresEmpleado;

    @Column(name = "apellido_empleado", nullable = false)
    @NotBlank(message = "Los apellidos de los empleados no pueden estar vacios")
    private String apellidosEmpleado;

    @Column(name = "fecha_nac_empleado", nullable = false)
    @NotNull(message = "La fecha de nacimiento no puede estar vacía")
    @Past(message = "La fecha de nacimiento debe estar en el pasado")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacEmpleado;

    @Column(name = "correo_empleado", nullable = false)
    @NotBlank(message = "El correo del empleado no debe estar vacío")
    @Email
    private Email correoElectronico;

    @Column(name = "direccion_empleado", nullable = false)
    @NotBlank(message = "La direccion del empleado no puede estar vacia")
    private String direccionEmpleado;

    @Column(name = "sueldo_empleado", nullable = false)
    @NotNull(message = "El sueldo del empleado debe ser asignado")
    private Long sueldoEmpleado;
    
    @Column(name = "tipo_jornada_empleado", nullable = false)
    @NotBlank(message = "El tipo de jornada deber ser asignada. Por ejemplo: Full-Time 44 horas o Part-Time 20 hrs")
    private String tipoJornadaEmpleado;

    @Column(name = "cargo_empleado", nullable = false)
    @NotBlank(message = "El cargo del empleado debe ser asignado para calcular el sueldo")
    private String cargoEmpleado;
}

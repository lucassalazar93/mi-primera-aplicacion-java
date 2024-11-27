package com.miproyecto.miaplicacion.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID autogenerado

    @NotEmpty(message = "El nombre no puede estar vacío") // Valida que el nombre no sea vacío
    private String nombre;

    @Email(message = "El correo debe ser válido") // Valida el formato del correo
    @NotEmpty(message = "El correo no puede estar vacío") // Asegura que no esté vacío
    @Column(unique = true) // Impide que se repitan valores en la columna de la base de datos
    private String correo;

    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres") // Asegura una longitud mínima
    @NotEmpty(message = "La contraseña no puede estar vacía") // No permite valores vacíos
    private String contrasena;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

package com.miproyecto.miaplicacion.repository;

import com.miproyecto.miaplicacion.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aquí puedes añadir consultas personalizadas si las necesitas
}


package com.miproyecto.miaplicacion.service;

import com.miproyecto.miaplicacion.model.Usuario;
import com.miproyecto.miaplicacion.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Crear o actualizar un usuario
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // Obtener todos los usuarios
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    // Obtener un usuario por su ID
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    // Eliminar un usuario
    public void eliminarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}

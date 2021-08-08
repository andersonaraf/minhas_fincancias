package com.anderson.minhasfinancias.model.repository;

import com.anderson.minhasfinancias.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}

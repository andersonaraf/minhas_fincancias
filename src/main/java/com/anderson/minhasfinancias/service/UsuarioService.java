package com.anderson.minhasfinancias.service;

import com.anderson.minhasfinancias.model.entity.Usuario;

public interface UsuarioService {
    Usuario autenticar(String email, String senha);

    Usuario salvarUsuario(Usuario usuario);

    void validarEmail(String email);

}

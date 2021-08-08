package com.anderson.minhasfinancias.service.impl;

import com.anderson.minhasfinancias.model.entity.Usuario;
import com.anderson.minhasfinancias.model.repository.UsuarioRepository;
import com.anderson.minhasfinancias.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;
    public UsuarioServiceImpl(UsuarioRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public Usuario autenticar(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void validarEmail(String email) {

    }
}

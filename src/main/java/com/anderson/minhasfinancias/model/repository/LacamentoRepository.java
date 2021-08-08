package com.anderson.minhasfinancias.model.repository;

import com.anderson.minhasfinancias.model.entity.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LacamentoRepository extends JpaRepository<Lancamento, Long> {

}

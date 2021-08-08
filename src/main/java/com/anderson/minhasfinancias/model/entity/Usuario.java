package com.anderson.minhasfinancias.model.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name="usuario", schema = "financas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Usuario {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;
}

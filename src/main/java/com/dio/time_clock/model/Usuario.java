package com.dio.time_clock.model;


import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Usuario {
    private Long id;
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    private Empresa empresa;
    private NivelAcesso nivelAcesso;
    private jornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}

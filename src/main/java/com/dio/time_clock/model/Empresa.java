package com.dio.time_clock.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Empresa {
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String estado;
    private String telefone;
}

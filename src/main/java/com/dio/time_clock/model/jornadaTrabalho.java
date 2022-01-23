package com.dio.time_clock.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class jornadaTrabalho {
    private long id;
    private String descricao;
}

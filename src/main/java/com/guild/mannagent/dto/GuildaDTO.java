package com.guild.mannagent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuildaDTO {
    private Long id;
    private String nome;
    private Long carteira;
    private Long rank;
}

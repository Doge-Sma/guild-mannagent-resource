package com.guild.mannagent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LojaDTO {
    private Long id;
    private String nome;
    private Long rank;
    
}

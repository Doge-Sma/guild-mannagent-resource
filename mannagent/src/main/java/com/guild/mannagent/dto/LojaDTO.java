package com.guild.mannagent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LojaDTO {
    private Long id;
    @NotBlank
    private String nome;
    @Min(value = 1)
    private Long rank;
    
}

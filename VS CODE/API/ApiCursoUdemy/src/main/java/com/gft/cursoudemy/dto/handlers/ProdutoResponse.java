package com.gft.cursoudemy.dto.handlers;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProdutoResponse {

    private Long id;

    @NotBlank(message = "Este campo Nome, não pode ser vazio.")
    @Size(min = 3, max = 30)
    private String nome;

    @NotNull(message = "Campo quantidade é de preencimento obrigatório.")
    private Integer quantidade;

    @NotNull(message = "Campo valor é de preencimento obrigatório.")
    private Double valor;

    @Size(min = 2, max = 30)
    private String observacao;
}


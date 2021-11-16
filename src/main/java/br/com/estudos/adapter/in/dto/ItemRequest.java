package br.com.estudos.adapter.in.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class ItemRequest {

    @NotBlank(message = "O produto não pode estar em branco")
    @JsonProperty("descricao")
    private String describeItem;
    private double valorItem;

}

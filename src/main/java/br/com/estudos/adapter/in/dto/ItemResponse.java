package br.com.estudos.adapter.in.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemResponse {

    private String idItem;
    private String describeItem;
    private double valorItem;

}

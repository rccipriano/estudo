package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.ItemResponse;
import br.com.estudos.domain.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ItemEntityToItemResponseMapper {


    @Mappings({
            @Mapping(target="idItem", source="itemEntity.id"),
            @Mapping(target="describeItem", source="itemEntity.describe"),
            @Mapping(target="valorItem", source="itemEntity.valor")
    })
    ItemResponse toItemResponse (ItemEntity itemEntity );

}

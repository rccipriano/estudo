package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.ItemRequest;
import br.com.estudos.domain.ItemEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface ItemRequestToItemEntityMapper {

    @Mappings({
            @Mapping(target="describe", source="itemRequest.describeItem"),
            @Mapping(target="valor", source="itemRequest.valorItem")
    })
    ItemEntity toItemEntity (ItemRequest itemRequest );
}

package br.com.estudos.usecase;

import br.com.estudos.adapter.in.dto.ItemRequest;
import br.com.estudos.adapter.in.dto.ItemResponse;
import br.com.estudos.domain.ItemEntity;
import br.com.estudos.port.out.ItemRepositoryPortOut;
import br.com.estudos.usecase.mapper.ItemEntityToItemResponseMapper;
import br.com.estudos.usecase.mapper.ItemRequestToItemEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AddItemUseCase {

    private final ItemRepositoryPortOut itemRepositoryPortOut;
    private final ItemRequestToItemEntityMapper itemRequestToItemEntityMapper;
    private final ItemEntityToItemResponseMapper itemEntityToItemResponseMapper;

    public ItemResponse add(ItemRequest itemRequest){

        ItemEntity itemEntity = itemRepositoryPortOut.salvar(itemRequestToItemEntityMapper.toItemEntity(itemRequest));

        return itemEntityToItemResponseMapper.toItemResponse(itemEntity);
    }
}

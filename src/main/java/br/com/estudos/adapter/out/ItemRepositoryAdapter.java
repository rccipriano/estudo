package br.com.estudos.adapter.out;

import br.com.estudos.domain.ItemEntity;
import br.com.estudos.port.out.ItemRepositoryPortOut;
import br.com.estudos.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ItemRepositoryAdapter implements ItemRepositoryPortOut {

    private final ItemRepository itemRepository;

    public ItemEntity salvar(ItemEntity itemEntitySalvar){
        return itemRepository.save(itemEntitySalvar);

    }
}

package br.com.estudos.port.out;

import br.com.estudos.domain.ItemEntity;

import java.util.List;

public interface ItemRepositoryPortOut {
    ItemEntity salvar(ItemEntity itemEntitySalvar);
}

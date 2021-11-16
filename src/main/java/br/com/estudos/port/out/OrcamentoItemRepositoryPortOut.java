package br.com.estudos.port.out;

import br.com.estudos.domain.OrcamentoItem;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface OrcamentoItemRepositoryPortOut {
    List<OrcamentoItem> salvar(List<OrcamentoItem> orcamentoItemSalvar);
}

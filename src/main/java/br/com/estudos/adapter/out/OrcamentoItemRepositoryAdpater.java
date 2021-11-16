package br.com.estudos.adapter.out;

import br.com.estudos.domain.OrcamentoItem;
import br.com.estudos.port.out.OrcamentoItemRepositoryPortOut;
import br.com.estudos.repository.OrcamentoItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrcamentoItemRepositoryAdpater implements OrcamentoItemRepositoryPortOut {

    private final  OrcamentoItemRepository orcamentoItemRepository;

    public List<OrcamentoItem> salvar(List<OrcamentoItem> orcamentoItemSalvar){
        return orcamentoItemRepository.saveAll(orcamentoItemSalvar);

    }
}

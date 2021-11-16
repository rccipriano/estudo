package br.com.estudos.adapter.out;

import br.com.estudos.domain.Orcamento;
import br.com.estudos.port.out.OrcamentoRepositoryPortOut;
import br.com.estudos.repository.OrcamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OrcamentoRepositoryAdapter implements OrcamentoRepositoryPortOut {

    private final OrcamentoRepository orcamentoRepository;

    @Override
    public Orcamento salvar(Orcamento orcamentoSalvar) {
        return orcamentoRepository.save(orcamentoSalvar);
    }
}

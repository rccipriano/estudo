package br.com.estudos.port.out;

import br.com.estudos.domain.Orcamento;
import org.springframework.stereotype.Component;

public interface OrcamentoRepositoryPortOut {

    Orcamento salvar(Orcamento orcamentoSalvar);
}

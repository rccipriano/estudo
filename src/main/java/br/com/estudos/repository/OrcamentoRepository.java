package br.com.estudos.repository;

import br.com.estudos.domain.Orcamento;
import br.com.estudos.port.out.OrcamentoRepositoryPortOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrcamentoRepository extends JpaRepository<Orcamento, String>, JpaSpecificationExecutor<Orcamento>{


}

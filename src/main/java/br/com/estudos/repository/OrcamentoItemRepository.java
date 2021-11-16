package br.com.estudos.repository;

import br.com.estudos.domain.OrcamentoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;


public interface OrcamentoItemRepository extends JpaRepository<OrcamentoItem, String>, JpaSpecificationExecutor<OrcamentoItem> {

}

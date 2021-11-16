package br.com.estudos.repository;

import br.com.estudos.domain.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<ItemEntity, String>, JpaSpecificationExecutor<ItemEntity> {

}

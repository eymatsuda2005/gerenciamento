package com.eduardomatsuda.gerenciamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardomatsuda.gerenciamento.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer > {
	
}

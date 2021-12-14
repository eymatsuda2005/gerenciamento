package com.eduardomatsuda.gerenciamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardomatsuda.gerenciamento.domain.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer > {
	
}

package com.eduardomatsuda.gerenciamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduardomatsuda.gerenciamento.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer > {
	
}
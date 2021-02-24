package org.generation.lojaDeGamesGeneration.repository;

import java.util.List;

import org.generation.lojaDeGamesGeneration.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
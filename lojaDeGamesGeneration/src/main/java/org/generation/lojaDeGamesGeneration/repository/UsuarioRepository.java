package org.generation.lojaDeGamesGeneration.repository;

import java.util.List;

import org.generation.lojaDeGamesGeneration.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nomeCompleto);
}


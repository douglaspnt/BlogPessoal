//acessar os dados da sus aplicação, que foram persistidos no Banco de dados.
package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

public interface PostagemRespository  extends JpaRepository <Postagem, Long >{
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}


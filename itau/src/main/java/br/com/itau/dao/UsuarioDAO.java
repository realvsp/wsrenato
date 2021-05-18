package br.com.itau.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Usuario;

/* DAO é um pattern que sugestiona onde devem ficar os comandos SQL DML.
 * Dentro sdas classes DAO's:
 * Deve montar o CRUD (Create  - REad - Update - Delete)
 *  */

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	
/*
 * CrudRepository será a classe pai do UsuarioDAO e está informando ao Spring
 * que esta classe armazenará o CRUD para o usuário. O Integer é para especificar
 * que o tipo de dado da chave primária é Integer	
 *  Métodos herdados do CrusRepositpry
 *  - save (objeto): grava/altera uma linha no banco de dados
 *  - findById(int): pesquisa um user pelo código
 *  - FindAll(): retorna 
 *
 *
 *
 *
 */
	
		

}

package br.com.rapl.curso.dao;

import java.util.List;

import br.com.rapl.curso.domain.Usuario;

public interface UsuarioDao {

	void salvar(Usuario usuario);
	
	void editar(Usuario usuario);
	
	void excluir(Long id);
	
	Usuario getId(Long id);
	
	List<Usuario> getTodos(); 
}

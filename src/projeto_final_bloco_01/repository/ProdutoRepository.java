package projeto_final_bloco_01.repository;

import projeto_final_bloco_01.model.*;

public interface ProdutoRepository {
	
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void listarTodos();
	public void procurarPorCodigo(int codigo);
	public void deletar(int codigo);

}

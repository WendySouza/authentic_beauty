package projeto_final_bloco_01.controller;

import java.util.*;

import projeto_final_bloco_01.model.*;
import projeto_final_bloco_01.repository.*;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int codigo = 0;

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome() + ", código: " + produto.getCodigo() + " foi criado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodigo());

		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO produto/código: " + produto.getCodigo() + " foi atualizado com sucesso!");
		} else
			System.out.println("\nO produto/código: " + produto.getCodigo() + "não foi encontrado!!");
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = buscarNaCollection(codigo);

		if (produto != null)
			produto.visualizar();
		else
			System.out.println("\nO código: " + codigo + " não foi encontrado!!");
	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);

	    if (produto != null) {
	        listaProdutos.remove(produto);
	        System.out.println("\nO produto/código: " + codigo + " foi deletado com sucesso!");
	    } else {
	        System.out.println("\nO produto/código: " + codigo + " não foi encontrado!!");
	    }

	}
	
	public int gerarCodigo() {
		return ++ codigo;
	}
	
	public Produto buscarNaCollection(int codigo) {
		for (var produto : listaProdutos) {
			if (produto.getCodigo() == codigo) {
				return produto;
			}
		}
		return null;
	}

}

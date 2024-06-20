package projeto_final_bloco_01.model;

public class Produto {

	private int codigo, quantidade, tipo;
	private String nome;
	private float preco;

	public Produto(int codigo, int quantidade, int tipo, String nome, float preco) {
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Maquiagens";
			break;
		case 2:
			tipo = "Perfumaria";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do produto:");
		System.out.println("\n***********************************************************\n");
		System.out.println("Código do produto: " + this.codigo);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Categoria do produto: " + tipo);
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Preço: " + this.preco);

	}
}

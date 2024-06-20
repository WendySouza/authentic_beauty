package projeto_final_bloco_01.model;

public class Maquiagens extends Produto {
	
	private float valorMinMake; 
	
	public Maquiagens(int codigo, int quantidade, int tipo, String nome, float preco, float valorMinMake) {
		super(codigo, quantidade, 1, nome, preco);		
		this.valorMinMake = valorMinMake;
	}

	public float getValorMinMake() {
		return valorMinMake;
	}

	public void setValorMinMake(float valorMinMake) {
		this.valorMinMake = valorMinMake;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Pedido mínimo em maquiagens: R$" + this.valorMinMake);
	}
}

package projeto_final_bloco_01.model;

public class Perfumaria extends Produto {
	
	float valorMinPerf;
	
	public Perfumaria(int codigo, int quantidade, int tipo, String nome, float preco, float valorMinPerf) {
		super(codigo, quantidade, 2, nome, preco);
		this.valorMinPerf = valorMinPerf;
	}

	public float getValorMinPerf() {
		return valorMinPerf;
	}

	public void setValorMinPerf(float valorMinPerf) {
		this.valorMinPerf = valorMinPerf;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Pedido mínimo em perfumaria: R$ " + this.valorMinPerf);
	}
}

package projeto_final_bloco_01;

import java.io.IOException;
import java.util.*;

import projeto_final_bloco_01.*;
import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.*;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produto = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, codigo, tipo, quantidade;
		String nome;
		float preco, compraMinima;
		
		System.out.println("\nAuthentic Beauty");
		
		Maquiagens m1 = new Maquiagens(produto.gerarCodigo(), 5, 1, "Base", 15.0f, 20.0f);
		produto.cadastrar(m1);

		Maquiagens m2 = new Maquiagens(produto.gerarCodigo(), 80, 1, "Corretivo", 20.0f, 20.0f);
		produto.cadastrar(m2);

		Perfumaria p1 = new Perfumaria(produto.gerarCodigo(), 10, 2, "Suave", 80.0f, 100.0f);
		produto.cadastrar(p1);

		Perfumaria p2 = new Perfumaria(produto.gerarCodigo(), 1, 2, "Marcante", 100.0f, 100.0f);
		produto.cadastrar(p2);

		produto.listarTodos();

		while (true) {
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   Authentic Beauty                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Atualizar cadastro de produto        ");
			System.out.println("            3 - Listar produtos                      ");
			System.out.println("            4 - Buscar produto por código            ");
			System.out.println("            5 - Excluir produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite somente valores inteiros!");
				leia.nextLine();
				opcao = 0;
				continue;
			}

			if (opcao == 6) {
				System.out.println("\nAgradecemos pela visita à Authentic Beauty!");
				sobre();
				leia.close();
				System.exit(0);
			}


			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Cadastrar produto\n\n");
				System.out.println("Digite o nome do produto: ");
				nome = leia.nextLine();
				System.out.println("Digite a quantidade do produto: ");
				quantidade = leia.nextInt();
				System.out.println("Digite o preço do produto R$: ");
				preco = leia.nextFloat();
				
				do {
					System.out.println("Digite a categoria do produto (1-Maquiagens ou 2-Perfumaria): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				
				leia.nextLine();

					switch (tipo) {
					case 1 -> {
					System.out.println("Digite o valor mínimo de compra (R$): ");
					compraMinima = leia.nextFloat();
					produto.cadastrar(
							new Maquiagens(produto.gerarCodigo(), quantidade, tipo, nome, preco, compraMinima));
					}

					case 2 -> {
					System.out.println("Digite o valor mínimo de compra (R$): ");
					compraMinima = leia.nextInt();
					produto.cadastrar(
							new Maquiagens(produto.gerarCodigo(), quantidade, tipo, nome, preco, compraMinima));

					}
					}

				keyPress();
				break;
			case 2:
				System.out.println("Atualizar cadastro de produto\n\n");
				
				System.out.println("Digite o código do produto que deseja atualizar: ");
			    codigo = leia.nextInt();

			    var buscaProduto = produto.buscarNaCollection(codigo);

			    if (buscaProduto != null) {
			        leia.nextLine(); 

			        System.out.println("Digite o nome do produto: ");
			        nome = leia.nextLine();
			        System.out.println("Digite a quantidade do produto: ");
			        quantidade = leia.nextInt();
			        System.out.println("Digite o preço do produto R$: ");
			        preco = leia.nextFloat();

			        do {
			            System.out.println("Digite a categoria do produto (1-Maquiagens ou 2-Perfumaria): ");
			            tipo = leia.nextInt();
			        } while (tipo < 1 || tipo > 2);

			        switch (tipo) {
			            case 1:
			                System.out.println("Digite o valor mínimo de compra (R$): ");
			                compraMinima = leia.nextFloat();
			                produto.atualizar(new Maquiagens(codigo, quantidade, tipo, nome, preco, compraMinima));
			                break;

			            case 2:
			                System.out.println("Digite o valor mínimo de compra (R$): ");
			                compraMinima = leia.nextFloat();
			                produto.atualizar(new Perfumaria(codigo, quantidade, tipo, nome, preco, compraMinima));
			                break;

			            default:
			                System.out.println("Opção inválida!");
			                break;
			        }

			        System.out.println("Produto atualizado com sucesso!");

			    } else {
			        System.out.println("Produto não encontrado!");
			    }
				
				keyPress();
				break;
			case 3:
				System.out.println("Listar produto\n\n");
				produto.listarTodos();
				keyPress();
				break;
			case 4:
				System.out.println("Buscar produto por código\n\n");
				System.out.println("Digite o código do produto: ");
				codigo = leia.nextInt();

				produto.procurarPorCodigo(codigo);
				
				keyPress();
				break;
			case 5:
				System.out.println("Excluir produto\n\n");
			    System.out.println("Digite o código do produto que deseja excluir: ");
			    codigo = leia.nextInt();

			    produto.deletar(codigo);
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");

				keyPress();
				break;
			}

		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************\n");
		System.out.println("Authentic Beauty - Sua autenticidade, sua beleza!");
		System.out.println("Projeto desenvolvido por: ");
		System.out.println("Wendy Souza - contato.wendy@hotmail.com");
		System.out.println("GitHub: github.com/WendySouza");
		System.out.println("\n*********************************************************\n");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("**Você pressionou uma tecla diferente de enter!!!**");

		}
	}
}

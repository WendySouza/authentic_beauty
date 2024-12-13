package projeto_final_bloco_01;

import java.util.*;
import projeto_final_bloco_01.*;
import projeto_final_bloco_01.model.*;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   Authentic Beauty                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Atualizar cadastro de produto        ");
			System.out.println("            3 - Listar produtos                      ");
			System.out.println("            4 - Buscar produtos por código           ");
			System.out.println("            5 - Excluir produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			Produto p1 = new Produto(3515, 1, 2, "Perfumes", 15.0f);
			p1.visualizar();
			
			Maquiagens m1 = new Maquiagens(5428, 25, 1, "Base Facial", 15.0f, 50.0f );
			m1.visualizar();
			
			Perfumaria pp1 = new Perfumaria (5214, 5, 2, "Perfume Feminino", 80.0f, 100.0f);
			pp1.visualizar();			

			if (opcao == 6) {
				System.out.println("\nAgradecemos pela visita à Authentic Beauty!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println("Cadastrar produto\n\n");

				break;
			case 2:
				System.out.println("Atualizar cadastro de produto\n\n");

				break;
			case 3:
				System.out.println("Listar produtos\n\n");

				break;
			case 4:
				System.out.println("Buscar produto por código\n\n");

				break;	
			case 5:
				System.out.println("Excluir produto\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
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
}

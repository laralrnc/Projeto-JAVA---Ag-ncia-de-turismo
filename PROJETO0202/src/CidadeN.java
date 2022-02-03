import java.text.NumberFormat;
import java.util.Scanner;

public class CidadeN extends Destinos {
	Scanner leia = new Scanner(System.in);
	

	public CidadeN(int opCidade, int cidade) {
		super(opCidade, cidade);
	}

	public int getCidadeN() {
		return cidade;
	}

	public void setCidadeN(int cidadeN) {
		this.cidade = cidadeN;
	}
	
	@Override
	public void escolhaCidade() {
		
		System.out.println("Op��o [1]: S�o Paulo");
		System.out.println("Op��o [2]: Fortaleza");
		System.out.println("Op��o [3]: Manaus");
		System.out.println("Op��o [4]: Rio de Janeiro");
		System.out.println("Op��o [5]: Porto Alegre");
		System.out.println("Op��o [6]: Finalizar aplica��o");
		cidade = leia.nextInt();

		switch (cidade) {
		case 1:
			opcoesMenu();

			break;
		case 2:
			opcoesMenu();

			break;
		case 3:
			opcoesMenu();

			break;
		case 4:
			opcoesMenu();

			break;
		case 5:
			opcoesMenu();
			break;
		case 6:
			System.out.println("\nObrigado por utilizar o nosso sistema!!");
			System.out.println("\nAplica��o finalizada");
			System.exit(0);
			break;
		default:
			opcoesMenu();

		}
	}
	
	@Override
	public void imprimirPontosTur() {
		// S�o Paulo
		if (cidade == 1) {
			System.out.println(
					"S�o Paulo tem tr�s principais pontos tur�sticos, sendo eles: Edif�cio It�lia, Parque do Ibirapuera, MASP e mais 35 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();

			// Fortaleza
		} else if (cidade == 2) {
			System.out.println(
					"Fortaleza tem tr�s principais pontos tur�sticos, sendo eles: Mercado Central de Fortaleza, Praia do Futuro, Av. Beira Mar e mais 20 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		}

		// Manaus
		else if (cidade == 3) {
			System.out.println(
					"Manaus tem tr�s principais pontos tur�sticos, sendo eles: Centro hist�rico, Encontro das �guas, Praia da Ponta Negra e mais 11 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		}

		// Rio de Janeiro
		else if (cidade == 4) {
			System.out.println(
					"Rio de Janeiro tem tr�s principais pontos tur�sticos, sendo eles: Cristo Redentor, P�o de a��car, Copacabana e mais 36 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		}

		// Porto Alegre
		else if (cidade == 5) {
			System.out.println(
					"Porto Alegre tem tr�s principais pontos tur�sticos, sendo eles: Parque Farroupilha, Cidade Baixa, Rio Gua�ba e mais 21 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		} else {
			System.out.println("ERRO");
		}
	}
	
	@Override
	public void imprimirCustos() {
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = leia.nextInt();

		if (cidade == 1) {
			double alimentacao = 55.83;
			double bilhete = 4.40;
			double aluguel = 99;
			double hospedagem = 90;
			double passagem = 0;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			System.out.println("S�o Paulo");
			System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
			System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
			System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
			System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
			System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 2) {
			double alimentacao = 76;
			double bilhete = 3.90;
			double aluguel = 122.17;
			double hospedagem = 290;
			double passagem = 0;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			System.out.println("Fortaleza");
			System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
			System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
			System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
			System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
			System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 3) {
			double alimentacao = 60;
			double bilhete = 3.80;
			double aluguel = 139;
			double hospedagem = 120;
			double passagem = 0;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			System.out.println("Manaus");
			System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
			System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
			System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
			System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
			System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 4) {
			double alimentacao = 95;
			double bilhete = 5.80;
			double aluguel = 130;
			double hospedagem = 150;
			double passagem = 0;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			System.out.println("Rio de Janeiro");
			System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
			System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
			System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
			System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
			System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 5) {
			double alimentacao = 73;
			double bilhete = 8.37;
			double aluguel = 99;
			double hospedagem = 110;
			double passagem = 0;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

			System.out.println("Porto Alegre");
			System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
			System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
			System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
			System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
			System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
			System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
					+ " dias, ser� de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else {
			System.out.println("ERRO");
		}

	}
	
	@Override
	public void opcoesMenu() {
		Scanner leia = new Scanner(System.in);
		System.out.println("Escolha a op��o desejada: ");
		System.out.println("Op��o [1]: Custos");
		System.out.println("Op��o [2]: Pontos tur�sticos");
		System.out.println("Op��o [3]: Roteiro completo");
		System.out.println("Op��o [4]: Finalizar aplica��o");
		opCidade = leia.nextInt();
		switch (opCidade) {
		case 1:
			imprimirCustos();
			break;
		case 2:
			imprimirPontosTur();
			break;
		case 3:
			Roteiro();
			break;
		case 4:
			System.out.println("Obrigado por utilizar o nosso sistema!!");
			System.out.println("Aplica��o finalizada");
			System.exit(0);
			break;
			
		}
	}
	
	@Override
	public void Roteiro() {
		
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = leia.nextInt();
		
		// S�o Paulo
				if (cidade == 1) {
					
					System.out.println("Pontos tur�sticos: ");
					System.out.println(
							"S�o Paulo tem tr�s principais pontos tur�sticos, sendo eles: Edif�cio It�lia, Parque do Ibirapuera, MASP e mais 35 destinos.");
					System.out.println("*******************************************************************");
					
					System.out.println("Custo m�dio: ");
					double alimentacao = 55.83;
					double bilhete = 4.40;
					double aluguel = 99;
					double hospedagem = 90;
					double passagem = 0;
					double total;
					NumberFormat nf = NumberFormat.getCurrencyInstance();
					nf.setMinimumFractionDigits(2);
					String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);
					System.out.println("S�o Paulo");
					System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
					System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
					System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
					System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
					System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
					System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
							+ " dias, ser� de: " + nf.format(total));
					System.out.println("");
					System.out.println("Obrigada por utilizar o nosso programa");
					System.exit(0);
					
					// Fortaleza
				} else if (cidade == 2) {
					
					System.out.println("Pontos tur�sticos: ");
					System.out.println(
							"Fortaleza tem tr�s principais pontos tur�sticos, sendo eles: Mercado Central de Fortaleza, Praia do Futuro, Av. Beira Mar e mais 20 destinos.");
					System.out.println("*******************************************************************");
					double alimentacao = 76;
					double bilhete = 3.90;
					double aluguel = 122.17;
					double hospedagem = 290;
					double passagem = 0;
					double total;
					
					System.out.println("Custo m�dio: ");
					NumberFormat nf = NumberFormat.getCurrencyInstance();
					nf.setMinimumFractionDigits(2);
					String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

					System.out.println("Fortaleza");
					System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
					System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
					System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
					System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
					System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
					System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
							+ " dias, ser� de: " + nf.format(total));
					System.out.println("");
					System.out.println("Obrigada por utilizar o nosso programa");
					System.exit(0);
					
				}

				// Manaus
				else if (cidade == 3) {
					
					System.out.println("Pontos tur�sticos: ");
					System.out.println(
							"Manaus tem tr�s principais pontos tur�sticos, sendo eles: Centro hist�rico, Encontro das �guas, Praia da Ponta Negra e mais 11 destinos.");
					System.out.println("*******************************************************************");
					double alimentacao = 60;
					double bilhete = 3.80;
					double aluguel = 139;
					double hospedagem = 120;
					double passagem = 0;
					double total;
					
					System.out.println("Custo m�dio: ");
					NumberFormat nf = NumberFormat.getCurrencyInstance();
					nf.setMinimumFractionDigits(2);
					String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

					System.out.println("Manaus");
					System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
					System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
					System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
					System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
					System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
					System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
							+ " dias, ser� de: " + nf.format(total));
					System.out.println("");
					System.out.println("Obrigada por utilizar o nosso programa");
					System.exit(0);
				}

				// Rio de Janeiro
				else if (cidade == 4) {
					
					System.out.println("Pontos tur�sticos: ");
					System.out.println(
							"Rio de Janeiro tem tr�s principais pontos tur�sticos, sendo eles: Cristo Redentor, P�o de a��car, Copacabana e mais 36 destinos.");
					System.out.println("*******************************************************************");
					double alimentacao = 95;
					double bilhete = 5.80;
					double aluguel = 130;
					double hospedagem = 150;
					double passagem = 0;
					double total;
					
					System.out.println("Custo m�dio: ");
					NumberFormat nf = NumberFormat.getCurrencyInstance();
					nf.setMinimumFractionDigits(2);
					String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

					System.out.println("Rio de Janeiro");
					System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
					System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
					System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
					System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
					System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
					System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
							+ " dias, ser� de: " + nf.format(total));
					System.out.println("");
					System.out.println("Obrigada por utilizar o nosso programa");
					System.exit(0);
				}

				// Porto Alegre
				else if (cidade == 5) {
					
					System.out.println("Pontos tur�sticos: ");
					System.out.println(
							"Porto Alegre tem tr�s principais pontos tur�sticos, sendo eles: Parque Farroupilha, Cidade Baixa, Rio Gua�ba e mais 21 destinos.");
					System.out.println("*******************************************************************");
					double alimentacao = 73;
					double bilhete = 8.37;
					double aluguel = 99;
					double hospedagem = 110;
					double passagem = 0;
					double total;
					
					System.out.println("Custo m�dio: ");
					NumberFormat nf = NumberFormat.getCurrencyInstance();
					nf.setMinimumFractionDigits(2);
					String formatoMoeda = nf.format(total =((alimentacao + bilhete + aluguel + hospedagem) * qntsDias) + passagem);

					System.out.println("Porto Alegre");
					System.out.println("Custo m�dio de alimenta��o di�rio: " + nf.format(alimentacao));
					System.out.println("Custo do bilhete para transporte: " + nf.format(bilhete));
					System.out.println("Custo de aluguel de carro di�rio a partir de: " + nf.format(aluguel));
					System.out.println("A hospedagem di�ria tem o custo inicial de: " + nf.format(hospedagem));
					System.out.println("Valor de passagens a partir de: " + nf.format(passagem));
					System.out.printf("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias
							+ " dias, ser� de: " + nf.format(total));
					System.out.println("");
					System.out.println("Obrigada por utilizar o nosso programa");
					System.exit(0);
				} else {
					System.out.println("ERRO");
				}
		}
	}
	


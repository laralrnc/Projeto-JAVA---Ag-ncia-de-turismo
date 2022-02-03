import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadeI extends Destinos {
	Scanner leia = new Scanner(System.in);
	private float cambio = (float) 0;

	public CidadeI(int opCidade, int cidade, float cambio) {
		super(opCidade, cidade);
		this.cambio = cambio;
	}

	public float getCambio() {
		return cambio;
	}

	public void setCambio(float cambio) {
		this.cambio = cambio;
	}

	public void imprimirClima() {

		System.out.println("\nSelecione o período desejado");
		System.out.println("\n[1] – Janeiro a Março");
		System.out.println("\n[2] – Abril a Junho");
		System.out.println("\n[3] – Julho a Setembro");
		System.out.println("\n[4] – Outubro a Novembro");
		System.out.println("\n[5] – Fechar aplicação");
		System.out.println("\n[6] – Voltar ao menu inicial");
		int periodo1 = leia.nextInt();

		// Londres
		if (cidade == 1) {
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 8ºC à 2ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 3ºC à 17ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 11ºC à 22ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 4ºC à 19ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}
		}

		// Paris
		else if (cidade == 2) {
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Paris nessa epoca do ano é de 3ºC à 9ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Paris nessa epoca do ano é de 6ºC à 22ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Paris nessa epoca do ano é de 14ºC à 26ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Paris nessa epoca do ano é de 5ºC à 20ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}

		}

		// Los Angeles
		else if (cidade == 3) {
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 3ºC à 9ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 5ºC à 20ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 14ºC à 26ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 6ºC à 22ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}
		}

		// Buenos Aires
		else if (cidade == 4) {
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 19ºC à 29ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 12ºC à 26ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 8ºC à 17ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 11ºC à 25ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}
		}

		// Dubai
		else if (cidade == 5) {
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 18ºC à 38ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 18ºC à 38ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 28ºC à 41ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 4ºC à 19ºC");
				System.out.println("*******************************************************************");
				opcoesMenu();
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}

		} else if (cidade > 5 || cidade < 0) {
			System.out.println("O código inserido para a escolha do destino não corresponde as nossas opções.");
			System.out.println("Pedimos que insira um código valído");
			System.out.println("*******************************************************************");
			escolhaCidade();
		}
	}

	@Override

	public void imprimirPontosTur() {

		// Londres
		if (cidade == 1) {
			System.out.println("Londres tem três principais pontos turísticos, sendo eles: "
					+ "Palácio de Westminster – Big Ben, London Eye, Torre de Londres e mais 39 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();

			// Paris
		} else if (cidade == 2) {
			System.out.println("Paris tem três principais pontos turísticos, sendo eles: Torre Eiffel, "
					+ "Arco do Triunfo, Notre Dame de Paris e mais 15 destinos");
			System.out.println("*******************************************************************");
			opcoesMenu();

		}

		// Los Angeles
		else if (cidade == 3) {
			System.out.println("Los Angeles tem três principais pontos turísticos, sendo eles: Hollywood, "
					+ "Warner Bros Studios, Rodeo Drive e mais 12 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		}

		// Buenos Aires
		else if (cidade == 4) {
			System.out.println("Buenos Aires tem três principais pontos turísticos, sendo eles: Galerias Pacífico, "
					+ "Casa Rosada, Obelisco  e mais 15 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		}

		// Dubai
		else if (cidade == 5) {
			System.out.println("Dubai tem três principais pontos turísticos, sendo eles: Abu Dhabi, Dubai Mall, "
					+ "Ilhas artificiais  e mais 10 destinos.");
			System.out.println("*******************************************************************");
			opcoesMenu();
		} else if (cidade > 5 || cidade < 0) {
			System.out.println("O código inserido para a escolha do destino não corresponde as nossas opções.");
			System.out.println("Pedimos que insira um código valído");
			System.out.println("*******************************************************************");
			escolhaCidade();
		}
	}

	public void imprimirFuso() {
		// Londres
		if (cidade == 1) {
			int f = 3;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			escolhaCidade();
			// Paris
		} else if (cidade == 2) {
			int f = 4;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			escolhaCidade();
			// Los Angeles
		} else if (cidade == 3) {
			int f = -5;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			escolhaCidade();
			// Buenos Aires
		} else if (cidade == 4) {
			int f = 0;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			escolhaCidade();
			// Dubai
		} else if (cidade == 5) {
			int f = 7;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));

			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			escolhaCidade();

		} else if (cidade > 5 || cidade < 0) {
			System.out.println("O código inserido para a escolha do destino não corresponde as nossas opções.");
			System.out.println("Pedimos que insira um código valído");
			System.out.println("*******************************************************************");
			escolhaCidade();
		}

	}

	@Override
	public void imprimirCustos() {
		System.out.println("Quantos dias você pretende ficar nesse destino? ");
		int qntsDias = leia.nextInt();

		if (cidade == 1) {
			double libra = 7.14;
			double alimentacao = 25;
			double bilhete = 1.5;
			double aluguel = 32;
			double hospedagem = 150;
			double passagem = 7830;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * libra) * qntsDias) + passagem));

			System.out.println("Londres - Libra = GBP");
			System.out.println(
					"Custo médio de alimentação diário: GBP " + alimentacao + " - " + nf.format(alimentacao * libra));
			System.out.println("Custo do bilhete para transporte: GBP " + bilhete + " - " + nf.format(bilhete * libra));
			System.out.println("Custo de aluguel de carro diário a partir de: GBP " + aluguel + " - "
					+ nf.format(aluguel * libra));
			System.out.println("A hospedagem diária tem o custo inicial de: GBP " + hospedagem + " - "
					+ nf.format(hospedagem * libra));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 2) {
			double euro = 5.94;
			double alimentacao = 78;
			double bilhete = 1.7;
			double aluguel = 45;
			double hospedagem = 60;
			double passagem = 5622;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * euro) * qntsDias) + passagem));

			System.out.println("Paris - Euro = EUR ");
			System.out.println(
					"Custo médio de alimentação diário: EUR " + alimentacao + " - " + nf.format(alimentacao * euro));
			System.out.println("Custo do bilhete para transporte: EUR " + bilhete + " - " + nf.format(bilhete * euro));
			System.out.println(
					"Custo de aluguel de carro diário a partir de: EUR " + aluguel + " - " + nf.format(aluguel * euro));
			System.out.println("A hospedagem diária tem o custo inicial de: EUR " + hospedagem + " - "
					+ nf.format(hospedagem * euro));
			System.out.println("Valor de passagens a partir de: " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();

		} else if (cidade == 3) {
			double dolar = 5.27;
			double alimentacao = 56;
			double bilhete = 1.75;
			double aluguel = 38;
			double hospedagem = 83;
			double passagem = 6332;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * dolar) * qntsDias) + passagem));

			System.out.println("Los Angeles - Dólar = USD");
			System.out.println(
					"Custo médio de alimentação diário: USD " + alimentacao + " - " + nf.format(alimentacao * dolar));
			System.out.println(
					"Custo do bilhete para transporte: USD " + bilhete + " - BRL " + nf.format(bilhete * dolar));
			System.out.println("Custo de aluguel de carro diário a partir de: USD " + aluguel + " - "
					+ nf.format(aluguel * dolar));
			System.out.println("A hospedagem diária tem o custo inicial de: USD " + hospedagem + " - "
					+ nf.format(hospedagem * dolar));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: BRL " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();
		} else if (cidade == 4) {
			double peso = 0.05;
			double alimentacao = 250;
			double bilhete = 6.00;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * peso) * qntsDias) + passagem));

			System.out.println("Buenos Aires - Pesos = ARS");
			System.out.println(
					"Custo médio de alimentação diário: ARS " + alimentacao + " - " + nf.format(alimentacao * peso));
			System.out.println("Custo do bilhete para transporte: ARS " + bilhete + " - " + nf.format(bilhete * peso));
			System.out.println(
					"Custo de aluguel de carro diário a partir de: ARS " + aluguel + " - " + nf.format(aluguel * peso));
			System.out.println("A hospedagem diária tem o custo inicial de: ARS " + hospedagem + " - "
					+ nf.format(hospedagem * peso));
			System.out.println("Valor de passagens a partir de: " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();
		} else if (cidade == 5) {
			double dirham = 1.43;
			double alimentacao = 250;
			double bilhete = 6.00;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(
					total = ((((alimentacao + bilhete + aluguel + hospedagem) * dirham) * qntsDias) + passagem));

			System.out.println("Dubai - Dirham = DH");
			System.out.println(
					"Custo médio de alimentação diário: DH " + alimentacao + " - " + nf.format(alimentacao * dirham));
			System.out.println("Custo do bilhete para transporte: DH " + bilhete + " - " + nf.format(bilhete * dirham));
			System.out.println("Custo de aluguel de carro diário a partir de: DH " + aluguel + " - "
					+ nf.format(aluguel * dirham));
			System.out.println("A hospedagem diária tem o custo inicial de: DH " + hospedagem + " - "
					+ nf.format(hospedagem * dirham));
			System.out.println("Valor de passagens a partir de: " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("*******************************************************************");
			opcoesMenu();
		} else if (cidade > 5 || cidade < 0) {
			System.out.println("O número digitado não corresponde as nossas opções. Por favor digite um valor válido");
			System.out.println("*******************************************************************");
			escolhaCidade();
		} else {
			System.out.println("ERRO");
		}

	}

	@Override
	public void opcoesMenu() {

		int op = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha a opção desejada: ");
		System.out.println("Opção [1]: Temperatura");
		System.out.println("Opção [2]: Fuso Horário");
		System.out.println("Opção [3]: Custos");
		System.out.println("Opção [4]: Pontos turísticos");
		System.out.println("Opção [5]: Roteiro completo");
		System.out.println("Opção [6]: Finalizar aplicação");
		op = leia.nextInt();

		switch (op) {
		case 1:
			imprimirClima();
			break;
		case 2:
			imprimirFuso();
			break;
		case 3:
			imprimirCustos();
			break;
		case 4:
			imprimirPontosTur();
			break;
		case 5:
			Roteiro();
			break;
		case 6:
			System.out.println("\nObrigado por utilizar o nosso sistema!!");
			System.out.println("\nAplicação finalizada");
			System.exit(0);
			break;
		default:
			imprimirClima();
		}
	}

	@Override
	public void escolhaCidade() {
		System.out.println("Escolha a cidade que deseja visitar: ");
		System.out.println("Opção [1]: Londres");
		System.out.println("Opção [2]: Paris");
		System.out.println("Opção [3]: Los Angeles");
		System.out.println("Opção [4]: Buenos Aires");
		System.out.println("Opção [5]: Dubai");
		System.out.println("Opção [6]: Finalizar aplicação");
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
			System.out.println("\nAplicação finalizada");
			System.exit(0);
			break;
		default:
			opcoesMenu();

		}

	}

	@Override
	public void Roteiro() {

		int periodo1;
		int qntsDias;

		System.out.println("\nSelecione o período desejado");
		System.out.println("\n[1] – Janeiro a Março");
		System.out.println("\n[2] – Abril a Junho");
		System.out.println("\n[3] – Julho a Setembro");
		System.out.println("\n[4] – Outubro a Novembro");
		System.out.println("\n[5] – Fechar aplicação");
		System.out.println("\n[6] – Voltar ao menu inicial");
		periodo1 = leia.nextInt();

		System.out.println("Quantos dias você pretende ficar nesse destino? ");
		qntsDias = leia.nextInt();

		// Londres
		if (cidade == 1) {

			// fuso
			int f = 3;
			System.out.println("Fuso horário: ");
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));
			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");

			System.out.println("Pontos turísticos: ");
			System.out.println("Londres tem três principais pontos turísticos, sendo eles: "
					+ "Palácio de Westminster – Big Ben, London Eye, Torre de Londres e mais 39 destinos.");
			System.out.println("*******************************************************************");

			System.out.println("Clima: ");
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 8ºC à 2ºC");
				System.out.println("*******************************************************************");

			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 3ºC à 17ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 11ºC à 22ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Londres nessa epoca do ano é de 4ºC à 19ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				escolhaCidade();
			} else {
				System.out.println("Opção inválida!");
			}

			System.out.println("Custo médio da viagem: ");
			double libra = 7.14;
			double alimentacao = 25;
			double bilhete = 1.5;
			double aluguel = 32;
			double hospedagem = 150;
			double passagem = 7830;
			double total;

			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(
					total = ((((alimentacao + bilhete + aluguel + hospedagem) * libra) * qntsDias) + passagem));

			System.out.println("Londres - Libra = GBP");
			System.out.println(
					"Custo médio de alimentação diário: GBP " + alimentacao + " - " + nf.format(alimentacao * libra));
			System.out.println("Custo do bilhete para transporte: GBP " + bilhete + " - " + nf.format(bilhete * libra));
			System.out.println("Custo de aluguel de carro diário a partir de: GBP " + aluguel + " - "
					+ nf.format(aluguel * libra));
			System.out.println("A hospedagem diária tem o custo inicial de: GBP " + hospedagem + " - "
					+ nf.format(hospedagem * libra));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.printf("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("");
			System.out.println("Obrigada por utilizar o nosso programa");
			System.exit(0);

			// Paris
		} else if (cidade == 2) {
			
			System.out.println("Fuso horário: ");
			int f = 4;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));
			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");

			System.out.println("Pontos turistícos: ");
			System.out.println("Paris tem três principais pontos turísticos, sendo eles: Torre Eiffel, "
					+ "Arco do Triunfo, Notre Dame de Paris e mais 15 destinos");
			System.out.println("*******************************************************************");
			
			System.out.println("Clima: ");
			if (periodo1 == 1) {
					System.out.println("A média de temperatura em Paris nessa epoca do ano é de 3ºC à 9ºC");
					System.out.println("*******************************************************************");
					
				} else if (periodo1 == 2) {
					System.out.println("A média de temperatura em Paris nessa epoca do ano é de 6ºC à 22ºC");
					System.out.println("*******************************************************************");
					
				} else if (periodo1 == 3) {
					System.out.println("A média de temperatura em Paris nessa epoca do ano é de 14ºC à 26ºC");
					System.out.println("*******************************************************************");
					
				} else if (periodo1 == 4) {
					System.out.println("A média de temperatura em Paris nessa epoca do ano é de 5ºC à 20ºC");
					System.out.println("*******************************************************************");
					
				} else if (periodo1 == 5) {
					System.out.println("Agradecemos por utilizar o nosso sistema");
					System.out.println("Aplicação finalizada");
					System.exit(0);
				} else if (periodo1 == 6) {
					
				} else {
					System.out.println("Opção inválida!");
				}

			System.out.println("Custo médio: ");
				double euro = 5.94;
				double alimentacao = 78;
				double bilhete = 1.7;
				double aluguel = 45;
				double hospedagem = 60;
				double passagem = 5622;
				double total;
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				nf.setMinimumFractionDigits(2);
				String formatoMoeda = nf
						.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * euro) * qntsDias) + passagem));
				System.out.println("Paris - Euro = EUR ");
				System.out.println(
						"Custo médio de alimentação diário: EUR " + alimentacao + " - " + nf.format(alimentacao * euro));
				System.out.println("Custo do bilhete para transporte: EUR " + bilhete + " - " + nf.format(bilhete * euro));
				System.out.println(
						"Custo de aluguel de carro diário a partir de: EUR " + aluguel + " - " + nf.format(aluguel * euro));
				System.out.println("A hospedagem diária tem o custo inicial de: EUR " + hospedagem + " - "
						+ nf.format(hospedagem * euro));
				System.out.println("Valor de passagens a partir de: " + passagem);
				System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
						+ " dias, será de: " + nf.format(total));
				System.out.println("");
				System.out.println("Obrigada por utilizar o nosso programa");
				System.exit(0);
		}
				
			
		

		// Los Angeles
		else if (cidade == 3) {
			
			System.out.println("Fuso horário: ");
			int f = -5;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));
			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			
			System.out.println("Pontos turísticos: ");
			System.out.println("Los Angeles tem três principais pontos turísticos, sendo eles: Hollywood, "
					+ "Warner Bros Studios, Rodeo Drive e mais 12 destinos.");
			System.out.println("*******************************************************************");
			
			System.out.println("Clima: ");
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 3ºC à 9ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 5ºC à 20ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 14ºC à 26ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Los Angeles nessa epoca do ano é de 6ºC à 22ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				
			} else {
				System.out.println("Opção inválida!");
			}
			
			
			System.out.println("Custo médio: ");
			double dolar = 5.27;
			double alimentacao = 56;
			double bilhete = 1.75;
			double aluguel = 38;
			double hospedagem = 83;
			double passagem = 6332;
			double total;
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * dolar) * qntsDias) + passagem));
			System.out.println("Los Angeles - Dólar = USD");
			System.out.println(
					"Custo médio de alimentação diário: USD " + alimentacao + " - " + nf.format(alimentacao * dolar));
			System.out.println(
					"Custo do bilhete para transporte: USD " + bilhete + " - " + nf.format(bilhete * dolar));
			System.out.println("Custo de aluguel de carro diário a partir de: USD " + aluguel + " - "
					+ nf.format(aluguel * dolar));
			System.out.println("A hospedagem diária tem o custo inicial de: USD " + hospedagem + " - "
					+ nf.format(hospedagem * dolar));
			System.out.println("Valor de passagens a partir de: BRL " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("*******************************************************************");
			System.out.println("");
			System.out.println("Obrigada por utilizar o nosso programa");
			System.exit(0);
			
		}

		// Buenos Aires
		else if (cidade == 4) {
			
			System.out.println("Fuso horário: ");
			int f = 0;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));
			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			
			System.out.println("Pontos turísticos: ");
			System.out.println("Buenos Aires tem três principais pontos turísticos, sendo eles: Galerias Pacífico, "
					+ "Casa Rosada, Obelisco  e mais 15 destinos.");
			System.out.println("*******************************************************************");
			
			System.out.println("Clima: ");
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 19ºC à 29ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 12ºC à 26ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 8ºC à 17ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Buenos Aires nessa epoca do ano é de 11ºC à 25ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				
			} else {
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Custo médio: ");
			double peso = 0.05;
			double alimentacao = 250;
			double bilhete = 6.00;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total;
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf
					.format(total = ((((alimentacao + bilhete + aluguel + hospedagem) * peso) * qntsDias) + passagem));
			System.out.println("Buenos Aires - Pesos = ARS");
			System.out.println(
					"Custo médio de alimentação diário: ARS " + alimentacao + " - " + nf.format(alimentacao * peso));
			System.out.println("Custo do bilhete para transporte: ARS " + bilhete + " - " + nf.format(bilhete * peso));
			System.out.println(
					"Custo de aluguel de carro diário a partir de: ARS " + aluguel + " - " + nf.format(aluguel * peso));
			System.out.println("A hospedagem diária tem o custo inicial de: ARS " + hospedagem + " - "
					+ nf.format(hospedagem * peso));
			System.out.println("Valor de passagens a partir de: " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("");
			System.out.println("Obrigada por utilizar o nosso programa");
			System.exit(0);
		}

		// Dubai
		else if (cidade == 5) {
			
			System.out.println("Fuso horário: ");
			int f = 7;
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			System.out.println("Horário de brasília: " + sdf.format(gc.getTime()));
			gc.add(Calendar.HOUR, f);
			System.out.println("Horário no destino: " + sdf.format(gc.getTime()));
			System.out.println("*******************************************************************");
			
			System.out.println("Pontos turísticos: ");
			System.out.println("Dubai tem três principais pontos turísticos, sendo eles: Abu Dhabi, Dubai Mall, "
					+ "Ilhas artificiais  e mais 10 destinos.");
			System.out.println("*******************************************************************");
			
			System.out.println("Clima: ");
			if (periodo1 == 1) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 18ºC à 38ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 2) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 18ºC à 38ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 3) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 28ºC à 41ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 4) {
				System.out.println("A média de temperatura em Dubai nessa epoca do ano é de 4ºC à 19ºC");
				System.out.println("*******************************************************************");
				
			} else if (periodo1 == 5) {
				System.out.println("Agradecemos por utilizar o nosso sistema");
				System.out.println("Aplicação finalizada");
				System.exit(0);
			} else if (periodo1 == 6) {
				
			} else {
				System.out.println("Opção inválida!");
			}
			
			System.out.println("Custo médio: ");
			double dirham = 1.43;
			double alimentacao = 250;
			double bilhete = 6.00;
			double aluguel = 1834;
			double hospedagem = 3932;
			double passagem = 6332;
			double total;
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(
					total = ((((alimentacao + bilhete + aluguel + hospedagem) * dirham) * qntsDias) + passagem));
			System.out.println("Dubai - Dirham = DH");
			System.out.println(
					"Custo médio de alimentação diário: DH " + alimentacao + " - " + nf.format(alimentacao * dirham));
			System.out.println("Custo do bilhete para transporte: DH " + bilhete + " - " + nf.format(bilhete * dirham));
			System.out.println("Custo de aluguel de carro diário a partir de: DH " + aluguel + " - "
					+ nf.format(aluguel * dirham));
			System.out.println("A hospedagem diária tem o custo inicial de: DH " + hospedagem + " - "
					+ nf.format(hospedagem * dirham));
			System.out.println("Valor de passagens a partir de: " + passagem);
			System.out.println("\nCom base nas informações acima, o seu gasto médio na viagem durante " + qntsDias
					+ " dias, será de: " + nf.format(total));
			System.out.println("");
			System.out.println("Obrigada por utilizar o nosso programa");
			System.exit(0);


		} else if (cidade > 5 || cidade < 0) {
			System.out.println("O código inserido para a escolha do destino não corresponde as nossas opções.");
			System.out.println("Pedimos que insira um código valído");
			System.out.println("*******************************************************************");
			escolhaCidade();
		}

	}

}

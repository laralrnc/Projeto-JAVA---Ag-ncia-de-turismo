
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CidadesInternacionais extends Destinos {

	

	public CidadesInternacionais(String nome, String moeda, String pontosTuristicos, String sigla, int fuso,
			int temperaturaMin, int temperaturaMax, int periodo, float cambio, float bilhete, float alimentacao,
			float hospedagem, float aluguel, float passagem) {
		super(nome, moeda, pontosTuristicos, sigla, fuso, temperaturaMin, temperaturaMax, periodo, cambio, bilhete, alimentacao,
				hospedagem, aluguel, passagem);
		// TODO Auto-generated constructor stub
	}

	Scanner sc = new Scanner(System.in);

	public void cambio(float cambio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void imprimirClima() {
		// TODO Auto-generated method stub

		if (periodo == 1 && nome == "Londres") {
			setTemperaturaMin(2);
			setTemperaturaMax(8);

		} else if (periodo == 2 && nome == "Londres") {
			setTemperaturaMin(3);
			setTemperaturaMax(17);

		} else if (periodo == 3 && nome == "Londres") {
			setTemperaturaMin(11);
			setTemperaturaMax(22);

		} else if (periodo == 4 && nome == "Londres") {
			setTemperaturaMin(4);
			setTemperaturaMax(19);

		} else if (periodo == 1 && nome == "Paris") {
			setTemperaturaMin(3);
			setTemperaturaMax(9);

		} else if (periodo == 2 && nome == "Paris") {
			setTemperaturaMin(6);
			setTemperaturaMax(22);

		} else if (periodo == 3 && nome == "Paris") {
			setTemperaturaMin(14);
			setTemperaturaMax(26);

		} else if (periodo == 4 && nome == "Paris") {
			setTemperaturaMin(5);
			setTemperaturaMax(20);

		} else if (periodo == 1 && nome == "Los Angeles") {
			setTemperaturaMin(3);
			setTemperaturaMax(9);

		} else if (periodo == 2 && nome == "Los Angeles") {
			setTemperaturaMin(5);
			setTemperaturaMax(20);

		} else if (periodo == 3 && nome == "Los Angeles") {
			setTemperaturaMin(14);
			setTemperaturaMax(26);

		} else if (periodo == 4 && nome == "Los Angeles") {
			setTemperaturaMin(6);
			setTemperaturaMax(22);

		} else if (periodo == 1 && nome == "Buenos Aires") {
			setTemperaturaMin(19);
			setTemperaturaMax(29);

		} else if (periodo == 2 && nome == "Buenos Aires") {
			setTemperaturaMin(12);
			setTemperaturaMax(26);

		} else if (periodo == 3 && nome == "Buenos Aires") {
			setTemperaturaMin(8);
			setTemperaturaMax(17);

		} else if (periodo == 4 && nome == "Buenos Aires") {
			setTemperaturaMin(11);
			setTemperaturaMax(25);

		} else if (periodo == 1 && nome == "Dubai") {
			setTemperaturaMin(18);
			setTemperaturaMax(38);

		} else if (periodo == 2 && nome == "Dubai") {
			setTemperaturaMin(18);
			setTemperaturaMax(38);

		} else if (periodo == 3 && nome == "Dubai") {
			setTemperaturaMin(28);
			setTemperaturaMax(41);

		} else if (periodo == 4 && nome == "Dubai") {
			setTemperaturaMin(4);
			setTemperaturaMax(19);

		} else {
			System.out.println("Op��o inv�lida!");

		}

		if (getTemperaturaMin() != 0) {
			
			System.out.println("");
			System.out.println("Temperatura: ");
			System.out.println("A m�dia de temperatura em " + getNome() + " nessa �poca do ano � de "
					+ getTemperaturaMin() + "�C � " + getTemperaturaMax() + "�C.");
			System.out.println("");

		}

	}

	@Override
	public void imprimirCustos() { // TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Quantos dias voc� pretende ficar nesse destino? ");
		int qntsDias = sc.nextInt();
		
		double total = (((( getAlimentacao() + getBilhete() + getAluguel() + getHospedagem()) * getCambio()) * qntsDias) + getPassagem());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		
		System.out.println("Custo m�dio: ");
		System.out.println(getNome() + " - " + getMoeda() + " = " + getSigla());
		System.out.println("Custo m�dio de alimenta��o di�rio: " + getSigla() + " " + getAlimentacao() + " - " + nf.format(getAlimentacao() * getCambio()));
		System.out.println("Custo do bilhete para transporte: " + getSigla()  + " " + getBilhete() + " - " + nf.format(getBilhete() * getCambio()));
		System.out.println("Custo de aluguel de carro di�rio a partir de: " + getSigla() +  " " + getAluguel() + " - " + nf.format(getAluguel() * getCambio()));
		System.out.println("A hospedagem di�ria tem o custo inicial de: " + getSigla() + " " + getHospedagem() + " - " + nf.format(getHospedagem() * getCambio()));
		System.out.println("Valor de passagens a partir de: " + nf.format(getPassagem()));
		System.out.println("\nCom base nas informa��es acima, o seu gasto m�dio na viagem durante " + qntsDias +" dias, ser� de: " + nf.format(total));
	}
	 
	 
	@Override
	public void pontosTuristicos() {
		// TODO Auto-generated method stub
		
		System.out.println("Pontos tur�sticos: ");
		System.out.println(getPontosTuristicos());

	}

	@Override
	public void geNome() {
		// TODO Auto-generated method stub

	}

}
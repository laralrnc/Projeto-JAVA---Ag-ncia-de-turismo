public abstract class Destinos {
	protected int opCidade;
	protected int cidade;

	abstract public void escolhaCidade();
	abstract public void imprimirPontosTur();
	abstract public void imprimirCustos();
	abstract public void opcoesMenu();
	abstract public void Roteiro();
	
	
	public Destinos(int opCidade, int cidade) {
		this.opCidade = opCidade;
		this.cidade = cidade;
	}

	public int getOpCidade() {
		return opCidade;
	}

	public void setOpCidade(int opCidade) {
		this.opCidade = opCidade;
	}

	public int getCidade() {
		return cidade;
	}

	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	
	
}



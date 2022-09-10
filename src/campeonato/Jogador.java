package campeonato;

import java.awt.TextArea;

/*
 Desenvolvimento da classe Jogador, responsável pela criação de objetos do tipo Jogador que vão compor o time(Coleção de objetos da Classe Jogador)
 */


public class Jogador {
	public String nome;
	public int idade;
	public String posicao;
	public double poder = 0;
	public double poderPositivo = 0;
	public double poderNegativo = 0;
	public int numCamisa;
	
	//Construtor
	public Jogador(String nome, int idade, int numCamisa, String posicao, double poder) {
		this.nome = nome;
		this.idade = idade;
		this.numCamisa = numCamisa;
		this.posicao = posicao;
		this.poder = poder;
		
	}
	
	//Construtor para Jogador que jogar especificamente na posição meio de campo. (Vide regras da partida)
	public Jogador(String nome, int idade, int numCamisa, String posicao, double poderPositivo, double poderNegativo) {
		this.nome = nome;
		this.idade = idade;
		this.posicao = posicao;
		this.poderPositivo = poderPositivo;
		this.poderNegativo = poderNegativo;
	}
	
	
	//Declaração de métodos Get
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getNumCamisa() {
		return numCamisa;
	}
	
	public String getPosicao() {
		return posicao;
	}
	
	public double getPoder() {
		return poder;
	}
	
	public double[] getMEIPoder() {
		double[] poder = new double[2];
		poder[0] = poderPositivo;
		poder[1] = poderNegativo;
		
		return poder;
	}
	
	//Método get que utiliza como parametro um objeto TextArea para mostrar os atributos do jogador
	public void getAtributosJogador(TextArea area) {
		area.append("Nome:   :" + getNome() + "\n");
		area.append("Idade   :" + getIdade() + "\n");
		area.append("Posicao :" + getPosicao() + "\n");
		
		if(getPosicao().equals("MEI")) {
			area.append("Potencial de Gerar lance de gol  :" + getMEIPoder()[0] + "\n");
			area.append("Potencial em dar Gol Adversário  :" + getMEIPoder()[1] + "\n");
			
		} else {
			area.append("Poder: " + getPoder() + "\n");
		}
		
	}
	
	//Declaração de métodos Set
	public void setIdade(int newIdade) {
		idade = newIdade;
	}
	public void setNumCamisa(int newNumCamisa) {
		numCamisa = newNumCamisa;
	}
	
	public void setPoder(double newPoder) {
		poder = newPoder;
	}
	
	public void setPoderPositivo(double newPoderPositivo) {
		poderPositivo = newPoderPositivo;
	}
	
	public void setPoderNegativo(double newPoderNegativo) {
		poderNegativo = newPoderNegativo;
	}
	
	

}

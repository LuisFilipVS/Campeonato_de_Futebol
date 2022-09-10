package campeonato;

import java.awt.TextArea;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
 * Desenvolvimento da classe Time, responsável pela criação de objetos do tipo Time que vão compor o Campeonato(Coleção de objetos da Classe Time)
 */

public class Time {
	
	int qtDefesa;
	int qtMeio;
	int qtAtaque;
	public String nomeTime, abreviacao;
	public ArrayList<Jogador> elenco ;
	public int[] formacao;
	//HashMap com 4 chaves(GOL,DEF,MEI,ATA) que referencia ArrayLists do tipo Jogador
	public HashMap<String, ArrayList<Jogador>> Jogadores = new HashMap<String, ArrayList<Jogador>>(); //11 Jogadores titulares
	
	public HashMap<String, ArrayList<Jogador>> Titulares = new HashMap<String, ArrayList<Jogador>>(); //Armazena todo o elenco
	
	
	//Construtor
	public Time(String nomeTime, String abreviacao, ArrayList<Jogador> elenco, int[] formacao) {
		this.abreviacao = abreviacao;
		this.nomeTime = nomeTime;
		this.elenco = elenco;
		this.formacao = formacao;
		
		this.criarPosicoesNoMapa(Jogadores);
		this.distribuirJogadores(Jogadores, elenco, false);
		
	}
	
	//Metodos usado no construtor para adicionar os chaves no HashMap
	public void criarPosicoesNoMapa(HashMap<String, ArrayList<Jogador>> mapa) {
		mapa.put("GOL", new ArrayList<Jogador>());
		mapa.put("DEF", new ArrayList<Jogador>());
		mapa.put("MEI", new ArrayList<Jogador>());
		mapa.put("ATA", new ArrayList<Jogador>());
	}
	
	//Metodo usado para distribuir todos os jogadores, de um ArrayList do tipo de Jogador no HashMap elenco(Todos os jogadores, separados pelas suas posições)
	public void distribuirJogadores(HashMap<String, ArrayList<Jogador>> elenco, ArrayList<Jogador> todosJogadores, boolean titulares) {
		if (titulares == true) {
			for(String chave : elenco.keySet()) {
				elenco.get(chave).clear();
			}
			
		}
		for(Jogador jogador : todosJogadores) {
			switch(jogador.getPosicao()) {
				case("GOL"):
					elenco.get("GOL").add(jogador);
					break;
				case("DEF"):
					elenco.get("DEF").add(jogador);
					break;
				case("MEI"):
					elenco.get("MEI").add(jogador);
					break;
				case("ATA"):
					elenco.get("ATA").add(jogador);
					break;
			}
		}
	}
	
	//Metodo utilitário usado para remover um jogador(Objeto da classe jogador) do elenco(HashMap)
	//A remoção não será realizada caso o jogador esteja na coleção de jogadores titulares
	public boolean removerJogador(HashMap<String, ArrayList<Jogador>> elencoTodo, HashMap<String, ArrayList<Jogador>> elencoTitular, Jogador jogador) {
		boolean verificacao = false;
		boolean jogadorTitular = false;
		
		ArrayList<Jogador> temp = elencoTitular.get(jogador.getPosicao());
		for (Jogador player : temp) {
			if (jogador.getNumCamisa() == player.getNumCamisa()){
				//verificacao = false;
				jogadorTitular = true;
				return false;
			}
		}
			if(!jogadorTitular) {
				ArrayList<Jogador> tempElse = elencoTodo.get(jogador.getPosicao());
				for (Jogador playerElse : tempElse) {
					if (jogador.getNumCamisa() == playerElse.getNumCamisa()){
						tempElse.remove(playerElse);
						verificacao = true;
						}	
					}
				}
				
			
		return verificacao;
	}
	
	//Metodo utilitário que recebe como parametro o hashMap com todo o elenco, um TextArea da Janela e uma String com o nome da posição para mostrar
	//o dados dos jogadores da posição específica no textField | Esse método é usado em alguma janela em execução.
	public void mostrarElenco(HashMap<String, ArrayList<Jogador>> elencoTodo, TextArea blocoTexto, String posicao) {
		ArrayList<Jogador> Jogadores = elencoTodo.get(posicao);
		blocoTexto.setText("");
		
		for(Jogador player : Jogadores) {
			player.getAtributosJogador(blocoTexto);
			blocoTexto.append("____________________________________________");
		}
	}
	
	//metodo utilitário que adiona o jogador no HashMap
	public void adicionarJogador(HashMap<String, ArrayList<Jogador>> elenco, Jogador jogador) {
		switch(jogador.getPosicao()) {
		case("GOL"):
			elenco.get("GOL").add(jogador);
			break;
		case("DEF"):
			elenco.get("DEF").add(jogador);
			break;
		case("MEI"):
			elenco.get("MEI").add(jogador);
			break;
		case("ATA"):
			elenco.get("ATA").add(jogador);
			break;
		}
	}
	
	//Atribuição de métodos Gets
	public String getNome() {
		return nomeTime;
	}
	
	public String getAbreviacao() {
		return abreviacao;
	}
	
	public int[] getFormacao() {
		return formacao;
	}
	
	public HashMap<String, ArrayList<Jogador>> getElenco() {
		return Jogadores;
	}
	
	//Atribuição de métodos Sets
	
	public void setNome(String newnome) {
		nomeTime = newnome;
	}
	
	public void setAbrevicao(String newAbrevicao) {
		abreviacao = newAbrevicao;
	}
	
	public boolean setFormacao(int[] newFormacao) {
		if (newFormacao[0] + newFormacao[1] + newFormacao[2] == 10 ) {
			//Titulares.get("DEF").clear(); Ainda não utilizados , A partir de qualquer alteração de formação, o elenco titular é limpado e deve haver a opção de preenché-lo automáticamente ou manualmente.
			//Titulares.get("MEI").clear(); 
			//Titulares.get("ATA").clear();
			formacao = newFormacao;
			return true;
		} else {
			return false;
		}
		
		
	}

}

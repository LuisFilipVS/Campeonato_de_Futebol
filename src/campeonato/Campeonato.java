package campeonato;

import java.util.ArrayList;

/*Classe principal do projeto. Nessa clase haverá os métodos utilizados para a execução de um projeto que vai simular um campeonato onde
 participa uma quantidade especifica de times que vão jogar entre si, por meio de determinados critérios.
 Até o momento, a definição do vecendor de cada partida é baseado em calculos simples de probabilidade.
 
 A classe campeonato trabalha com um coleção de times(Objetos da Classe Time), e este ultimo funciona com uma coleção de jogadores(Objetos da
 classe Jogador). A classe Jogador é o classe primária, e por meio dela, as classes Time e Campeonato, são produzidas. 
 
 O projeto utiliza de elementos oriundos da biblioteca Javax.Swing, no qual propicia os elementos gráficos do projeto.
 */

public class Campeonato {
	public static void main(String[] args) {
		//Instancição da classe Time somente para testar os outro elementos do projeto.
		Time tempTime;
		ArrayList<Jogador> tempElenco  = new ArrayList<Jogador>();
		tempElenco.add(new Jogador("Luis",20, 20, "ATA" , 30 ));
		tempElenco.add(new Jogador("Filipe",23, 32, "ATA" , 40 ));
		tempElenco.add(new Jogador("Vieira",23, 34, "ATA" , 50 ));
		tempElenco.add(new Jogador("Silva",24, 10, "ATA" , 60 ));
		tempElenco.add(new Jogador("Arrascaeta",26, 11, "ATA" , 70 ));
		tempElenco.add(new Jogador("Santos",26, 11, "GOL" , 70 ));
		int[] formTemp = {4,4,2};
		
		tempTime = new Time("Flamengo", "FLA", tempElenco,  formTemp);
		
		//Iniciação da janela de principal de configuração dos elementos do time.
		mainTime frame = new mainTime(tempTime);
		frame.setVisible(true);
		
		
		
	}
}

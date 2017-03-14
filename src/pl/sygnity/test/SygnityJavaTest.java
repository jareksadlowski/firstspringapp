package pl.sygnity.test;

import java.util.List;

import pl.sygnity.test.TreeTraversingTest.Node;
import pl.sygnity.test.util.Player;

/*
 * @author Piotr Pelcer
 */
public class SygnityJavaTest {

	public static void main(String[] args) {
		/*  
		 * Zadanie 1:
		 * Mamy posortowane drzewo binarne, takie jak na obrazku poniżej: 
		 
					        5
					       / \
					      /   \
					     /     \
					    3       9
					   / \     /
					  2   4   7
					 /       / \
					1       6   8
					
		 * Proszę zaimplementować metody inOrder oraz levelOrder w klasie TreeTraversingTest, 
		 * aby drukowały one drzewko na konsolę (System.out.print())
		 * we wskazanej kolejności:
		 * 
		 * metoda inOrder() - przejście poprzeczne (od lewej do prawej)
	 						     prawidłowy wynik: 1 2 3 4 5 6 7 8 9
	 	 * metoda levelOrder() - przejście pionowe (od góry do doły)
	 							 prawidłowy wynik: 5 3 9 2 4 7 1 6 8
	 							 
	 	  Pisanie metod pomocniczych oraz używanie dowolnych rodzajów kolekcji jest DOZWOLONE.
		 */
		
		Node<Integer> tree = TreeTraversingTest.buildTree();
		TreeTraversingTest.wydrukujWynikZadania(tree);
		
		/* 
		 * Zadanie 2:
		 * Mamy bazę piłkarzy players.
		 * 
		 * Proszę stworzyć następujące walidatory typu PlayerValidator:
		 * 1. AgeValidator - weryfikuje, czy zawodnik jest młodszy niż 30 lat
		 * 2. AvarageSkillValidator - weryfikuje czy średnia ze wszystkich umiejętności gracza jest powyżej 50. 
		 * 								UWAGA: Należy wyciągnać średnią arytmetyczną ze wszystkich umiejętności gracza, 
		 * 									   biorąc pod uwagę jego pozycję na boisku. 
		 * 3. QualityValidator - weryfikuje czy:
		 * 								a) bramkarz (GoalKeeper) ma umiejętność łapania piłki (handling) powyżej 70 
		 * 								   oraz umiejętność gry w powietrzu (aerialAbility) powyżej 70,
		 * 								b) zawododnik z pola (FieldPlayer) ma umiejętność podawania (passing) powyżej 50,
		 * 								   oraz technikę (technique) powyżej 50.
		 * 								c) napastnik (Striker) ma umiejętność wykańczania akcji (finishing) co najmniej 80.
		 * 								UWAGA: Proszę zwrócić uwagę na fakt, że każdy napastnik (Striker), 
		 * 									   jest jednocześnie zawodnikiem z pola (FieldPlayer). 
		 * 		
		 * Proszę zaimplementować metodę testPlayers w klasie InheritanceTest.
		 * W tej metodzie należy umieścić instancję każdego z walidatorów w kolekcji(dowolnego typu) oraz zwalidować wszystkich piłkarzy 
		 * używając każdego z walidatorów po kolei. Zawodnicy, którzy zostaną pomyślnie zwalidowali, powinni być umieszczeni w
		 * kolekcjach acceptedKeepers, acceptedFieldPlayers oraz acceptedStrikers w zależności od ich pozycji. 
		 * Wszyscy odrzuceni zawodnicy powinni trafić do mapy rejectedPlayers, gdzie kluczem jest obiekt Player, a wartością ilość oblanych testów.
		 */
		
		InheritanceTest.createPlayerBase();
		InheritanceTest.testPlayers();
		InheritanceTest.wydrukujWynikZadania();
	}
}

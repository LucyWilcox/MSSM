import java.util.Scanner;


public class Table {

	public static void main(String[] args) {

		Deck deck = new Deck(1);
		Player player = new Player(0);
		
		for (int i = 0; i < 5; i++) {
			player.addCard(deck.drawCard());
		}
		
		player.printHand("Player", false);
		
		System.out.println("High Value = " + player.hand.findHighValue());
		
		player.hand.findMultiples();
	}

	
}

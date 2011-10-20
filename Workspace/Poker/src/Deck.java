import java.util.Random;


public class Deck {
	
	Card cards[];
	
	public Deck(int numDecks) {
		
		cards = new Card[52*numDecks];
		
		// initialize the cards
		for (int i = 0; i < 52*numDecks; i++) {
			cards[i] = new Card(((i / 13) % 4)+1, (i % 13)+1);
		}
	}
	
	public Card drawCard() {
		
		Random rnd = new Random();
		int numCards = cards.length;
		int cardNum = rnd.nextInt(numCards);
		
		Card newArray[] = new Card[numCards-1];
		
		int oldIdx = 0;
		int newIdx = 0;
		
		while (newIdx < numCards-1) {
			
			if (oldIdx == cardNum) {
				oldIdx++;
			}

			newArray[newIdx] = cards[oldIdx];
			
			oldIdx++;
			newIdx++;
		}
		
		Card card = cards[cardNum];
		
		cards = newArray;
		
		return card;
	}
}

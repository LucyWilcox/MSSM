
public class Hand {
	
	Card[] cards;
	
	public Hand()
	{
		cards = new Card[0];
	}
	
	public void printHand(String name, boolean hideFirstCard)
	{
		System.out.println(name + ":");
		
		for (int i = (hideFirstCard ? 1 : 0); i<cards.length; i++) {
			System.out.println("  " + cards[i].getFullName());
		}
	}
	
	public void addCard(Card card)
	{
		Card newCards[] = new Card[cards.length+1];
		
		for (int i=0;i<cards.length;i++) {
			newCards[i] = cards[i];
		}
		
		newCards[newCards.length-1] = card;
		
		cards = newCards;
	}
	
	public int numCards()
	{
		return cards.length;
	}
	
	public int getValueForBlackjack()
	{
		int sum = 0;
		
		boolean haveAce = false;
		
		for (int i=0;i<numCards();i++) {
			sum += cards[i].getValue();
			
			if (cards[i].isAce())
			{
				haveAce = true;
			}
		}
		
		if (haveAce && sum <= 11) {
			sum = sum + 10;
		}
		
		return sum;
	}
	
	public int findHighValue()
	{
		int highValue = 0;
		for (int i = 0; i < cards.length; i++) {
			if (cards[i].getPokerValue() > highValue) {
				highValue = cards[i].getPokerValue();
			}
		}
		
		return highValue;
	}
	
	public void findMultiples()
	{
		int count[] = new int[13];
		int howmany=0;
		String name="";
		
		for(int i=1; i<=13;i++){
			
			for(int j=0; j<cards.length; j++){
				
				int num=cards[j].number;
				
				if(i==num){
					count[i-1]++;
				
					
					
				}
				
				
			}	
	
			
			name=Card.getValueName(i);
			howmany=count[i-1];
			if(howmany>1){
			System.out.println("You have: "+howmany+" "+ name +"'s");
			}
		}
		
		
	}
}
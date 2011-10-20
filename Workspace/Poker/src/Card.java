
public class Card {

	static String[] suitNames = { "Clubs", "Spades", "Hearts", "Diamonds" };
	static String[] valueNames = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
	
	// 1 - clubs, 2 - spades, 3 - hearts, 4 - diamonds
	int suit;
	
	// 1 - 13
	int number;
	
	public Card(int suit, int number) {
		this.suit = suit;
		this.number = number;
	}
	
	public String getSuitName()
	{
		return suitNames[suit-1];
	}
	
	public String getValueName()
	{
		return valueNames[number-1];
	}

	public static String getValueName(int cardnum){
		return valueNames[cardnum-1];
	}
	public String getFullName()
	{
		return getValueName() + " of " + getSuitName();
	}
	
	public int getValue()
	{
		return (number < 10) ? number : 10;
	}
	
	public int getPokerValue()
	{
		if (number == 1)
		{
			return 14;
		}
		return number;
	}
	
	public boolean isAce()
	{
		return number == 1;
	}
}

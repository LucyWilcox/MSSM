
public class Player {

	Hand hand = new Hand();
	int  money;
	
	public Player(int startingMoney)
	{
		money = startingMoney;
	}
	
	public void resetHand()
	{
		hand = new Hand();
	}
	
	public void addCard(Card card)
	{
		hand.addCard(card);
	}
	
	public void printHand(String name, boolean hideFirstCard)
	{
		hand.printHand(name, hideFirstCard);
	}
	
	public boolean isBusted()
	{
		return hand.getValueForBlackjack() > 21;
	}
	
	public void adjustMoney(int amount)
	{
		money = money + amount;
	}
}

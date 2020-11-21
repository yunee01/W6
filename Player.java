//base or parent or superclass
public class Player
{
	//way 1 is use super in child class and maintain private
	/*private String name;
	private double totalCashInHand;
	private Token selectedToken;*/

	//way 2 is change private to protected and give privilage to child
	protected String name;
	protected double totalCashInHand;
	protected Token selectedToken; 

	public Player() 
	{}

	public Player(String name, Token selectedToken)
	{
		this.name = name;
		this.selectedToken = selectedToken;
		totalCashInHand = 500_000;
	}

	public void updateTotalCashInHand(double totalCashInHand)
	{
		this.totalCashInHand += totalCashInHand;
	}

	public String toString()
	{
		return "Player name " + name
		+ " with token " + selectedToken
		+ " has RM " + totalCashInHand; 
	}
}
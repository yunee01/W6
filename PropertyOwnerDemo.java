//derive or child or subclass
public class PropertyOwnerDemo
{
	private String name;
	private double totalCashInHand;
	private Token selectedToken;
	private String ownedProperty;

	public PropertyOwnerDemo() 
	{}

	public PropertyOwnerDemo(String name, Token selectedToken)
	{
		this.name = name;
		this.selectedToken = selectedToken;
		totalCashInHand = 500_000;
		ownedProperty = "no property yet"; //extra
	}

	//extra
	public void buyProperty(String ownedProperty)
	{
		this.ownedProperty = ownedProperty;
	}

	public void updateTotalCashInHand(double totalCashInHand)
	{
		this.totalCashInHand += totalCashInHand;
	}

	public String toString()
	{
		return "Player name " + name
		+ " with token " + selectedToken
		+ " has RM " + totalCashInHand
		+ " and has " + ownedProperty; //extra
	}
}

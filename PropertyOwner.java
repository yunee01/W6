//derive or child or subclass
public class PropertyOwner extends Player
{
	private String ownedProperty;

	public PropertyOwner() 
	{}

	public PropertyOwner(String name, Token selectedToken)
	{
		super(name, selectedToken);
		ownedProperty = "no property yet"; //extra
	}

	//extra
	public void buyProperty(String ownedProperty)
	{
		this.ownedProperty = ownedProperty;
	}

	@Override
	public void updateTotalCashInHand(double totalCashInHand)
	{
		//this.totalCashInHand += totalCashInHand;
		//call the public method in parent
		//super.updateTotalCashInHand(totalCashInHand); //way 1 call method
		super.totalCashInHand += totalCashInHand; //way 2 call field 
	}

	public String toString()
	{
		/*return "Player name " + name
		+ " with token " + selectedToken
		+ " has RM " + totalCashInHand*/

		//access public member in parent
		return super.toString()
		+ " and has " + ownedProperty; //extra
	}
}

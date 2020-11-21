public class MonopolyGame
{
	public static void main(String[] args)
	{
		Token wheelbarrow = new Token("Wheelbarrow", "Blue");
		wheelbarrow.updatePosition(5);
		System.out.println(wheelbarrow);
		Player p1 = new Player("Yunee", wheelbarrow);
		System.out.println(p1);
		PropertyOwnerDemo po1 = new PropertyOwnerDemo("Yunee", wheelbarrow);
		System.out.println(po1);

		/*System.out.println();

		Token hat2 = new Token("Hat2", "Yellow");
		PropertyOwnerDemo po2 = new PropertyOwnerDemo("Mannie", hat2);
		po2.buyProperty("Mydin Sdn. Bhd.");
		System.out.println(po2);*/

		System.out.println();
		
		Token hat = new Token("Hat", "Blue");
		PropertyOwner po3 = new PropertyOwner("Lucky", hat);
		po3.buyProperty("Lyfe Enterprise");
		System.out.println(po3);

		Token car = new Token();
	}
}
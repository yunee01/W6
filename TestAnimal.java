public class TestAnimal
{
	public static void main(String[] a)
	{
		//Animal a1 = new Animal();
		//a1.speak();

		Haiwan h = new Haiwan();
		h.setName("New Species");
		System.out.println(h.getName());


		Cat c = new Cat();
		c.bunyi();
		c.speak();
		c.setName("Tom");
		System.out.println(c.getName());


		Mouse m = new Mouse();
		m.setName("Jerry");
		System.out.println(m.getName());
		m.speak();


		CartoonCat garfield = new CartoonCat();
		garfield.setName("Garfield");
		System.out.println(garfield.getName());
		garfield.speak();
		garfield.screenTime("Garfield Home Alone");
		System.out.println("Pay is " + garfield.pay(10));
		garfield.screenTime2("Garfield Home Alone The Sequel");
		System.out.println("Pay is " + garfield.pay2(20));
	}
}
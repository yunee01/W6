public abstract class Animal
{
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	//tukar jadi abstract method
	//siapa guna class Animal mesti guna method abstract
	public abstract void speak();
	
}

// public class Animal
// {
// 	private String name;

// 	public String getName()
// 	{
// 		return name;
// 	}

// 	public void setName(String name)
// 	{
// 		this.name = name;
// 	}

// 	public void speak()
// 	{
// 		System.out.println("Animal Sound");
// 	}
// }
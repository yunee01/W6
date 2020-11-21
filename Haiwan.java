public final class Haiwan
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
	//siapa guna class Animal mesti guna method abstracts
	public void speak()
	{
		System.out.println("Saya cakap bahasa manusia");
	}
	
}
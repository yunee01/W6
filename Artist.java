public class Artist implements InterfaceCelebrity
{
	public void screenTime(String episode)
	{
		int job = 0;
		job++;
		System.out.println(episode + " Job Ke " + job);
	}
	public double pay(int hour)
	{
		return hour * 1.5;
	}
}
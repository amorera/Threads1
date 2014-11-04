


public class jobs
{
	private static int numJobs;	
	private int id, pID;
		
	public jobs(int pid)
	{
		numJobs++;
		id = numJobs;
		pID=pid;
	}
	
	public int getJobID()
	{
		return id;
	}
	
	public int getPID()
	{
		return pID;
	}
}

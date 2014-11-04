import java.util.ArrayList;


public class JobList
{
	private ArrayList<jobs> list;
	
	public JobList()
	{
		list = new ArrayList<jobs>();
	}

	public void addJob(jobs j)
	{
		list.add(j);
	}
	
	public void addJob(jobs[] ja)
	{
		for(jobs j: list)
			list.add(j);
	}
	
	public int getNumJobs()
	{
		return list.size();
	}
	
	public jobs removeJob()
	{
		if(list.size() > 0)
		{
			jobs took = list.remove(0);
			System.out.println("Person " + took.getPID() + " printing job " + took.getJobID());
			return took;
		}
		else
			return null;
	}

	public boolean hasJobs()
	{
		return list.size() > 0;
	}
	
	
}


public class printer implements Runnable
{
	private JobList jl;
	
	public printer()
	{
		jl=new JobList();
	}
	
	public void run()
	{
		while(true)
		{
			
			if(jl.hasJobs())
			{
				jobs taken = jl.removeJob();
			}
			
			this.wait(2000);
		
		}
	}

	
	public void add(jobs j)
	{
		jl.addJob(j);
	}
	
	public void wait(int i)
	{
		try 
		{
			Thread.sleep( i );			// someDuration is some number of milliseconds
		}
		catch( InterruptedException e ) 
		{
			e.printStackTrace();
		}
	}
	
}

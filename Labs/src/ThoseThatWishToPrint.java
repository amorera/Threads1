import java.util.ArrayList;


public class ThoseThatWishToPrint implements Runnable
{
	private static int numOfPeople;	
	private int id;
	private printer printer;

	public ThoseThatWishToPrint(printer x)
	{
		numOfPeople++;
		id = numOfPeople;
		printer =x;
	}
		
	public int getID()
	{
		return id;
	}
	

	public void wait(int i)
	{
		try 
		{
			Thread.sleep( i );			
		}
		catch( InterruptedException e ) 
		{
			e.printStackTrace();
		}
	}
	
	public void run()
	{
		
		while(true)
		{
			
			//make cookies, add to cookie jar
			jobs newJob = new jobs(this.getID());
						
			printer.add(newJob);
			//rest for a random amount of time
			try
			{
				Thread.sleep(5000 + (int)(Math.random()*16000) );
			}
			catch(InterruptedException chase)
			{
				chase.printStackTrace();
			}
			
		}
		
	}
}
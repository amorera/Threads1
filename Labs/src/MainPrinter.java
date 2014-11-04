
public class MainPrinter
{
	private printer p;
	
	private ThoseThatWishToPrint[] people;
	
	public MainPrinter()
	{
		p = new printer();
		Thread printThread = new Thread(p);
		printThread.start();
				
		people = new ThoseThatWishToPrint[3];
		
		for(int i = 0; i < 3; i++)
		{
			people[i] = new ThoseThatWishToPrint(p);
			new Thread(people[i]).start();
			
		}
		
		
		
	}
	
	
	public static void main(String[] args)
	{
		new MainPrinter();
	}
}


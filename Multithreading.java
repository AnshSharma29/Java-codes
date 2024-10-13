package test;

class ThreadDemo implements Runnable
{
	Thread t;
	
	ThreadDemo(String name)
	{
		t=new Thread(this,name);
		t.start();
		
	}

	public void run() 
	{
		for(int i=1;i<=26;i++)
		{
			System.out.println(t.getName()+"\t"+i);
			
			try {
				
				Thread.sleep(500);
			} catch(InterruptedException e) {
				
				e.printStackTrace();
			
				
			}
			
			
		}	
		
	}
	
	

}

public class Demo {
	
	public static void main (String[] args) {
		
		ThreadDemo ob1=new ThreadDemo("Ansh");
		ThreadDemo ob2=new ThreadDemo("Krishna");

	}

}

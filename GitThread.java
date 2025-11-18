import java.util.*;



public class GitThread implements Runnable
{
	private long count;

	public GitThread()
	{

	}

	@Override
	public void run()
	{
		while(count < 10000000)
		{
			count++;
		}
		System.out.println(count);
	}


	public static void main(String[] args)
	{
		Thread[] threads = new Thread[1000];

		for(int i = 0; i < threads.length; i++)
		{
			threads[i] = new Thread(new GitThread());
			threads[i].start();
		}
	}
}
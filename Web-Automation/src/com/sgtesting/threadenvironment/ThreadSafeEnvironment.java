package com.sgtesting.threadenvironment;
class MyThreadSafe implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	synchronized void displayEvenNumbers()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(2000);
					System.out.println(Thread.currentThread().getName()+"Display Even Numbers:"+i);
				}
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
public class ThreadSafeEnvironment {

	public static void main(String[] args) {
		MyThreadSafe job=new MyThreadSafe();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);	
		t1.setName("alpha");
		t2.setName("omegha");
		t1.start();
		t2.start();

	}

}

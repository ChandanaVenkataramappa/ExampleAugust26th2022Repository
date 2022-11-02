package com.sgtesting.threadenvironment;
class MyThreaMulti implements Runnable
{
	public void run()
	{
		displayEvenNumbers();
	}
	void displayEvenNumbers()
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
public class MultiThreadClass {

	public static void main(String[] args) {
		MyThreaMulti job=new MyThreaMulti();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);	
		t1.setName("alpha");
		t2.setName("omegha");
		t1.start();
		t2.start();

	}

}

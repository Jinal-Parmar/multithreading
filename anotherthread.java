class another extends Thread{

public void run()
	{
		for (int i=6;i>0 ; i--) {
			System.out.println("another"+i);
			try
			{Thread.sleep(2000);}
			catch(Exception e){}
		}
	}

}
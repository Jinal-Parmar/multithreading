class mythread implements Runnable
{  
	public void run()
	{
		for (int i=0;i<6 ; i++) {
			System.out.println(i);
			try
			{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}

	 public static void main(String[] args) {
		
		mythread t=new mythread();
		Thread th=new Thread(t);
		another t2=new another();
		 th.start();
		 t2.start();
	}
  

}

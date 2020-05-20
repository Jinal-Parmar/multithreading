class main{

public static void main(String[] args) {
   
    company com=new company();
    producer p=new producer(com);
    consumer c=new consumer(com);
		p.start(); c.start();
	}
}
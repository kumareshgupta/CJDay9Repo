package com.manipal.thread.demo.day9;

class YourThread implements Runnable{

	@Override
	public void run() {
		try {
			for(int i = 0; i<10; i++) {
				System.out.println(Thread.currentThread().getName()+" - " + i);
				Thread.sleep(1000);
			} 
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

public class RunnableDemo {
	public static void main(String[] args) {	
				
		Thread thread1 = new Thread(new YourThread(), "ThreadOne");		
		thread1.start();
		
		Thread thread2 = new Thread(new YourThread(), "ThreadTwo");		
		thread2.start();
		
		System.out.println(thread1.isAlive());
		
		
		
		
	}

}

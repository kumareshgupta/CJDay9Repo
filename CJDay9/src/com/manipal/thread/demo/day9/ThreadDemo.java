package com.manipal.thread.demo.day9;

class MyThread extends Thread {
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		try {
			for(int i = 0; i<10; i++) {
				System.out.println(this.getName() +" - " + i);
				//Thread.sleep(1000);
			} 
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}	
}

public class ThreadDemo {
	public static void main(String[] args) {
		System.out.println("inside main thread.....");
		MyThread myThread1 = new MyThread("ThreadOne");
		MyThread myThread2 = new MyThread("ThreadTwo");
		
		myThread2.setPriority(Thread.MAX_PRIORITY);
		myThread1.setPriority(Thread.MIN_PRIORITY);
		
		myThread1.setPriority(0); //IllegalArgumentException
		
		myThread1.start(); //internally start method calls run method		
		myThread2.start(); //internally start method calls run method
		
		
		
		System.out.println("main thread ends....");
	}

}

package com.manipal.thread.demo.day9;

class Series{
	  void printSeries(int min, int max) {
		for(int i = min; i<=max; i++) {
			System.out.println(i);			
		}
	}
}

class SeriesThread extends Thread{
	int min; 
	int max;
	Series series;
	SeriesThread(Series series, int min, int max){
		this.series=series;
		this.min = min;
		this.max = max;
	}
	
	public void run() {
		synchronized(series) {
			series.printSeries(min, max);
		}
	}
}



public class ThreadSynchronizationDemo {
	public static void main(String[] args) {
		Series series = new Series();
		SeriesThread thread1= new SeriesThread(series,1,5);
		SeriesThread thread2= new SeriesThread(series,100,105);
		thread1.start();
		thread2.start();
	}

}

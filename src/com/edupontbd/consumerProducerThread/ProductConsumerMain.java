package com.edupontbd.consumerProducerThread;

public class ProductConsumerMain {

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;
		final SharedQueue<Product>sharedQueue = new SharedQueue<>(SIZE);
		
		
		//instantiating producer and consumer thread
		Thread producerThread = new Thread(new Producer(sharedQueue), "Producer");
		Thread consumerThread = new Thread(new Consumer(sharedQueue), "Consumer");
		//fring off  threads
		producerThread.start();
		consumerThread.start();
	}

}

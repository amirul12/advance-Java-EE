package com.edupontbd.consumerProducerThread;

public class Producer implements Runnable {
	private SharedQueue<Product> sharedBuffer;
	
	public Producer(SharedQueue<Product> sharedQueue){
		this.sharedBuffer = sharedQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10 ; i++) {
			try {
				produce(new Product(i));
				System.out.println("Produced: "+ i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	private void produce(Product product) throws InterruptedException{
		// TODO Auto-generated method stub
		
		//wait id buffer is full
		
		while(sharedBuffer.isEmpty()){
			synchronized (sharedBuffer) {
				System.out.println("Buffer is full."+ Thread.currentThread().getName()+" is waiting....");
				sharedBuffer.wait();
				
			}
		}
		
		//otherwise produce and notify consumers 
		synchronized (sharedBuffer) {
			sharedBuffer.add(product);
			sharedBuffer.notifyAll();
			
		}
		
	}
	
}
 	
 

	 
 
 

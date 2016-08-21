package com.edupontbd.consumerProducerThread;

public class Consumer implements Runnable{
	
	private SharedQueue<Product> shareBuffer;
	 public Consumer(SharedQueue<Product>sharedQueue){
		 this.shareBuffer = sharedQueue;
	 }
	 
	 

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			
			try {
			System.out.println("Consumerd: " +consumer());
			
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}



	private int consumer() throws InterruptedException{
		// TODO Auto-generated method stub
		while (shareBuffer.isEmpty()) {
			synchronized (shareBuffer) {
				System.out.println("Buffer is empty."+Thread.currentThread().getName()+"is waiting...");
				shareBuffer.wait();
				
			}
		}
		//otherwise consum 
		synchronized (shareBuffer) {
			shareBuffer.notifyAll();
			return shareBuffer.remove().getId(); 
			
		}
	}

}

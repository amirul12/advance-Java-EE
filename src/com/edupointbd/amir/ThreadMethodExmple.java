package com.edupointbd.amir;

public class ThreadMethodExmple extends Thread{
	
	private String threadName;
	
	public ThreadMethodExmple(String thredName){
		this.threadName= thredName;
		
		System.out.println("Creating Thread "+thredName);
	}
	
	
	@Override
	public void run(){
		System.out.println("Running "+threadName);
		
		try {
			for (int i = 4; i >= 0  ; i--) {
				System.out.println("Count "+i);
				sleep(50);
				
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Thread "+ threadName+ "interaupted");
		}
		
		System.out.println("Thread "+threadName+" Exixting");
	}
	
	
	@Override
	public void start(){
		System.out.println("Starting Thread "+threadName);
		super.start();
	}
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadMethodExmple threadMethodExmple = new ThreadMethodExmple("Demo Thread");
		threadMethodExmple.start();
		
		

	}
}



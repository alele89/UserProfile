package com.bosch.aa.cose.generator.starter;

public class CarDataGenerator{
	
public static void main(String[] args) {
		  
		int numberOfCars; 
		int heartBeat;
		numberOfCars = Integer.parseInt(args[0]);
		heartBeat = Integer.parseInt(args[1]);
		
		for(int i=0;i<numberOfCars;i++){
			Thread thread = new Thread(new DataGeneratorThread(heartBeat));
			thread.start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(true){
		//	System.out.println("Main Loop kept Alive");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
  }
}

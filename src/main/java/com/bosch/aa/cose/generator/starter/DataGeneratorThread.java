package com.bosch.aa.cose.generator.starter;

import com.bosch.aa.cose.generator.builder.MessageBuilder;
import com.bosch.aa.cose.generator.client.FleetBackendClient;
import com.bosch.aa.cose.generator.model.Message;
import com.google.gson.Gson;

public class DataGeneratorThread implements Runnable {

	FleetBackendClient client = new FleetBackendClient();

	int hrtBeat;
	
	public DataGeneratorThread(int heartBeat){
		this.hrtBeat = heartBeat; 
	}
	public void run() {
		
		MessageBuilder builder = new MessageBuilder();
		Long imsi = builder.numbGen();
		while(true)
		{
			try {
				Message msg = builder.getGeneratedMessage(imsi);
				//serialize the msg object and convert to json.
				Gson gson = new Gson();
		        String json = gson.toJson(msg);
				client.send(json);
				Thread.sleep(hrtBeat);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.bosch.aa.cose.generator.builder;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.bosch.aa.cose.generator.model.Acceleration;
import com.bosch.aa.cose.generator.model.CarData;
import com.bosch.aa.cose.generator.model.Gps;
import com.bosch.aa.cose.generator.model.Gyroscope;
import com.bosch.aa.cose.generator.model.Message;
import com.bosch.aa.cose.generator.model.MessageData;

public class MessageBuilder {

	public Message getGeneratedMessage(Long imsi){
		
		Message msg = new Message();
		msg.setImsi(imsi);
		msg.setEvent("cyclic");
		msg.setUtc(getUtcTime());
		msg.setData(generateMessageData());
		return msg;
	}

	
	
	public long numbGen() {
	    while (true) {
	        long numb = (long)(Math.random() * 100000000 * 1000000); 
	        numb = numb *10;
	        if (String.valueOf(numb).length() == 15)
	            return numb;
	    }
	}
	
	private long getUtcTime(){
		Long utctime = System.currentTimeMillis();
		return utctime;
	}
	
	private List<List<MessageData>> generateMessageData()
	{
		List<List<MessageData>> combinedMessageDataList = new ArrayList<List<MessageData>>();
		for(int i=0;i<getRandomInt(1, 4);i++)
		{
	      combinedMessageDataList.add(getGeneratedMessageDataList());
		}
		return combinedMessageDataList;
	}
	
	private ArrayList<MessageData> getGeneratedMessageDataList()
	{
		ArrayList<MessageData> msgDataList = new ArrayList<MessageData>();
	    msgDataList.add(getCarData());
		msgDataList.add(getUtcData());
		msgDataList.add(getGyrData());
		msgDataList.add(getAccData());
		msgDataList.add(getGpsData());
		return msgDataList;
	}
	
	
    private MessageData getUtcData()
    {
    	MessageData msgData = new MessageData();
    	msgData.setUtc(getUtcTime());
    	return msgData;
    }
	
    private MessageData getGpsData()
    {
    	Gps gps = new Gps();
    	gps.setLat(getRandonDouble(-90.0000, 90.0000,"#.####"));
    	gps.setLng(getRandonDouble(-180.0000, 180.0000,"#.####"));
    	gps.setAlt(getRandonDouble(0.0, 8000.0,"#.#"));
    	gps.setPrec(getRandonDouble(0.0,99.9,"#.##"));
    	gps.setSat(0);
    	MessageData msgData = new MessageData();
    	msgData.setGps(gps);
    	return msgData;
    }
    
    private MessageData getAccData()
    {

		MessageData msgData = new MessageData();
        Acceleration acc = new Acceleration();
        acc.setX(getRandonDouble(-2.00, 2.00,"#.##"));
        acc.setY(getRandonDouble(-2.00, 2.00,"#.##"));
        acc.setZ(getRandonDouble(-2.00, 2.00,"#.##"));
        msgData.setAcceleration(acc);
    	return msgData;
    }
    
    
    private MessageData getGyrData()
    {
		MessageData msgData = new MessageData();
        Gyroscope gyr = new Gyroscope();
        gyr.setX(getRandonDouble(-2.00, 2.00,"#.##"));
        gyr.setY(getRandonDouble(-2.00, 2.00,"#.##"));
        gyr.setZ(getRandonDouble(-2.00, 2.00,"#.##"));
        msgData.setGyroscope(gyr);
    	return msgData;
    }
	
	private MessageData getCarData()
	{
		ArrayList<CarData> carDataList = new ArrayList<CarData>();
		for(int j=0;j<getRandomInt(1, 4);j++)
		{
			CarData carData = new CarData();
			carData.setAvid(getRandomInt(1,6));
			ArrayList<Integer> valueList = new ArrayList<Integer>();
			for(int i=0;i<getRandomInt(1, 4);i++)
			{
			  valueList.add(getRandomInt(1, 999));
			}
			carData.setValue(valueList);
			carDataList.add(carData);
     	} 
		MessageData msgData = new MessageData();
		msgData.setCarData(carDataList);
		return msgData;
	}
	
	private int getRandomInt(int min,int max)
	{
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
	private double getRandonDouble(double min,double max,String format)
	{
		  Random random = new Random();
	      double range = max - min;
		  double scaled = random.nextDouble() * range;
		  double shifted = scaled + min;
		  DecimalFormat df = new DecimalFormat(format);
		  df.setRoundingMode(RoundingMode.DOWN);
		  String formattedDouble = df.format(shifted);
		  return Double.parseDouble(formattedDouble);	   
	}

//	private MessageData getMessageData()
//	{
//		MessageData msgData = new MessageData();
//		msgData.setAcceleration(acceleration);
//		msgData.setGps(gps);
//		msgData.setGyroscope(gyroscope);
//		msgData.setCarData(getCarData());
//		msgData.setUtc(getUtcTime());
//		return msgData;
//	}
}

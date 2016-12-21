import com.bosch.aa.cose.generator.builder.MessageBuilder;
import com.bosch.aa.cose.generator.model.*;
import com.google.gson.*;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by rlp8fe on 25.10.2016.
 */
public class TestJsonSerialization {

    @Test
    public void canSerializeSampleMessage() {

        Message message = new Message()
                .withEvent("cyclic")
                .withImsi(204046202343284l)
                .withUtc(1466682433)
                .withData(Arrays.asList(Arrays.asList(
                        new MessageData()
                                .withUtc(1234567890),
                        new MessageData()
                                .withGps(new Gps()
                                        .withLat(0.0000)
                                        .withLng(0.0000)
                                        .withAlt(0.0)
                                        .withSat(0)
                                        .withPrec(99.99)),
                        new MessageData()
                                .withCarData(Arrays.asList(
                                        new CarData()
                                                .withAvid(1)
                                                .withValue(Arrays.asList(12)),
                                        new CarData()
                                                .withAvid(3)
                                                .withValue(Arrays.asList(34)),
                                        new CarData()
                                                .withAvid(4)
                                                .withValue(Arrays.asList(123)),
                                        new CarData()
                                                .withAvid(5)
                                                .withValue(Arrays.asList(234, 123))
                                )),
                        new MessageData()
                                .withAcc(new Acceleration()
                                        .withX(-0.37)
                                        .withY(1.65)
                                        .withZ(-1.77)),
                        new MessageData()
                                .withGyr(new Gyroscope()
                                        .withX(0.12)
                                        .withY(0.96)
                                        .withZ(-0.04))
                        ),
                        Arrays.asList(
                                new MessageData()
                                        .withUtc(2345678901l),
                                new MessageData()
                                        .withGps(new Gps()
                                                .withLat(0.0000)
                                                .withLng(0.0000)
                                                .withAlt(0.0)
                                                .withSat(0)
                                                .withPrec(99.99)),
                                new MessageData()
                                        .withCarData(Arrays.asList(
                                                new CarData()
                                                        .withAvid(1)
                                                        .withValue(Arrays.asList(123)),
                                                new CarData()
                                                        .withAvid(3)
                                                        .withValue(Arrays.asList(234)),
                                                new CarData()
                                                        .withAvid(4)
                                                        .withValue(new ArrayList<>()),
                                                new CarData()
                                                        .withAvid(5)
                                                        .withValue(new ArrayList<>())
                                        )),
                                new MessageData()
                                        .withAcc(new Acceleration()
                                                .withX(-0.37)
                                                .withY(1.65)
                                                .withZ(-1.77)),
                                new MessageData()
                                        .withGyr(new Gyroscope()
                                                .withX(0.12)
                                                .withY(0.96)
                                                .withZ(-0.04))
                        )));

        Gson gson = new Gson();
        String json = gson.toJson(message);

        String expected = TestUtils.readJsonSnippet("messages/cyclic-message.json");

        System.out.println("Expected:" + expected);
        System.out.println("Actual:  " + json);

        assertEquals(expected, json);
    }
    
    @Test
    public void canBuildMessageDataTest()
    {
    	MessageBuilder builder = new MessageBuilder();
		Long imsi = builder.numbGen();
		Message msg = builder.getGeneratedMessage(imsi);
		Gson gson = new GsonBuilder()
				.create();
		String json=null;
		 try {
	      	json = gson.toJson(msg,Message.class);
	        assertNotNull("should not be null", json);

	      } catch(com.google.gson.JsonSyntaxException ex) { 
	    	    assertNull("should be null",json);
	      }
		System.out.println(json);
		
    }
    
   
}

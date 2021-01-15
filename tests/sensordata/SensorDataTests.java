package sensordata;

import org.junit.Test;
import org.junit.Assert;

import java.io.*;

public class SensorDataTests {
    public static final long TIMESTAMP = 010203040;
    public static float VALUE = 0.3f;
    public static String SENSORNAME = "sensorname";
    public static OutputStream os;
    public static  InputStream is;

    @Test()
    public void goodTest() throws IOException {

        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        SensorDataSender sensorDataSender = new SensorDataSend();
        sensorDataSender.sendSensorData(s, os);

        SensorDataReceiver sensorDataReceiver = new SensorDataReceive();
        SensorData receivedData = sensorDataReceiver.receiveSensorData(is);

        Assert.assertEquals(s.getTimeStamp(), receivedData.getTimeStamp());
        Assert.assertEquals(s.getValue(), receivedData.getValue(), 0001);
        Assert.assertEquals(s.getSensorName(), receivedData.getSensorName());
    }

    @Test()
    public void badTest1() throws IOException {

        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        SensorDataSender sensorDataSender = new SensorDataSend();
       // data cannot be null
        sensorDataSender.sendSensorData(null, os);

        SensorDataReceiver sensorDataReceiver = new SensorDataReceive();
        SensorData receivedData = sensorDataReceiver.receiveSensorData(is);

    }

    @Test()
    public void badTest2() throws IOException {

        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        SensorDataSender sensorDataSender = new SensorDataSend();
        // outputstream cannot be null
        sensorDataSender.sendSensorData(null, null);

        SensorDataReceiver sensorDataReceiver = new SensorDataReceive();
        SensorData receivedData = sensorDataReceiver.receiveSensorData(is);

    }

}

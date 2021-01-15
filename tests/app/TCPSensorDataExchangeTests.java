package app;


import org.junit.Assert;
import org.junit.Test;
import app.TCPSensorDataExchangeImpl;
import app.TCPSensorDataExchanger;
import sensordata.SensorData;
import sensordata.SensorDataImpl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TCPSensorDataExchangeTests {
    public static final int PORTNUMBER = 5555;
    public static final String HOST = "localhost";
    public static final long TIMESTAMP = 010203040;
    public static float VALUE = 0.3f;
    public static String SENSORNAME = "sensorname";



    @Test
    public void goodTCPDataExchangerTest() throws IOException {
        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        TCPSensorDataExchanger tcpSensorDataExchanger = new TCPSensorDataExchangeImpl();

        tcpSensorDataExchanger.sendSensorData2host(s, HOST, PORTNUMBER );

       SensorData receivedData = tcpSensorDataExchanger.receiveSensorDataFromClient(PORTNUMBER);

        Assert.assertEquals(s.getTimeStamp(), receivedData.getTimeStamp());
        Assert.assertEquals(s.getValue(), receivedData.getValue(), 0001);
        Assert.assertEquals(s.getSensorName(), receivedData.getSensorName());

    }

    @Test(expected=Exception.class)
    public void badTCPDataExchangerTest1() throws IOException {
        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        TCPSensorDataExchanger tcpSensorDataExchanger = new TCPSensorDataExchangeImpl();

        // hostname cannot be null
        tcpSensorDataExchanger.sendSensorData2host(s, null, PORTNUMBER );

        SensorData receivedData = tcpSensorDataExchanger.receiveSensorDataFromClient(PORTNUMBER);

        Assert.assertEquals(s.getTimeStamp(), receivedData.getTimeStamp());
        Assert.assertEquals(s.getValue(), receivedData.getValue(), 0001);
        Assert.assertEquals(s.getSensorName(), receivedData.getSensorName());

    }

    @Test(expected=Exception.class)
    public void badTCPDataExchangerTest2() throws IOException {
        SensorData s = new SensorDataImpl(TIMESTAMP, VALUE, SENSORNAME);

        TCPSensorDataExchanger tcpSensorDataExchanger = new TCPSensorDataExchangeImpl();

        // data cannot be null
        tcpSensorDataExchanger.sendSensorData2host(null, HOST, PORTNUMBER );

        SensorData receivedData = tcpSensorDataExchanger.receiveSensorDataFromClient(PORTNUMBER);

        Assert.assertEquals(s.getTimeStamp(), receivedData.getTimeStamp());
        Assert.assertEquals(s.getValue(), receivedData.getValue(), 0001);
        Assert.assertEquals(s.getSensorName(), receivedData.getSensorName());

    }




}

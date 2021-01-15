package app;

import sensordata.SensorData;
import app.TCPSensorDataExchanger;

import java.io.IOException;

public class TCPSensorDataExchangeImpl implements TCPSensorDataExchanger {
    @Override
    public void sendSensorData2host(SensorData data, String hostname, int port) throws IOException{


    }

    @Override
    public SensorData receiveSensorDataFromClient(int port) throws IOException{
        return null;
    }
}

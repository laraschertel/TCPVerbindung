package app;

import sensordata.SensorData;

import java.io.IOException;

public interface TCPSensorDataExchanger {
    /**
     * Send sensor data to a specified host
     * @param data
     * @param hostname
     * @param port
     */
    void sendSensorData2host(SensorData data, String hostname, int port) throws IOException;

    /**
     * Listen on a port and receive sensor data
     * @param port
     */
    SensorData receiveSensorDataFromClient(int port) throws IOException;

}

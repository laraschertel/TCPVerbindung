package tcp;

import sensordata.SensorData;

import java.io.IOException;
import java.io.OutputStream;

public interface Client {

    /**
     * creates a connection to a host
     * @param hostname
     * @param port
     * @return
     * @throws IOException
     */
    Connection connect2Host(String hostname, int port) throws IOException;
}

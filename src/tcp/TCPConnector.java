package tcp;

import sensordata.SensorData;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPConnector implements Client, Server, Connection {
    private Socket socket;

    @Override
    public Connection connect2Host(String hostname, int port) throws IOException {
        return null;
    }

    @Override
    public Connection acceptConnection(int port) throws IOException {
        return null;
    }



    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;
    }

}

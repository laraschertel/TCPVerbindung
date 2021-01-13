package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public interface Server {
    /**
     * server accepts the connection request from the client
     *
     * @param port
     * @return
     */
    Connection acceptConnection(int port) throws IOException;
}

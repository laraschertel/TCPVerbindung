package tcp;

import java.io.IOException;

public interface Server {

    /**
     * Listen on a port and accepts the connection request
     * @param port
     */
    Connection acceptConnection(int port) throws IOException;

}

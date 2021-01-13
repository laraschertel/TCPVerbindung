package tcp;

import java.io.IOException;
import java.net.Socket;

public interface Client {
    /**
     * creates a socket
     * @param localhost
     * @param port
     * @return
     */
    Connection connect(String localhost, int port) throws IOException;
}

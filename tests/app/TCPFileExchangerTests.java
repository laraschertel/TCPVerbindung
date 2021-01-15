package app;

import org.junit.Test;

import java.io.IOException;

public class TCPFileExchangerTests {
    public static final String FILENAME = "filename";
    public static final int PORTNUMBER = 5555;
    public static final String HOST = "localhost";


    @Test
    public void goodTCPFileExchangerTest() throws IOException {

        TCPFileExchanger tcpFileExchange = new  TCPFileExchangerImpl();

        tcpFileExchange.sendFile2Host(FILENAME, HOST, PORTNUMBER);

        tcpFileExchange.receiveFile(FILENAME, PORTNUMBER);

    }

    @Test
    public void badTCPFileExchangerTest1() throws IOException {

        TCPFileExchanger tcpFileExchange = new  TCPFileExchangerImpl();

        tcpFileExchange.sendFile2Host(FILENAME, HOST, PORTNUMBER);

        // file name cannot be null
        tcpFileExchange.receiveFile(null, PORTNUMBER);

    }
    @Test
    public void badTCPFileExchangerTest2() throws IOException {

        TCPFileExchanger tcpFileExchange = new  TCPFileExchangerImpl();

        tcpFileExchange.sendFile2Host(FILENAME, null, PORTNUMBER);

        // file name cannot be null
        tcpFileExchange.receiveFile(null, PORTNUMBER);

    }
}

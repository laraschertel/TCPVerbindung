package fileexchange;
import org.junit.Test;
import org.junit.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileExchangeTests {
    public static final String FILENAME = "filename";
    public static OutputStream os;
    public static InputStream is;

    @Test // this test doesnt make sense (?)
    public void goodFileExchange() throws IOException {
        FileSender fileSender = new FileSend();

        fileSender.sendFile(FILENAME, os);

        FileReceiver fileReceiver = new FileReceive();

        fileReceiver.receivedFile(FILENAME, is);
    }

    @Test (expected=Exception.class)
    public void badFileExchangeTest1() throws IOException {
        FileSender fileSender = new FileSend();

        // filename cant be null
        fileSender.sendFile(null, os);

        FileReceiver fileReceiver = new FileReceive();

        fileReceiver.receivedFile(FILENAME, is);
    }

    @Test (expected=Exception.class)
    public void badFileExchangeTest2() throws IOException {
        FileSender fileSender = new FileSend();

        // filename cant be null
        fileSender.sendFile(FILENAME, os);

        FileReceiver fileReceiver = new FileReceive();

        fileReceiver.receivedFile(FILENAME, null);
    }
}

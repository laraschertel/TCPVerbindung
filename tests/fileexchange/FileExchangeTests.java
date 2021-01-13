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

    @Test
    public void fileExchange() throws IOException {
        FileSender fileSender = new FileSend();

        fileSender.sendFile(FILENAME, os);

        FileReceiver fileReceiver = new FileReceive();

        fileReceiver.receivedFile(FILENAME, is);
    }
}

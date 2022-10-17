import java.io.*;
import skadistats.clarity.Clarity;
import skadistats.clarity.wire.common.proto.Demo.CDemoFileInfo;

public class ClarityFuzz {
    public static void fuzzerInitialize() {

    }

    public static void fuzzerTestOneInput(byte[] data) {
        ByteArrayInputStream input = new ByteArrayInputStream(data);
        try {
            CDemoFileInfo info = Clarity.infoForStream(input);
        } catch (IOException e) {
            
        }
    }
}
package chess.client;

import java.io.IOException;

public interface Actor {
    String sendCommand() throws IOException;
}

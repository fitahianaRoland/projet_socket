package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import choix.*;
import front.Window;

public class Server {

    Socket socket;

    public Server(int port) throws Exception {

        setUpServer(port);
    }

    public void setUpServer(int port) throws IOException {

        ServerSocket s = new ServerSocket(port);
        System.out.println("..Client en attente..");
        this.socket = s.accept();
        new Window(this.socket);

    }

    /**
     * @return the socket
     */
    public Socket getSocket() {
        return socket;
    }

    /**
     * @param socket the socket to set
     */
    public void setSocket(Socket socket) {
        this.socket = socket;
    }

}

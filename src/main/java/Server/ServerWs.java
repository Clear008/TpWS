package Server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerWs {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:2233/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Server ready : "+url);
    }
}

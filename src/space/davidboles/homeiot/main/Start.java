package space.davidboles.homeiot.main;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import space.davidboles.homeiot.handlers.RoomLightHandler;

public class Start {
	
	static HttpServer server;

	public static void main(String[] args) {
		initializeServer();
		server.createContext("/get/room_light", new RoomLightHandler());
	}
	
	static void initializeServer() {
		try {
			server = HttpServer.create(new InetSocketAddress(40101), 100);
			server.setExecutor(null);
		    server.start();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

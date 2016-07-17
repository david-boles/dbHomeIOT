package space.davidboles.homeiot.main;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import space.davidboles.homeiot.handlers.roomlight.RoomLightLogHandler;
import space.davidboles.homeiot.handlers.roomlight.RoomLightValueGetHandler;

public class Start {
	
	static HttpServer server;

	public static void main(String[] args) {
		initializeServer();
		server.createContext("/room_light/value/get", new RoomLightValueGetHandler());
		server.createContext("/room_light/log", new RoomLightLogHandler());
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

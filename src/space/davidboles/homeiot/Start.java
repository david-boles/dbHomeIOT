package space.davidboles.homeiot;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import space.davidboles.homeiot.handlers.roomlight.RoomLightBootHandler;
import space.davidboles.homeiot.handlers.roomlight.RoomLightLogHandler;
import space.davidboles.homeiot.handlers.roomlight.RoomLightValueGetHandler;

public class Start {
	
	static HttpServer server;
	
	//Room light
	public static RoomLightValueGetHandler roomLightValueGet = new RoomLightValueGetHandler();
	public static RoomLightLogHandler roomLightLog = new RoomLightLogHandler();
	public static RoomLightBootHandler roomLightBoot = new RoomLightBootHandler();

	public static void main(String[] args) {
		initializeServer();
		server.createContext("/room_light/value/get", roomLightValueGet);
		server.createContext("/room_light/log", roomLightLog);
		server.createContext("/room_light/boot", roomLightBoot);
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

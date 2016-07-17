package space.davidboles.homeiot.handlers.roomlight;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import space.davidboles.homeiot.handlers.HandlerFs;

public class RoomLightLogHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange arg0) throws IOException {
		System.out.println("room_light"+arg0.getRequestURI().toString().substring(15));
		HandlerFs.respondOKHTML(arg0, "");
	}

}

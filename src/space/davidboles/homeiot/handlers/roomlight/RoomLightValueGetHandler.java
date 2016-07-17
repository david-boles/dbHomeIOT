package space.davidboles.homeiot.handlers.roomlight;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import space.davidboles.homeiot.handlers.HandlerFs;

public class RoomLightValueGetHandler implements HttpHandler {

	int brightness = 50;//TODO set initial to 100
	
	@Override
	public void handle(HttpExchange arg0) throws IOException {
		HandlerFs.respondOKHTML(arg0, Integer.toString(brightness));
	}

}

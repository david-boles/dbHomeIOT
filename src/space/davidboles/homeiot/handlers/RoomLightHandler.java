package space.davidboles.homeiot.handlers;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class RoomLightHandler implements HttpHandler {

	int brightness = 100;
	
	@Override
	public void handle(HttpExchange arg0) throws IOException {
		HandlerFs.respondOKHTML(arg0, Integer.toString(brightness));
	}

}

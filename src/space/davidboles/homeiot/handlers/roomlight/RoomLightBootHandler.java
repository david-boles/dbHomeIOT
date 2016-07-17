package space.davidboles.homeiot.handlers.roomlight;

import java.io.IOException;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import space.davidboles.homeiot.Start;
import space.davidboles.homeiot.handlers.HandlerFs;

public class RoomLightBootHandler implements HttpHandler {

	@Override
	public void handle(HttpExchange arg0) throws IOException {
		HandlerFs.respondOKHTML(arg0, Integer.toString(Start.roomLightValueGet.incrementMode()));//TODO
	}

}

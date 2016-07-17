package space.davidboles.homeiot.handlers.roomlight;

import java.io.IOException;
import java.util.Random;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import space.davidboles.homeiot.handlers.HandlerFs;

public class RoomLightValueGetHandler implements HttpHandler {

	int mode = 1;//Auto control, 0 for full brightness
	int brightness = 15;//TODO set initial to 100
	Random random = new Random();
	
	@Override
	public void handle(HttpExchange arg0) throws IOException {
		if(mode == 0) HandlerFs.respondOKHTML(arg0, Integer.toString(100));
		if(mode == 1) HandlerFs.respondOKHTML(arg0, Integer.toString(random.nextInt(100)));
	}
	
	public int incrementMode() {
		int newMode = this.mode + 1;
		if(newMode > 1) newMode = 0;
		mode = newMode;
		return mode;
	}

}

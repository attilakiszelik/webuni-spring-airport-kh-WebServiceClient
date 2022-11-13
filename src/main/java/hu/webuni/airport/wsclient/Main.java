package hu.webuni.airport.wsclient;

import java.util.concurrent.ExecutionException;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		//ezen keresztül érhetőek el a szerver webservice-ei
		AirportXmlWs airportXmlWsImplPort = new AirportXmlWsImplService().getAirportXmlWsImplPort();
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		
		airportXmlWsImplPort.getHistoryById(1L).forEach(historyData ->{
			System.out.format("name: %s, revision: %s, revtype: %s %n",
					historyData.getData().getName(), historyData.getRevision(), historyData.getRevType().toString());
		});
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		
		//a szerveren az aszinkron szervíz metódus miatt az interface-re rá kellett tenni a @ResponseWrapper annotációt
		//az viszont azt eredményezte, hogy itt már nem egy long-gal lehet meghívni a metódust, hanem egy getFlightDelay osztály példánnyal
		GetFlightDelay getFlightDelay = new GetFlightDelay();
		//amelynek nulladik argumentumába állítjuk be a flightId-t
		getFlightDelay.setArg0(100L);
		
		//itt a kliens még a nio szálon hívja meg a szervert (tehát a szerveren hiába aszinkron a működés a nio szál blokkolódik, amíg vissza nem ér a válasz) 
		System.out.println(airportXmlWsImplPort.getFlightDelay(getFlightDelay));
		
		//-----------------------------------------------------------------------------------------------------------------------------------
		
		//itt már a kliens is aszinkron, így egyáltalán nem blokkolódik a nio szál (itt közvetlenül az async metódust hívjuk)
		airportXmlWsImplPort.getFlightDelayAsync(getFlightDelay, result ->{
			try {
				System.out.println(result.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		});
		
		//az aszinkron hívás után, a válasz megérkezése előtt lezárodna a main metódu futtatása, ezért itt egy késleltetés
		for (int i=0; i<6; i++) {
			System.out.println("server working on it, please wait...");
			Thread.sleep(1000);
		}

	}

}

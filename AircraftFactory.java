public class AircraftFactory {
	
	public Flyable newAircraft(
		String type,
		String name,
		int longitude,
		int latitude,
		int height)
	{
		return new Helicopter(name, new Coordinates(longitude, latitude, height));	
	}
	
}
public class AircraftFactory {

	public AircraftFactory()
	{
	}
	
	public Flyable newAircraft(	String type,
					String name,
					int longitude,
					int latitude,
					int height)
	{
		if (type.equals("Helicopter") == true)
		{
			return new Helicopter(name, new Coordinates(longitude, latitude, height));
		}
		else if (type.equals("JetPlane") == true)
		{
			return new JetPlane(name, new Coordinates(longitude, latitude, height));
		}
		else if (type.equals("Baloon") == true)
		{
			return new Baloon(name, new Coordinates(longitude, latitude, height));
		}
		else
		{
			System.out.println("Wrong Aircraft Type");
			return null; //change it
		}
	}
	
}

public class Helicopter extends Aircraft implements Flyable {
	
	private WeatherTower weatherTower;

	protected Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
		
	}

	private String getUniqName()
	{
		return ("Helicopter#" + this.name + "(" + Long.toString(this.id) + "): ");
	}

	private void changeCoordinates(String currentWeather)
	{
		int longitude = super.coordinates.getLongitude();
		int latitude = super.coordinates.getLatitude();
		int height = super.coordinates.getHeight();

		if (currentWeather.equals("SUN"))
		{
			System.out.println(getUniqName() + "<sun mes>");
			longitude += 10;
			height += 2;
		}
		else if (currentWeather.equals("RAIN"))
		{
			System.out.println("<helicopter rain>");
			longitude += 5;
		}
		else if (currentWeather.equals("FOG"))
		{
			System.out.println("<helicopter fog>");
			longitude += 1;
		}
		else if (currentWeather.equals("SNOW"))
		{
			System.out.println("<helicopter snow>");
			height -= 12;
		}
		if (height > 100)
			height = 100;
		if (height <= 0)
		{
			weatherTower.unregister(this);
			System.out.println("Helicopter unregestered \\ Landed");
		}
		this.coordinates = new Coordinates(longitude, latitude, height);
	}

	public void updateConditions() {
		if (weatherTower != null)
		{
			changeCoordinates(weatherTower.getWeather(this.coordinates));
		}
	}

	public void registerTower(WeatherTower weatherTower) {
		this.weatherTower = weatherTower;
		weatherTower.register(this);
		System.out.println("Helicorter Registered");
	}
}

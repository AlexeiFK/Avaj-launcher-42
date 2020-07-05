

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates)
	{
		return (WeatherProvider.getProvider().getCurrentWeather(coordinates));
	}

	public WeatherTower()
	{
		super();
	}
	
	void changeWeather() {
		super.conditionsChanged();
	}
}

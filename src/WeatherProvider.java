public class WeatherProvider {

	private static WeatherProvider weatherProvider;
	private String[] weather;
	
	private WeatherProvider() {
		weather = new String[]{"SUN", "RAIN", "FOG", "SNOW"};
	};

	public static WeatherProvider getProvider() {
		if (weatherProvider == null) {
			weatherProvider = new WeatherProvider();
		}
		return weatherProvider;
	}
	
	public String getCurrentWeather(Coordinates coords) {
		return (weather[(coords.getLongitude() + coords.getLatitude() + coords.getHeight()) % 4]);
	//	return ("SNOW");
	}
}

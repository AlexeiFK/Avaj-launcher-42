public class Baloon extends Aircraft implements Flyable {
	
	private WeatherTower wheaterTower;

	protected Baloon(String name, Coordinates coordinates) {
		super(name, coordinates);
	}

	public void updateConditions() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}
}

public class Helicopter extends Aircraft implements Flyable {
	
	private WeatherTower wheaterTower;

	protected Helicopter(String name, Coordinates coordinates) {
		super(name, coordinates);
		
	}

	public void updateConditions() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}
}

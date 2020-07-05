

public class Aircraft {

	protected long id;
	protected String name;
	protected Coordinates coordinates;
	static private long idCounter = 0;

	protected Aircraft(String name, Coordinates coordinates) {
		this.id = nextId();
		this.name = name;
		this.coordinates = coordinates; // add id
	}

	private void setCoordinates()
	{
	}

	private long nextId() {
		idCounter++;
		return (idCounter); // mb change this id
	}
}

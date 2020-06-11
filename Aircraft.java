

public class Aircraft {

	protected long id;
	protected String name;
	protected Coordinates coordinates;
	private long idCounter;

	protected Aircraft(String name, Coordinates coordinates) {
		this.name = name;
		this.coordinates = coordinates; // add id
	}

	private long nextId() {
		return (this.id + 1); // mb change this id
	}
}

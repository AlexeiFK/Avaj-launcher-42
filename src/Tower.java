import java.util.ArrayList;



public class Tower {

	private ArrayList<Flyable> observers;
	
	public void register(Flyable flyable) {
		this.observers.add(flyable);
	}

	public void unregister(Flyable flyable) {	
		if (observers.isEmpty() == false)
		{
			this.observers.remove(flyable);
		}
	}

	public Tower()
	{
		this.observers = new ArrayList<Flyable>();
	}

	protected void conditionsChanged() {
		if (observers.isEmpty() == false)
		{
			for (int i = 0; i < observers.size(); i++)
			{
				observers.get(i).updateConditions();
			}
		}
	}
}

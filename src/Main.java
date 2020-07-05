
import java.io.*;
import java.util.ArrayList;

public class Main {

	private static void usage() {
		System.out.println("Usage: ./todo <text.txt>");
	}

	private static ArrayList<String> readFromFile(String filename) throws FileNotFoundException, IOException
	{
		try
		{
			InputStream is = new FileInputStream(filename);
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line = buf.readLine();
			ArrayList<String> scenario = new ArrayList<String>();
	
			while (line != null) {
				scenario.add(line);
				line = buf.readLine();
			}
			for (String str : scenario) {
				System.out.println(str);
			}
			return (scenario);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File \"" + filename + "\" doesn't exist");
			throw e;
		}
		catch (IOException e)
		{
			System.out.println("Error"); //todo change it
			throw e;
		}
	}

	private static boolean isScenarioValid(ArrayList<String> scenario)
	{
		/*
		int size = scenario.size();
		
		if (size < 2)
			return (false);
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(scenario.get(0));
		if (m.matches() == false)
			return (false);
		Pattern p = Pattern.compile("\\d+");
		for (int i = 1; i < size; i++)
		{
			
		}
		*/
		return (true);
	}
	
	public static void main(String[] args) throws Exception
	{
		if (args.length != 1) {
			usage();
			return ;
		}

		ArrayList<String> scenario = new ArrayList<>();
		try
		{
			scenario = readFromFile(args[0]);
		}
		catch (Exception e)
		{
			throw e;
		}
		if (isScenarioValid(scenario) == false)
		{
			System.out.println("false");
			return;
		}
		else
		{
			System.out.println("true");
			startSimulation(scenario);
		}
	}

	private static void startSimulation(ArrayList<String> scenario)
	{
		int numberOfSimulations;
		int size = scenario.size();
		AircraftFactory af = new AircraftFactory();
		
		WeatherTower wt = new WeatherTower();	
		for (int i = 1; i < size; i++)
		{
			Flyable f = af.newAircraft("Helicopter", "H1", 51, 55, 50);
			f.registerTower(wt);
		}
		numberOfSimulations = 20; // Integer.toString(scenario.get(0));
		for (int j = 1; j < numberOfSimulations; j++)
		{
			wt.changeWeather();
		}
	}
	
	
}

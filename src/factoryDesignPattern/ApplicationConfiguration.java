package factoryDesignPattern;

public class ApplicationConfiguration {

	public static void main(String[] args) {
		GUIFactory factory;
		
		String osName = System.getProperty("os.name");
		//to see what is included in the getProperty function
		System.out.println(osName);
		if(osName.contains("mac"))
		{
			factory = new MacOsFactory();
		}
		else
		{
			factory = new WindowsFactory();
		}
		
		Application app = new Application(factory);
		app.paint();
	}

}

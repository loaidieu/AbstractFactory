package factoryDesignPattern;

public class Application {
	private Button button;
	private CheckBox checkBox;
	private ScrollBar scrollBar;
	
	public Application(GUIFactory factory)
	{
		button = factory.createButton();
		checkBox = factory.createCheckBox();
		scrollBar = factory.createScrollBar();
	}
	
	public void paint()
	{
		button.paint();
		checkBox.paint();
		scrollBar.paint();
	}
}

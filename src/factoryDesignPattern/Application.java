package factoryDesignPattern;

public class Application {
	private Button button;
	private CheckBox checkBox;
	private ScrollBar scrollBar;
	private TextBox textBox;
	
	public Application(GUIFactory factory)
	{
		button = factory.createButton();
		checkBox = factory.createCheckBox();
		scrollBar = factory.createScrollBar();
		textBox = factory.createTextBox();
	}
	
	public void paint()
	{
		button.paint();
		checkBox.paint();
		scrollBar.paint();
		textBox.paint();
	}
}

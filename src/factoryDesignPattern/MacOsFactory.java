package factoryDesignPattern;

public class MacOsFactory implements GUIFactory{
	@Override
	public Button createButton()
	{
		return new MacOsButton();
	}
	
	@Override
	public CheckBox createCheckBox()
	{
		return new MacOsCheckBox();
	}
	
	@Override
	public ScrollBar createScrollBar()
	{
		return new MacOsScrollBar();
	}
	
	@Override
	public TextBox createTextBox()
	{
		return new MacOsTextBox();
	}
}

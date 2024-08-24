package factoryDesignPattern;

public class WindowsFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new WindowsCheckBox();
	}

	@Override
	public ScrollBar createScrollBar() {
		// TODO Auto-generated method stub
		return new WindowsScrollBar();
	}

	@Override
	public TextBox createTextBox() {
		// TODO Auto-generated method stub
		return new WindowsTextBox();
	}

	
}

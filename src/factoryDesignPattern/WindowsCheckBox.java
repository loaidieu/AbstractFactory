package factoryDesignPattern;

public class WindowsCheckBox implements CheckBox{

	@Override
	public void paint() {
		System.out.println("Rendering the Windows Check Box");
	}
	
}

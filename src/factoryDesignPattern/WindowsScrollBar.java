package factoryDesignPattern;

public class WindowsScrollBar implements ScrollBar{

	@Override
	public void paint() {
		System.out.println("Rendering the Windows Scroll Bar");
	}
	
}

package factoryDesignPattern;

public class MacOsScrollBar implements ScrollBar{
	@Override
	public void paint() {
		System.out.println("Rendering the Mac Os Scroll Bar");
	}
}

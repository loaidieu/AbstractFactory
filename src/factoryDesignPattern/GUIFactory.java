package factoryDesignPattern;

public interface GUIFactory {
	Button createButton();
	CheckBox createCheckBox();
	ScrollBar createScrollBar();
}

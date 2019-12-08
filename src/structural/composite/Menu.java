package structural.composite;

public class Menu extends MenuComponent {
	
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		super.menuComponents.add(menuComponent);
		return menuComponent;
	}
	
	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		super.menuComponents.remove(menuComponent);
		return menuComponent;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(); //builder pattern
		builder.append(print(this));

		for (MenuComponent menuComponent : super.menuComponents) {
			builder.append(menuComponent.toString());
		}
		
		return builder.toString();
	}
}

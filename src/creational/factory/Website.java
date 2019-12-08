package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	List<Page> pages = new ArrayList<>();
	
	List<Page> getPages() {
		return pages;
	}

	Website() {
		this.createWebsite();
	}
	
	public abstract void createWebsite();
	
}

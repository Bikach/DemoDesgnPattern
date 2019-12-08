package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

//Catalog acts as a factory and cache for Item flyweight objects
class Catalog {
	private Map<String, Item> items = new HashMap<>();

	//factory method
	Item lookup(String itemName) {
		if (!items.containsKey(itemName))
			items.put(itemName, new Item(itemName));
		return items.get(itemName);
	}

	int totalItemsMade() {
		return items.size();
	}
}
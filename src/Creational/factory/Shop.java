package Creational.factory;

public class Shop extends Website {
    @Override
    public void createWebsite() {
        super.pages.add(new CartPage());
        super.pages.add(new ItemPage());
        super.pages.add(new SearchPage());
    }
}

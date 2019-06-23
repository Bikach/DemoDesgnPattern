package Creational.factory;

public class MainFactory {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite("blog");
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite("Shop");
        System.out.println(site.getPages());
    }
}

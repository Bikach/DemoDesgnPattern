package Creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(String siteType){
        if (siteType.equals("blog")) {
            return new Blog();
        }
        return new Shop();
    }
}

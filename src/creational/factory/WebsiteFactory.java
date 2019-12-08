package creational.factory;

class WebsiteFactory {

	static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
		
			case SHOP : {
				return new Shop();
			}
			
			default : {
				return null;
			}
 		}
	}
	
}

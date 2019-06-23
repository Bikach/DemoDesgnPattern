package Creational.factory;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        super.pages.add(new PostPage());
        super.pages.add(new AboutPage());
        super.pages.add(new CommentPage());
        super.pages.add(new ContactPage());
    }
}

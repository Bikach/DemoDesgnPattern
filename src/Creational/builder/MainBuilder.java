package Creational.builder;

public class MainBuilder {

    public static void main(String[] args) {

        LunchOrder lunchOrder = new LunchOrderBuilder().setBread("baguette")
                .setCondiments("mayo")
                .setDressing("rond")
                .build();

        LunchOrder lunchOrder2 = new LunchOrderBuilder().setBread("pain rond")
                .setCondiments("ketchup")
                .setDressing("carree")
                .setMeat("ham")
                .build();

        System.out.println(lunchOrder);
        System.out.println(lunchOrder2);
    }
}

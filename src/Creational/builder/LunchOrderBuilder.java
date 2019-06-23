package Creational.builder;

class LunchOrderBuilder {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;


    LunchOrder build(){
        return new LunchOrder(bread, condiments, dressing, meat);
    }

    LunchOrderBuilder setBread(String bread){
        this.bread = bread;
        return this;
    }

    LunchOrderBuilder setCondiments(String condiments){
        this.condiments = condiments;
        return this;
    }

    LunchOrderBuilder setDressing(String dressing){
        this.dressing = dressing;
        return this;
    }

    LunchOrderBuilder setMeat(String meat){
        this.meat = meat;
        return this;
    }
}

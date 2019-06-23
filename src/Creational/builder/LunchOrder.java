package Creational.builder;

final class LunchOrder  {

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    private static int countOrder = 0;

    LunchOrder(String bread, String condiments, String dressing, String meat) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "LunchOrder "+ (++countOrder) +": {" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}

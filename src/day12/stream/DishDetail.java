package day12.stream;

public class DishDetail {

    private final String dishname;
    private final String type;

    public DishDetail(Dish dish) {
        this.dishname = dish.getName();
        this.type = dish.getType().getDesc();
    }

    public String getDishname() {
        return dishname;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "dishname='" + dishname + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

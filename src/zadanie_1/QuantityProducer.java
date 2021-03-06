package zadanie_1;

public class QuantityProducer {

    private String name;
    private  int index;

    public QuantityProducer(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "QuantityProducer{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
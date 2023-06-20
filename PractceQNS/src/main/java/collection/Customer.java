package collection;

public class Customer {
    int length;
    int height;
    int width;

    public Customer(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return height;
    }

    public void setWeight(int weight) {
        this.height = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "length=" + length +
                ", weight=" + height +
                ", width=" + width +
                '}';
    }
}

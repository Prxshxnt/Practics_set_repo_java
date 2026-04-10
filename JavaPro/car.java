
public class car {
    String model;
    String color;
    int year;

    public car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
    public void updateColor(String newColor) {
        this.color = newColor;
    }
    public String getColor() {
        return color;
    }

    public static void main(String[] args) {
        car myCar = new car("Toyota Camry", "Red", 2020);
        myCar.displayInfo();
        myCar.updateColor("Blue");
        System.out.println("Updated Color: " + myCar.getColor());
    }
}
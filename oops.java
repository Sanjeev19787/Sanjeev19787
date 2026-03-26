class Car {
    // Attributes
    String colour;
    String model;
    int year;

    // Method
    public void display() {
        System.out.println("Info abt the car");
        System.out.println("Colour :" +this.colour);
        System.out.println("Model :" +this.model);
        System.out.println("Year :" +this.year);
    }   
}

public class oops {
    public static void main(String[] args) {
        // creating an object
        Car mycar1 = new Car();

        //Adding properties to object
        mycar1.colour = "Red";
        mycar1.model = "BMW";
        mycar1.year = 2022;

        mycar1.display();
    }
}
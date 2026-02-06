public class Wheel {

    public int count;
    public Wheel() {
        this.count = 4;
    }

    public String identifyWheel() {
       return "I am the Wheel Class. I allow the car to move! I have " + count + " wheels.";
    }

    public void rotate() {
        // Functional method
    }
}

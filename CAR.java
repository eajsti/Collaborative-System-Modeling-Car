public class CAR {

    public Engine engine;
    public Wheel wheel;
    public Owner owner;

    public CAR(Owner owner) {
        this.owner = owner;      // aggregation
        this.engine = new Engine(); // composition
        this.wheel = new Wheel();   // composition
    }

    public String identifyCar() {
        return "I am the Car Class. I am composed of an Engine and Wheels, and I am owned by an Owner.";
    }


    public static void main(String[] args) {
        Owner o1 = new Owner();
        o1.name = "AYOWN";
        
        Wheel w1 = new Wheel ();
        w1.count = 4;

        CAR c1 = new CAR(o1);

        System.out.println(
            c1.engine.identifyEngine() + " | " +
            c1.wheel.identifyWheel() + " | " +
            c1.owner.identifyOwner()
        );
    }
}
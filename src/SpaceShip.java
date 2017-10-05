public interface SpaceShip {
    // returns either true or false indicating if the launch was successful or if the rocket has crashed.
    boolean launch();
    // returns either true or false based on the success of the landing
    boolean land();
    // returns true if the rocket can carry such item or false if it will exceed the weight limit.
    boolean canCarry(Item item);
    // updates the current weight of the rocket
    void carry(Item item);
}

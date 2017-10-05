public class U2 extends Rocket {
    int currentWeight;
    int cargoCarried;
    int cargoLimit;

    public U2() {
        cost = 120;
        weight = 16329;  // 18 ton to kg
        maxWeight = 26308; // 29 ton to kg
        currentWeight = weight;
        cargoCarried = currentWeight - weight;
        cargoLimit = maxWeight - weight;
        launchExplosion = (int) 0.04 * (cargoCarried / cargoLimit);
        landingCrash = (int) 0.08 * (cargoCarried / cargoLimit);
    }

    @Override
    public boolean launch() {
        if(launchExplosion >= 100) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean land() {
        if(landingCrash >= 100) {
            return false;
        } else {
            return true;
        }
    }
}
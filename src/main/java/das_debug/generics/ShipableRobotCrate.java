package das_debug.generics;

public class ShipableRobotCrate implements Shipable<Robot> {
    public void ship(Robot t){
        System.out.println("Ship Robot");
    }

}

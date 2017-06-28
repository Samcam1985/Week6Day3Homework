import behaviours.*;
public class Driver {

  
  String name;
  Drivable vehicle;

  public Driver(String name, Drivable vehicle){
    this.name = name;
    this.vehicle = vehicle;

  }

  public int driveDistance(int distance){
    return vehicle.driveDistance(distance);
  }

  public void setVehicle(Drivable vehicle){
    this.vehicle = vehicle;
  }
}
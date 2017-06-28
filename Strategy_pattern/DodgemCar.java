package Strategy_pattern;
import behaviours.*;

public class DodgemCar implements Drivable{

  int averageSpeed;
  int numberOfSeats;

  public DodgemCar(int averageSpeed, int numberOfSeats){
    this.averageSpeed = averageSpeed;
    this.numberOfSeats = numberOfSeats;
    

  }
  public int getSpeed(){
    return this.averageSpeed;

  }
  public int numberOfSeats(){
    return this.numberOfSeats;
  }

  public int driveDistance(int distance){
    return distance/averageSpeed;
  }
}
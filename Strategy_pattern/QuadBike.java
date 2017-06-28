package Strategy_pattern;
import behaviours.*;
public class QuadBike implements Drivable {

  int averageSpeed;
  int engineCapacity;

  public QuadBike(int averageSpeed, int engineCapacity){
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;

  }
  public int getSpeed(){
    return this.averageSpeed;

  }
  public int getEngineCapacity(){
    return this.engineCapacity;
  }

  public int driveDistance(int distance){
    return 0;
  }
}



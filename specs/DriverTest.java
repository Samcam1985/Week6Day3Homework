import static org.junit.Assert.*;
import org.junit.*;
import Strategy_pattern.*;

public class DriverTest {

  Driver driver;

  @Before
  public void before(){

    DodgemCar drivable = new DodgemCar(40, 2);
    driver = new Driver("Bob", drivable);
  }


  @Test
  public void driveDistance(){
    assertEquals(60, driver.driveDistance(2400));
  }

  @Test
  public void setVehicle(){
    QuadBike quadbike = new QuadBike(90, 75);
    driver.setVehicle(quadbike);
    assertEquals(quadbike,driver.getVehicle());
  }

}
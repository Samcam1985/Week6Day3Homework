import static org.junit.Assert.*;
import org.junit.*;
import Strategy_pattern.*;

public class QuadBikeTest {

  QuadBike quadbike;

  @Before
  public void before(){
    quadbike = new QuadBike(60, 75);
  }

  @Test
  public void getSpeed(){
    assertEquals(60, quadbike.getSpeed());
  }

  @Test
  public void getEngineCapacity(){
    assertEquals(75, quadbike.getEngineCapacity());
  }

  @Test
  public void getdriveDistance(){
    //expected = 20s 
    //1200m/60mph 
    assertEquals(20, quadbike.driveDistance(1200));
  
  }


}
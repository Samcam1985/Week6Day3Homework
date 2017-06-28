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

}
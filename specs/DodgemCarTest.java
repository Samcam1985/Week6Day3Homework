import static org.junit.Assert.*;
import org.junit.*;
import Strategy_pattern.*;

public class DodgemCarTest {

  DodgemCar dodgemcar;


  @Before
  public void before(){
    dodgemcar = new DodgemCar(20, 2);
    
  }

@Test
public void getSpeed(){
  assertEquals(20, dodgemcar.getSpeed());
}

@Test
public void getNumberOfSeats(){
  assertEquals(2, dodgemcar.numberOfSeats());
}

}

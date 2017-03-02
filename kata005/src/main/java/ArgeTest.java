import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dim3coder on 3/2/17.
 */
class ArgeTest {

  @org.junit.jupiter.api.Test
  void nbYear() {
    assertEquals(Arge.nbYear(1500, 5, 100, 5000),15);
    assertEquals(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
    assertEquals(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
  }

}
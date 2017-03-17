import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by dim3coder on 3/17/17.
 */
class GroupsTest {

  @BeforeEach
  void setUp() {

  }

  @Test
  void groupCheck() {
    assertEquals(Groups.groupCheck("{(})"),false);
    assertEquals(Groups.groupCheck("([]"),false);
    assertEquals(Groups.groupCheck("[])"),false);

    assertEquals(Groups.groupCheck("()"), true);
    assertEquals(Groups.groupCheck("({"), false);

  }

}
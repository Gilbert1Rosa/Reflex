package reflex.util;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.jupiter.api.*;

import java.util.*;

@DisplayName("ReflectionUtil Test")
public class ReflectionUtilTest {
    @Test
    void testGetAnotations() {
        assertThat(ReflectionUtil.getAnnotations(Object.class) instanceof List, is(true));
    }
}
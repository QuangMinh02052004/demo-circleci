package nhom5.circleci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CircleCiApplicationTests {

    @Test
    void testBaoLoi() {
        int kq = 1 + 1;
        assertEquals(3, kq);
    }

}

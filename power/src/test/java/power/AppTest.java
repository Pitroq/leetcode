package power;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    App app = new App();
    @Test
    public void testPow() {
        double precision = 0.00001;
        assertEquals(app.pow(2.00000, 10), 1024.00000, precision);
        assertEquals(app.pow(2.10000, 3), 9.26100, precision);
        assertEquals(app.pow(2.00000, -2), 0.25000, precision);
        assertEquals(app.pow(11.00000, 0), 1.00000, precision);
        assertEquals(app.pow(11.00000, 1), 11.00000, precision);
        assertEquals(true, true);
    }
}

package org.mwatt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void demoInstanceVariable() {
        App app1 = new App();
        assertEquals(0, app1.getInstanceInt());
        assertEquals(1, app1.incrementInstanceInt());
        assertEquals(1, app1.getInstanceInt());
        assertEquals(2, app1.incrementInstanceInt());

        App app2 = new App();
        assertEquals(0, app2.getInstanceInt());
        assertEquals(1, app2.incrementInstanceInt());
        assertEquals(1, app2.getInstanceInt());

        assertEquals(2, app1.getInstanceInt(), "Incrementing app2's instance variable should not affect app1's instance variable");
    }
}
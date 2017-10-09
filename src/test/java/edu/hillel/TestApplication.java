package edu.hillel;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by java2 on 09.10.17.
 */
public class TestApplication {
    Application application;
    @Before
    public void setUp() {
        application = new Application();
    }

    @Test
    public void testApplication() {
        List<String> studentsNames =this.application.getSudentsNames();
        assertTrue(studentsNames.size() == 1);
        assertTrue(studentsNames.contains("Ivan"));
    }

}

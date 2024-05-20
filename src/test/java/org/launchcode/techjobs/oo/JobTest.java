package org.launchcode.techjobs.oo;
import org.junit.Test;

import javax.sound.midi.SysexMessage;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

   // Test the Empty Constructor
    @Test
    public void testSettingJobId() {
        Job test_job1 = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job1.getId(), test_job2.getId());
    }
    // Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testFields =
                new Job("Product tester",
                        new Employer("ACME"),
                        new Location("Desert"),
                        new PositionType("Quality control"),
                        new CoreCompetency("Persistence"));
        assertEquals("Product tester", testFields.getName());
        assertEquals("ACME", testFields.getEmployer().getValue());
        assertEquals("Desert", testFields.getLocation().getValue());
        assertEquals("Quality control", testFields.getPositionType().getValue());
        assertEquals("Persistence", testFields.getCoreCompetency().getValue());
        assertTrue(testFields instanceof Job);
        assertTrue(testFields.getEmployer() instanceof Employer);
        assertTrue(testFields.getLocation() instanceof Location);
        assertTrue(testFields.getPositionType() instanceof PositionType);
        assertTrue(testFields.getCoreCompetency() instanceof CoreCompetency);
    }

   // Test the Equals Method
   @Test
   public void testJobsForEquality() {
       Job testFields1 =
               new Job("Product tester",
                       new Employer("ACME"),
                       new Location("Desert"),
                       new PositionType("Quality control"),
                       new CoreCompetency("Persistence"));
       Job testFields2 =
               new Job("Product tester",
                       new Employer("ACME"),
                       new Location("Desert"),
                       new PositionType("Quality control"),
                       new CoreCompetency("Persistence"));

       assertNotEquals(testFields1, testFields2);
   }
}

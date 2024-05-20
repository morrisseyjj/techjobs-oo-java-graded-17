package org.launchcode.techjobs.oo;
import org.junit.Test;

//import javax.sound.midi.SysexMessage;

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

   // TEST TO STRING : task 5
    // 1
   @Test
   public void testToStringStartsAndEndsWithNewLine() {
       Job testJob = new Job("Product tester",
               new Employer("ACME"),
               new Location("Desert"),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence"));


//        String newline = System.lineSeparator();
       String newline = "\n";
       assertEquals(newline + "ID: " + testJob.getId() + newline +
                       "Name: " + testJob.getName() + newline +
                       "Employer: " + testJob.getEmployer() + newline +
                       "Location: " + testJob.getLocation() + newline +
                       "Position Type: " + testJob.getPositionType() + newline +
                       "Core Competency: " + testJob.getCoreCompetency() + newline
               , testJob.toString());
   }

   // 2
   @Test
   public void testToStringContainsCorrectLabelsAndData() {
       Job testJob = new Job("Product tester",
               new Employer("ACME"),
               new Location("Desert"),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence"));

//        String newline = System.lineSeparator();
       String newline = "\n";
       assertEquals(newline + "ID: " + testJob.getId() + newline +
                       "Name: Product tester" + newline +
                       "Employer: ACME" + newline +
                       "Location: Desert" + newline +
                       "Position Type: Quality control" + newline +
                       "Core Competency: Persistence" + newline
               , testJob.toString());

   }
   // 3
   @Test
   public void testToStringHandlesEmptyField() {
       Job emptyJob = new Job("Product tester",
               new Employer("ACME"),
               new Location(),
               new PositionType("Quality control"),
               new CoreCompetency("Persistence"));


//        String newline = System.lineSeparator();
       String newline = "\n";

       assertEquals(newline + "ID: " + emptyJob.getId() + newline +
                       "Name: Product tester" + newline +
                       "Employer: ACME" + newline +
                       "Location: Data not available" + newline +
                       "Position Type: Quality control" + newline +
                       "Core Competency: Persistence" + newline
               , emptyJob.toString());

       System.out.println(emptyJob);
   }

}

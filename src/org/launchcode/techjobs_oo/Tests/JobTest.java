package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobTest;
    Job jobTest2;
    Job jobTest3;
    Job jobTest4;
    Job jobTest5;

    @Before
    public void createJobTestObjects() {
        jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest3 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest4 = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        jobTest5 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobID() {
        assertNotEquals(jobTest.getId(), jobTest2.getId());
        assertEquals(1, jobTest2.getId() - jobTest.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", jobTest.getName());
        assertEquals("ACME", jobTest.getEmployer().getValue());
        assertEquals("Desert", jobTest.getLocation().getValue());
        assertEquals("Quality control", jobTest.getPositionType().getValue());
        assertEquals("Persistence", jobTest.getCoreCompetency().getValue());
        assert(jobTest instanceof Job);

    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals(jobTest, jobTest2);
    }

    @Test
    public void testToStringBlankLines() {
        assertTrue(jobTest.toString().startsWith("\n"));
        assertTrue(jobTest.toString().endsWith("\n"));

    }

    @Test
    public void testToStringFieldLabels() {
        assertTrue(jobTest.toString().contains("Product tester" + "\n"));
        assertTrue(jobTest.toString().contains("ACME" + "\n"));
        assertTrue(jobTest.toString().contains("Desert" + "\n"));
        assertTrue(jobTest.toString().contains("Quality control" + "\n"));
        assertTrue(jobTest.toString().contains("Persistence"));

    }

    @Test
    public void testToStringEmptyFieldMessage() {
        assertEquals("Data not available", jobTest4.getEmployer().getValue());

    }

    @Test
    public void testToStringDataOnlyInIDField() {
        assertEquals("OOPS! This job does not seem to exist.", jobTest5.toString());
    }





}

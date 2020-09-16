package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobTest;
    Job jobTest2;

    @Before
    public void createJobTestObjects() {
        jobTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobTest2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }



    //TODO: define a test called testSettingJobID
    @Test
    public void testSettingJobID() {
        assertEquals(1, jobTest.getId());
        assertEquals(2, jobTest2.getId());
        assertNotEquals(jobTest.getId(), jobTest2.getId());
        assertEquals(jobTest.getId() + 1, jobTest2.getId());
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



}

package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        if (this.employer.getValue().equals(""))
            this.employer.setValue("Data not available");
        return this.employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if (location.getValue().equals(""))
            location.setValue("Data not available");
        return this.location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        if (positionType.getValue().equals(""))
            positionType.setValue("Data not available");
        return this.positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        if (coreCompetency.getValue().equals(""))
            coreCompetency.setValue("Data not available");
        return this.coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        if (this.getName().equals("") && this.getEmployer().getValue().equals("Data not available") && this.getEmployer().getValue().equals("Data not available") && this.getLocation().getValue().equals("Data not available") && this.getPositionType().getValue().equals("Data not available") && this.getCoreCompetency().getValue().equals("Data not available")) {
            return "OOPS! This job does not seem to exist.";
        } else {
            return "\n" +
                    "ID: " + this.getId() + "\n" +
                    "Name: " + this.getName() + "\n" +
                    "Employer: " + this.getEmployer().getValue() + "\n" +
                    "Location: " + this.getLocation().getValue() + "\n" +
                    "Position Type: " + this.getPositionType().getValue() + "\n" +
                    "Core Competency: " + this.getCoreCompetency().getValue() +
                    "\n";
        }
    }

}

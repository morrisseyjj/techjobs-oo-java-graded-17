package org.launchcode.techjobs.oo;

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
   // Constructor 1 : same as employer
    public Job() {
        this.id = nextId;
        nextId++;
    }
   //  Constructor 2
   public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
       this();
       this.name = name;
       this.employer = employer;
       this.location = location;
       this.positionType = positionType;
       this.coreCompetency = coreCompetency;
   }
//  TO STRING: ToString Method 5
@Override
public String toString() {
    if (id == 0) {
        return "Data Not Available";
    }
    return System.lineSeparator() + "ID: " + getId() +
            "\nName: " + (name.isBlank() ? "Data not available" : name) +
            "\nEmployer: " + (getEmployer().getValue().isBlank() ? "Data not available" : getEmployer().getValue()) +
            "\nLocation: " + (getLocation().getValue().isBlank() ? "Data not available" : getLocation().getValue()) +
            "\nPosition Type: " + (getPositionType().getValue().isBlank() ? "Data not available" : getPositionType().getValue()) +
            "\nCore Competency: " + (getCoreCompetency().getValue().isBlank() ? "Data not available" : getCoreCompetency().getValue()) +
            System.lineSeparator();
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
    // Getters ID
    public int getId() {
        return id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

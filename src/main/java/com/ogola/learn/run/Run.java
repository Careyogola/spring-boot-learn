package com.ogola.learn.run;

import java.time.Duration;
import java.time.LocalDateTime;

import org.springframework.beans.factory.parsing.Location;

public class Run {
    
    private Integer id;
    private String title;
    private LocalDateTime startedOn;
    private LocalDateTime completedOn;
    private Integer miles;
    private Location location;

    // constructors
    public Run (Integer id, String title, LocalDateTime startedOn, LocalDateTime completedOn, Integer miles, Location location) {
        this.id = id;
        this.title = title;
        this.startedOn = startedOn;
        this.completedOn = completedOn;
        this.miles = miles;
        this.location = location;

        if(!completedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Completed On Must be After Started On");
        }
    }

    // getters 

    public Duration getDuration() {
        return Duration.between(startedOn, completedOn);
    }

    public Integer getAvgPace() {
        return Math.toIntExact(getDuration().toMinutes()/ miles);
    }
    
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartedOn() {
        return startedOn;
    }

    public LocalDateTime getCompletedOn() {
        return completedOn;
    }

    public Integer getMiles() {
        return miles;
    }

    public Location getLocation() {
        return location;
    }




}

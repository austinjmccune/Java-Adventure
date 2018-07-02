package com.example.adventure;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    public Location(int locationID, String description) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
        // added a location 0 to each Location object since it will always be an option.
        this.exits.put("Q",0);
    }

    // creates a map with exits for our "rooms"
    public void addExit(String direction, int location){
        exits.put(direction,location);

    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        // returns a copy of exits rather than the actual exits map to make it immutable to outside classes.
        return new HashMap<String,Integer>(exits);
    }
}

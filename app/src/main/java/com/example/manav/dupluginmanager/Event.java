package com.example.manav.dupluginmanager;

/**
 * Created by manav on 7/1/17.
 */

public class Event {
    private String description;
    private String time;
    private String title;
    private String image;
    private String venue;

    public Event() {
    }

    public Event(String description, String time, String title, String image,String venue) {
        this.description = description;
        this.time = time;
        this.title = title;
        this.image = image;
        this.venue = venue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}

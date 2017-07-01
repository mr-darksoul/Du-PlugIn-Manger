package com.example.manav.dupluginmanager;

/**
 * Created by manav on 7/1/17.
 */

public class Notice {
    private String title;
    private String description;
    private String department;
    private String deadline;
    private String time;

    public Notice(){

    }

    public Notice(String title, String description, String department, String deadline,String time) {
        this.title = title;
        this.description = description;
        this.department = department;
        this.deadline = deadline;
        this.time = time;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}

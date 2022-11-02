package com.example.roomtutorial;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// This is where we set the table name
@Entity(tableName = "course_table")
public class CourseModal {

    //id for each course(primary key)
    @PrimaryKey(autoGenerate = true)

    //Variables for the course
    //Also columns for the table
    private int id;
    private String courseName;
    private String courseDescription;

    //Constructor
    public CourseModal(String courseName, String courseDescription) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }



}

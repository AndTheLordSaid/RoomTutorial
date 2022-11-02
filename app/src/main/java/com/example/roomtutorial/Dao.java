package com.example.roomtutorial;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    //Insert function
    //Adds to database
    @Insert
    void insert(CourseModal model);

    //Update function
    //Updates the data in database
    @Update
    void update(CourseModal model);

    //Delete function
    //Deletes specific the data from database
    @Delete
    void delete(CourseModal model);

    //Delete all function
    //Deletes all the data from database
    @Query("DELETE FROM course_table")
    void deleteAllCourses();

    //Get all courses function
    //Gets all the data from database
    @Query("SELECT * FROM course_table")
    LiveData<List<CourseModal>> getAllCourses();


}

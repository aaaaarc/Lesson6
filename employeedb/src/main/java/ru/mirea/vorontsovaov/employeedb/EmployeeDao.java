package ru.mirea.vorontsovaov.employeedb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EmployeeDao {
    @Query("SELECT * FROM Employee")
    List<Employee> getAll();
    @Query("SELECT * FROM Employee WHERE id = :id")
    Employee getById(long id);
    @Insert
    void insert(Employee hero);
    @Update
    void update(Employee hero);
    @Delete
    void delete(Employee hero);
}
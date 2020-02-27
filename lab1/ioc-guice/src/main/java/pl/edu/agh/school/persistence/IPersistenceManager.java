package pl.edu.agh.school.persistence;

import pl.edu.agh.school.SchoolClass;
import pl.edu.agh.school.Teacher;

import java.util.ArrayList;

public interface IPersistenceManager {

    public void saveTeachers(ArrayList<Teacher> teachers);

    @SuppressWarnings("unchecked")
    public ArrayList<Teacher> loadTeachers();

    public void saveClasses(ArrayList<SchoolClass> classes);

    @SuppressWarnings("unchecked")
    public ArrayList<SchoolClass> loadClasses();

    void setTeachersStorageFileName(String teachersStorageFileName);

    void setClassStorageFileName(String classStorageFileName);
}

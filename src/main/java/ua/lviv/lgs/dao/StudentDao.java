package ua.lviv.lgs.dao;

import ua.lviv.lgs.domain.Student;

import java.util.List;

public interface StudentDao {
    Student create(Student student);

    Student readById(int id);

    List<Student> readAll();

    Student update(Student student);

    void delete(int id);
}

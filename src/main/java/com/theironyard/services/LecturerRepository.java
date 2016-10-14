package com.theironyard.services;


import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

public interface LecturerRepository extends CrudRepository<Lecturer, Integer> {

}

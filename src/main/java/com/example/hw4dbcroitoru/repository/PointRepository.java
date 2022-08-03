package com.example.hw4dbcroitoru.repository;

import com.example.hw4dbcroitoru.Model.Point;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PointRepository extends CrudRepository<Point, Integer> {
public List<Point> findAll();
}

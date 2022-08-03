package com.example.hw4dbcroitoru.service;

import com.example.hw4dbcroitoru.Model.Point;
import com.example.hw4dbcroitoru.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PointService {
    @Autowired
    PointRepository pointRepository;
    public List<Point> getAllOrders() {
        List<Point> aux = new ArrayList<>();
        pointRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Point getpointById(Integer id) {
        return pointRepository.findById(id).get();}

    public Point save(Point point) {
        return pointRepository.save(point);
    }

    public Point updatePoint(Integer id, Point point) {
        try {
            Point newpoint = pointRepository.findById(id).get();
            newpoint.setStatus(point.getStatus());
            newpoint.setComments(point.getComments());
        return pointRepository.save(newpoint);

        } catch (Exception e) {
            System.out.println("Status with id does not exist");
            return null;
        }
    }

    public void deleteById(Integer id) {
        pointRepository.findById(id);
    }

}

package com.example.hw4dbcroitoru.Controllers;


import com.example.hw4dbcroitoru.Model.Point;
import com.example.hw4dbcroitoru.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("point")
public class PointController {
    @Autowired
    PointService pointService;
    @GetMapping
    public List<Point> getAllOrders() {
        return pointService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Point getOrderById(@PathVariable("id") Integer id) {
        return pointService.getpointById(id);
    }

    @PostMapping
    public Point saveOrder(@RequestBody Point order) {
        return pointService.save(order);
    }

    @PutMapping("{id}")
    public Point updateOrders(@PathVariable Integer id, @RequestBody Point orders)
    {
        return pointService.updatePoint(id,orders);
    }
    @DeleteMapping("/{id}")
    void deleteOrder(@PathVariable Integer id) {

        pointService.deleteById(id);
    }

}




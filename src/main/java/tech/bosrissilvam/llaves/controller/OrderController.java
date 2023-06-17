package tech.bosrissilvam.llaves.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.bosrissilvam.llaves.persistence.entity.Order;
import tech.bosrissilvam.llaves.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/all")
    public List<Order> getAll(){
        return orderService.getAll();
    }
    @PostMapping("/save")
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }



}

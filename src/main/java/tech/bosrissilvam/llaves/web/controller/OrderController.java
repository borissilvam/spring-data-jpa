package tech.bosrissilvam.llaves.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.bosrissilvam.llaves.dominio.OrderDomain;
import tech.bosrissilvam.llaves.persistence.entity.Order;
import tech.bosrissilvam.llaves.dominio.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/all")
    public ResponseEntity<List<OrderDomain>> getAll(){
        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);
    }
    @PostMapping("/save")
    public ResponseEntity<OrderDomain> save(@PathVariable OrderDomain orderDomain){
        return new ResponseEntity<>(orderService.save(orderDomain), HttpStatus.CREATED);
    }

}

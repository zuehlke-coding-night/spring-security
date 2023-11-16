package ch.zuehlke.codingnight.foodorder.controllers;

import ch.zuehlke.codingnight.foodorder.order.Order;
import ch.zuehlke.codingnight.foodorder.persistence.InMemoryDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/order")
public class OrderController {

    private final InMemoryDatabase database;

    @Autowired
    public OrderController(InMemoryDatabase database) {
        this.database = database;
    }


    @GetMapping
    public List<Order> getOrders() {
        return database.getOrders();
    }
}

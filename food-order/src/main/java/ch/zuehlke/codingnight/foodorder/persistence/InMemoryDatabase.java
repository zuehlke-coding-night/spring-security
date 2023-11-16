package ch.zuehlke.codingnight.foodorder.persistence;

import ch.zuehlke.codingnight.foodorder.order.FoodItem;
import ch.zuehlke.codingnight.foodorder.order.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryDatabase {
    private final List<Order> orders = List.of(
            new Order(UUID.randomUUID().toString(),
                    List.of(new FoodItem("Pizza Hawai", "Best pizza", 1)),
                    ""));

    public List<Order> getOrders() {
        return orders;
    }
}

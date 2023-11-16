package ch.zuehlke.codingnight.foodorder.order;

public record FoodItem (
        String name,
        String description,
        int quantity
) {}

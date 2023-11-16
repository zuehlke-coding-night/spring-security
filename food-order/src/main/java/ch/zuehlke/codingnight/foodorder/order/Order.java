package ch.zuehlke.codingnight.foodorder.order;

import java.util.List;

public record Order (
    String id,
    List<FoodItem> foodItems,
    String comment
) {}

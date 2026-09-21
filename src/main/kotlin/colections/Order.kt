package colections

data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)

fun priceOrders(orders: List<Order>): List<Double> =
    orders.flatMap { order -> order.items }.map { item -> item.price }

fun priceTotal(orders: List<Order>): Double =
    orders.flatMap { order -> order.items }.sumOf { item -> item.price }

fun listOrdersItem(orders: List<Order>): List<OrderItem> =
    orders.flatMap { order -> order.items }

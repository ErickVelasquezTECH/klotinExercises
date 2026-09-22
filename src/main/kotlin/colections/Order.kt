package colections

data class Order(val id: Int, val price: Double, val items: List<OrderItem>)
data class OrderItem(val itemId: Int, val price: Double)

fun priceOrders(orders: List<Order>): List<Double> =
    orders.flatMap { it.items }.map { it.price }

fun priceTotal(orders: List<Order>): Double =
    orders.flatMap { it.items }.sumOf { it.price }

fun listOrdersItem(orders: List<Order>): List<OrderItem> =
    orders.flatMap { it.items }

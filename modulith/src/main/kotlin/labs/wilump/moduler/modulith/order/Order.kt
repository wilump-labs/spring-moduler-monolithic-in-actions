package labs.wilump.moduler.modulith.order

import labs.wilump.moduler.modulith.cart.Cart

class Order(
    private val id: String,
) {
    companion object {
        fun create(id: String, cart: Cart): Order {
            return Order(id)
        }
    }
}
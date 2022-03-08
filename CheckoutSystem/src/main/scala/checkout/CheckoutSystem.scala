package checkout

import model.{Discount, ItemPricingRule}

object CheckoutSystem {

    def main(args: Array[String]): Unit ={

      val rules = Map(
        "A" -> ItemPricingRule(unitPrice = 50, discount = Some(Discount(minimumQuantity = 3, specialPrice = 130))),
        "B" -> ItemPricingRule(unitPrice = 30, discount = Some(Discount(minimumQuantity = 2, specialPrice = 45))),
        "C" -> ItemPricingRule(unitPrice = 20),
        "D" -> ItemPricingRule(unitPrice = 15)
      )

      val basket = Seq("A", "B", "A", "C", "C", "C", "D", "A", "A", "B")
      val checkout = Checkout(rules)


      basket.foreach(checkout.scanToAdd)
      println(checkout.total())

    }


}

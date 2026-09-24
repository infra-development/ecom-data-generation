package com.shopsphere.datagen.payment

sealed trait PaymentMethod

object PaymentMethod {
  case object Upi extends PaymentMethod
  case object CreditCard extends PaymentMethod
  case object DebitCard extends PaymentMethod
  case object NetBanking extends PaymentMethod
  case object Wallet extends PaymentMethod
}
package com.shopsphere.datagen.customer.model

sealed trait Gender

object Gender {
  case object Male extends Gender
  case object Female extends Gender
  case object Other extends Gender
}
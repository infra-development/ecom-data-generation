package com.shopsphere.datagen.customer.model

sealed trait CustomerSegment

object CustomerSegment {
  case object Standard extends CustomerSegment
  case object Premium extends CustomerSegment
  case object Vip extends CustomerSegment
  case object Business extends CustomerSegment
}
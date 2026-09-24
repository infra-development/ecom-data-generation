package com.shopsphere.datagen.customer.model

sealed trait CustomerStatus

object CustomerStatus {
  case object Active extends CustomerStatus
  case object Inactive extends CustomerStatus
  case object Suspended extends CustomerStatus
  case object Closed extends CustomerStatus
}
package com.shopsphere.datagen.customer.model

sealed trait AcquisitionChannel

object AcquisitionChannel {
  case object Organic extends AcquisitionChannel
  case object PaidSearch extends AcquisitionChannel
  case object Social extends AcquisitionChannel
  case object Email extends AcquisitionChannel
  case object Direct extends AcquisitionChannel
  case object Referral extends AcquisitionChannel
}
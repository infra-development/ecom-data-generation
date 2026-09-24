package com.shopsphere.datagen.device

sealed trait DeviceType

object DeviceType {
  case object Mobile extends DeviceType
  case object Desktop extends DeviceType
  case object Tablet extends DeviceType
}
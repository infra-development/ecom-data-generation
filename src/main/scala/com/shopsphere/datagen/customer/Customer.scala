package com.shopsphere.datagen.customer

import java.time.LocalDate

import com.shopsphere.datagen.customer.model.CustomerSegment
import com.shopsphere.datagen.customer.model.CustomerStatus
import com.shopsphere.datagen.customer.model.Gender

case class Customer(
                     id: Long,
                     age: Int,
                     gender: Gender,
                     registrationDate: LocalDate,
                     status: CustomerStatus,
                     segment: CustomerSegment,
                     acquisition: CustomerAcquisition,
                     behaviorProfile: CustomerBehaviorProfile
                   )
package com.shopsphere.datagen.customer.config

import java.time.LocalDate

case class CustomerLifecycleConfig(
                                    asOfDate: LocalDate,
                                    registrationHistoryDays: Int
                                  )
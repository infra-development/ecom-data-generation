package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.CustomerLifecycleConfig
import com.typesafe.config.Config

import java.time.LocalDate

class CustomerLifecycleLoader
  extends ConfigLoader[CustomerLifecycleConfig] {

  override def load(config: Config): CustomerLifecycleConfig = {
    CustomerLifecycleConfig(
      asOfDate = LocalDate.parse(config.getString("as_of_date")),
      registrationHistoryDays =
        config.getInt("registration_history_days")
    )
  }
}
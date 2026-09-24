package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.CustomerStatusConfig
import com.typesafe.config.Config

class CustomerStatusLoader
  extends ConfigLoader[CustomerStatusConfig] {

  override def load(config: Config): CustomerStatusConfig = {
    CustomerStatusConfig(
      active = config.getDouble("active"),
      inactive = config.getDouble("inactive"),
      suspended = config.getDouble("suspended"),
      closed = config.getDouble("closed")
    )
  }
}
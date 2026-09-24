package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.CustomerSegmentConfig
import com.typesafe.config.Config

class CustomerSegmentLoader
  extends ConfigLoader[CustomerSegmentConfig] {

  override def load(config: Config): CustomerSegmentConfig = {
    CustomerSegmentConfig(
      standard = config.getDouble("standard"),
      premium = config.getDouble("premium"),
      vip = config.getDouble("vip"),
      business = config.getDouble("business")
    )
  }
}
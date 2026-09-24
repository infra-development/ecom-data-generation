package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.CustomerConfig
import com.typesafe.config.Config

class CustomerConfigLoader extends ConfigLoader[CustomerConfig] {

  override def load(config: Config): CustomerConfig = {
    ???
  }
}
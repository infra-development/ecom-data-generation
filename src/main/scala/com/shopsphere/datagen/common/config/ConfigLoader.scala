package com.shopsphere.datagen.common.config

import com.typesafe.config.Config

trait ConfigLoader[T] {
  def load(config: Config): T
}
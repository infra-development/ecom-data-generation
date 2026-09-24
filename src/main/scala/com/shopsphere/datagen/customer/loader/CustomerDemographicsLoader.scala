package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.{AgeBandConfig, CustomerDemographicsConfig, GenderDistributionConfig}
import com.typesafe.config.Config

import scala.jdk.CollectionConverters._

class CustomerDemographicsLoader
  extends ConfigLoader[CustomerDemographicsConfig] {

  override def load(config: Config): CustomerDemographicsConfig = {
    val ageBands = config
      .getConfigList("age_bands")
      .asScala
      .map { ageBand =>
        AgeBandConfig(
          minAge = ageBand.getInt("min_age"),
          maxAge = ageBand.getInt("max_age"),
          weight = ageBand.getDouble("weight")
        )
      }
      .toSeq

    val gender = config.getConfig("gender")

    CustomerDemographicsConfig(
      ageBands = ageBands,
      gender = GenderDistributionConfig(
        male = gender.getDouble("male"),
        female = gender.getDouble("female"),
        other = gender.getDouble("other")
      )
    )
  }
}
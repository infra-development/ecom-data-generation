package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config._
import com.shopsphere.datagen.customer.config.acquisition.AcquisitionChannelConfig
import com.typesafe.config.Config

import java.time.LocalDate

class CustomerConfigLoader extends ConfigLoader[CustomerConfig] {

  override def load(config: Config): CustomerConfig = {
    val customerConfig = config.getConfig("customer")

    CustomerConfig(
      demographics = loadDemographics(customerConfig.getConfig("demographics")),
      lifecycle = loadLifecycle(customerConfig.getConfig("lifecycle")),
      status = loadStatus(customerConfig.getConfig("status")),
      segment = loadSegment(customerConfig.getConfig("segment")),
      acquisitionChannel =
        loadAcquisitionChannel(customerConfig.getConfig("acquisition.channel"))
    )
  }

  private def loadDemographics(
                                config: Config
                              ): CustomerDemographicsConfig = {
    val ageBands = config
      .getConfigList("age_bands")
      .toArray
      .map { value =>
        val ageBand = value.asInstanceOf[Config]

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

  private def loadLifecycle(
                             config: Config
                           ): CustomerLifecycleConfig = {
    CustomerLifecycleConfig(
      asOfDate = LocalDate.parse(config.getString("as_of_date")),
      registrationHistoryDays =
        config.getInt("registration_history_days")
    )
  }

  private def loadStatus(
                          config: Config
                        ): CustomerStatusConfig = {
    CustomerStatusConfig(
      active = config.getDouble("active"),
      inactive = config.getDouble("inactive"),
      suspended = config.getDouble("suspended"),
      closed = config.getDouble("closed")
    )
  }

  private def loadSegment(
                           config: Config
                         ): CustomerSegmentConfig = {
    CustomerSegmentConfig(
      standard = config.getDouble("standard"),
      premium = config.getDouble("premium"),
      vip = config.getDouble("vip"),
      business = config.getDouble("business")
    )
  }

  private def loadAcquisitionChannel(
                                      config: Config
                                    ): AcquisitionChannelConfig = {
    AcquisitionChannelConfig(
      organic = config.getDouble("organic"),
      paidSearch = config.getDouble("paid_search"),
      social = config.getDouble("social"),
      email = config.getDouble("email"),
      direct = config.getDouble("direct"),
      referral = config.getDouble("referral")
    )
  }
}
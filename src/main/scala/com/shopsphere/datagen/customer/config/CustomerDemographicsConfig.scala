package com.shopsphere.datagen.customer.config

case class CustomerDemographicsConfig(
                                       ageBands: Seq[AgeBandConfig],
                                       gender: GenderDistributionConfig
                                     )
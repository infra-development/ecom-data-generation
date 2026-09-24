package com.shopsphere.datagen.customer.config.acquisition

case class AcquisitionChannelConfig(
                                     organic: Double,
                                     paidSearch: Double,
                                     social: Double,
                                     email: Double,
                                     direct: Double,
                                     referral: Double
                                   )
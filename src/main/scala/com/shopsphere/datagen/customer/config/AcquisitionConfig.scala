package com.shopsphere.datagen.customer.config

import com.shopsphere.datagen.customer.config.acquisition.{AcquisitionCampaignConfig, AcquisitionChannelConfig}

case class AcquisitionConfig(
                              acquisitionChannel: AcquisitionChannelConfig,
                              acquisitionCampaign: AcquisitionCampaignConfig
                            )
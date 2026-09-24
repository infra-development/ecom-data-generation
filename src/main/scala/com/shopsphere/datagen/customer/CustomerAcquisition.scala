package com.shopsphere.datagen.customer

import com.shopsphere.datagen.customer.model.AcquisitionChannel
import com.shopsphere.datagen.customer.model.AcquisitionCampaign

case class CustomerAcquisition(
                                channel: AcquisitionChannel,
                                campaign: AcquisitionCampaign
                              )
package com.shopsphere.datagen.customer.model

sealed trait AcquisitionCampaign

object AcquisitionCampaign {
  case object Seo extends AcquisitionCampaign
  case object Content extends AcquisitionCampaign

  case object Brand extends AcquisitionCampaign
  case object Generic extends AcquisitionCampaign

  case object Instagram extends AcquisitionCampaign
  case object Facebook extends AcquisitionCampaign
  case object Youtube extends AcquisitionCampaign

  case object Newsletter extends AcquisitionCampaign
  case object Promotion extends AcquisitionCampaign

  case object None extends AcquisitionCampaign
  case object CustomerReferral extends AcquisitionCampaign
}
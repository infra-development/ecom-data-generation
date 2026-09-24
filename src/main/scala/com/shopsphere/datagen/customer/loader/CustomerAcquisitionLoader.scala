package com.shopsphere.datagen.customer.loader

import com.shopsphere.datagen.common.config.ConfigLoader
import com.shopsphere.datagen.customer.config.AcquisitionConfig
import com.shopsphere.datagen.customer.config.acquisition._
import com.typesafe.config.Config

class CustomerAcquisitionLoader
  extends ConfigLoader[AcquisitionConfig] {

  override def load(config: Config): AcquisitionConfig = {
    AcquisitionConfig(
      acquisitionChannel = loadChannel(config.getConfig("channel")),
      acquisitionCampaign = loadCampaign(config.getConfig("campaign"))
    )
  }

  private def loadChannel(
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

  private def loadCampaign(
                            config: Config
                          ): AcquisitionCampaignConfig = {
    AcquisitionCampaignConfig(
      organic = OrganicCampaignConfig(
        seo = config.getConfig("organic").getDouble("seo"),
        content = config.getConfig("organic").getDouble("content")
      ),
      paidSearch = PaidSearchCampaignConfig(
        brand = config.getConfig("paid_search").getDouble("brand"),
        generic = config.getConfig("paid_search").getDouble("generic")
      ),
      social = SocialCampaignConfig(
        instagram = config.getConfig("social").getDouble("instagram"),
        facebook = config.getConfig("social").getDouble("facebook"),
        youtube = config.getConfig("social").getDouble("youtube")
      ),
      email = EmailCampaignConfig(
        newsletter = config.getConfig("email").getDouble("newsletter"),
        promotion = config.getConfig("email").getDouble("promotion")
      ),
      direct = DirectCampaignConfig(
        none = config.getConfig("direct").getDouble("none")
      ),
      referral = ReferralCampaignConfig(
        customerReferral =
          config.getConfig("referral").getDouble("customer_referral")
      )
    )
  }
}
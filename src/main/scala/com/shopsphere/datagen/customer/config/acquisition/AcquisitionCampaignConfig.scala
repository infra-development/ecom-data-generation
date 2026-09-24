package com.shopsphere.datagen.customer.config.acquisition

case class AcquisitionCampaignConfig(
                                      organic: OrganicCampaignConfig,
                                      paidSearch: PaidSearchCampaignConfig,
                                      social: SocialCampaignConfig,
                                      email: EmailCampaignConfig,
                                      direct: DirectCampaignConfig,
                                      referral: ReferralCampaignConfig
                                    )
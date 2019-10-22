
package com.bit.camel.CamelDSL.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "test_dropdown",
    "num_unique_conversion_events",
    "hs_analytics_revenue",
    "hs_email_quarantined",
    "createdate",
    "hs_email_optout",
    "hs_email_optout_4517084",
    "hs_calculated_phone_number_country_code",
    "hs_analytics_num_page_views",
    "hs_email_optout_4517179",
    "elixirsync_contact_last_sync_date",
    "hs_analytics_average_page_views",
    "lastname",
    "hs_all_contact_vids",
    "hs_predictivecontactscore_v2",
    "phone",
    "hs_is_contact",
    "num_conversion_events",
    "hs_object_id",
    "currentlyinworkflow",
    "hs_analytics_num_event_completions",
    "firstname",
    "elixirsync_external_account_id",
    "hs_social_num_broadcast_clicks",
    "hs_analytics_last_timestamp",
    "hs_email_recipient_fatigue_recovery_time",
    "hs_analytics_num_visits",
    "hs_email_optout_4516374",
    "hs_social_linkedin_clicks",
    "hs_analytics_last_visit_timestamp",
    "hs_social_last_engagement",
    "hs_analytics_source",
    "hs_searchable_calculated_phone_number",
    "hs_analytics_first_touch_converting_campaign",
    "hs_email_domain",
    "elixirsync_external_contact_id",
    "hs_calculated_phone_number",
    "email",
    "elixirsync_external_entity",
    "jobtitle",
    "hs_analytics_first_visit_timestamp",
    "hs_analytics_first_timestamp",
    "lastmodifieddate",
    "hs_analytics_last_touch_converting_campaign",
    "hs_social_google_plus_clicks",
    "hs_email_optout_6308272",
    "hs_predictivescoringtier",
    "hs_social_facebook_clicks",
    "hs_analytics_source_data_2",
    "hs_social_twitter_clicks",
    "hs_analytics_source_data_1"
})
public class Properties {

	@JsonProperty("properties")
	private List<Property> properties = null;	
    @JsonProperty("test_dropdown")
    private TestDropdown testDropdown;
    @JsonProperty("num_unique_conversion_events")
    private NumUniqueConversionEvents numUniqueConversionEvents;
    @JsonProperty("hs_analytics_revenue")
    private HsAnalyticsRevenue hsAnalyticsRevenue;
    @JsonProperty("hs_email_quarantined")
    private HsEmailQuarantined hsEmailQuarantined;
    @JsonProperty("createdate")
    private Createdate createdate;
    @JsonProperty("hs_email_optout")
    private HsEmailOptout hsEmailOptout;
    @JsonProperty("hs_email_optout_4517084")
    private HsEmailOptout4517084 hsEmailOptout4517084;
    @JsonProperty("hs_calculated_phone_number_country_code")
    private HsCalculatedPhoneNumberCountryCode hsCalculatedPhoneNumberCountryCode;
    @JsonProperty("hs_analytics_num_page_views")
    private HsAnalyticsNumPageViews hsAnalyticsNumPageViews;
    @JsonProperty("hs_email_optout_4517179")
    private HsEmailOptout4517179 hsEmailOptout4517179;
    @JsonProperty("elixirsync_contact_last_sync_date")
    private ElixirsyncContactLastSyncDate elixirsyncContactLastSyncDate;
    @JsonProperty("hs_analytics_average_page_views")
    private HsAnalyticsAveragePageViews hsAnalyticsAveragePageViews;
    @JsonProperty("lastname")
    private Lastname lastname;
    @JsonProperty("hs_all_contact_vids")
    private HsAllContactVids hsAllContactVids;
    @JsonProperty("hs_predictivecontactscore_v2")
    private HsPredictivecontactscoreV2 hsPredictivecontactscoreV2;
    @JsonProperty("phone")
    private Phone phone;
    @JsonProperty("hs_is_contact")
    private HsIsContact hsIsContact;
    @JsonProperty("num_conversion_events")
    private NumConversionEvents numConversionEvents;
    @JsonProperty("hs_object_id")
    private HsObjectId hsObjectId;
    @JsonProperty("currentlyinworkflow")
    private Currentlyinworkflow currentlyinworkflow;
    @JsonProperty("hs_analytics_num_event_completions")
    private HsAnalyticsNumEventCompletions hsAnalyticsNumEventCompletions;
    @JsonProperty("firstname")
    private Firstname firstname;
    @JsonProperty("elixirsync_external_account_id")
    private ElixirsyncExternalAccountId elixirsyncExternalAccountId;
    @JsonProperty("hs_social_num_broadcast_clicks")
    private HsSocialNumBroadcastClicks hsSocialNumBroadcastClicks;
    @JsonProperty("hs_analytics_last_timestamp")
    private HsAnalyticsLastTimestamp hsAnalyticsLastTimestamp;
    @JsonProperty("hs_email_recipient_fatigue_recovery_time")
    private HsEmailRecipientFatigueRecoveryTime hsEmailRecipientFatigueRecoveryTime;
    @JsonProperty("hs_analytics_num_visits")
    private HsAnalyticsNumVisits hsAnalyticsNumVisits;
    @JsonProperty("hs_email_optout_4516374")
    private HsEmailOptout4516374 hsEmailOptout4516374;
    @JsonProperty("hs_social_linkedin_clicks")
    private HsSocialLinkedinClicks hsSocialLinkedinClicks;
    @JsonProperty("hs_analytics_last_visit_timestamp")
    private HsAnalyticsLastVisitTimestamp hsAnalyticsLastVisitTimestamp;
    @JsonProperty("hs_social_last_engagement")
    private HsSocialLastEngagement hsSocialLastEngagement;
    @JsonProperty("hs_analytics_source")
    private HsAnalyticsSource hsAnalyticsSource;
    @JsonProperty("hs_searchable_calculated_phone_number")
    private HsSearchableCalculatedPhoneNumber hsSearchableCalculatedPhoneNumber;
    @JsonProperty("hs_analytics_first_touch_converting_campaign")
    private HsAnalyticsFirstTouchConvertingCampaign hsAnalyticsFirstTouchConvertingCampaign;
    @JsonProperty("hs_email_domain")
    private HsEmailDomain hsEmailDomain;
    @JsonProperty("elixirsync_external_contact_id")
    private ElixirsyncExternalContactId elixirsyncExternalContactId;
    @JsonProperty("hs_calculated_phone_number")
    private HsCalculatedPhoneNumber hsCalculatedPhoneNumber;
    @JsonProperty("email")
    private Email email;
    @JsonProperty("elixirsync_external_entity")
    private ElixirsyncExternalEntity elixirsyncExternalEntity;
    @JsonProperty("jobtitle")
    private Jobtitle jobtitle;
    @JsonProperty("hs_analytics_first_visit_timestamp")
    private HsAnalyticsFirstVisitTimestamp hsAnalyticsFirstVisitTimestamp;
    @JsonProperty("hs_analytics_first_timestamp")
    private HsAnalyticsFirstTimestamp hsAnalyticsFirstTimestamp;
    @JsonProperty("lastmodifieddate")
    private Lastmodifieddate lastmodifieddate;
    @JsonProperty("hs_analytics_last_touch_converting_campaign")
    private HsAnalyticsLastTouchConvertingCampaign hsAnalyticsLastTouchConvertingCampaign;
    @JsonProperty("hs_social_google_plus_clicks")
    private HsSocialGooglePlusClicks hsSocialGooglePlusClicks;
    @JsonProperty("hs_email_optout_6308272")
    private HsEmailOptout6308272 hsEmailOptout6308272;
    @JsonProperty("hs_predictivescoringtier")
    private HsPredictivescoringtier hsPredictivescoringtier;
    @JsonProperty("hs_social_facebook_clicks")
    private HsSocialFacebookClicks hsSocialFacebookClicks;
    @JsonProperty("hs_analytics_source_data_2")
    private HsAnalyticsSourceData2 hsAnalyticsSourceData2;
    @JsonProperty("hs_social_twitter_clicks")
    private HsSocialTwitterClicks hsSocialTwitterClicks;
    @JsonProperty("hs_analytics_source_data_1")
    private HsAnalyticsSourceData1 hsAnalyticsSourceData1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    @JsonProperty("test_dropdown")
    public TestDropdown getTestDropdown() {
        return testDropdown;
    }

    @JsonProperty("test_dropdown")
    public void setTestDropdown(TestDropdown testDropdown) {
        this.testDropdown = testDropdown;
    }

    @JsonProperty("num_unique_conversion_events")
    public NumUniqueConversionEvents getNumUniqueConversionEvents() {
        return numUniqueConversionEvents;
    }

    @JsonProperty("num_unique_conversion_events")
    public void setNumUniqueConversionEvents(NumUniqueConversionEvents numUniqueConversionEvents) {
        this.numUniqueConversionEvents = numUniqueConversionEvents;
    }

    @JsonProperty("hs_analytics_revenue")
    public HsAnalyticsRevenue getHsAnalyticsRevenue() {
        return hsAnalyticsRevenue;
    }

    @JsonProperty("hs_analytics_revenue")
    public void setHsAnalyticsRevenue(HsAnalyticsRevenue hsAnalyticsRevenue) {
        this.hsAnalyticsRevenue = hsAnalyticsRevenue;
    }

    @JsonProperty("hs_email_quarantined")
    public HsEmailQuarantined getHsEmailQuarantined() {
        return hsEmailQuarantined;
    }

    @JsonProperty("hs_email_quarantined")
    public void setHsEmailQuarantined(HsEmailQuarantined hsEmailQuarantined) {
        this.hsEmailQuarantined = hsEmailQuarantined;
    }

    @JsonProperty("createdate")
    public Createdate getCreatedate() {
        return createdate;
    }

    @JsonProperty("createdate")
    public void setCreatedate(Createdate createdate) {
        this.createdate = createdate;
    }

    @JsonProperty("hs_email_optout")
    public HsEmailOptout getHsEmailOptout() {
        return hsEmailOptout;
    }

    @JsonProperty("hs_email_optout")
    public void setHsEmailOptout(HsEmailOptout hsEmailOptout) {
        this.hsEmailOptout = hsEmailOptout;
    }

    @JsonProperty("hs_email_optout_4517084")
    public HsEmailOptout4517084 getHsEmailOptout4517084() {
        return hsEmailOptout4517084;
    }

    @JsonProperty("hs_email_optout_4517084")
    public void setHsEmailOptout4517084(HsEmailOptout4517084 hsEmailOptout4517084) {
        this.hsEmailOptout4517084 = hsEmailOptout4517084;
    }

    @JsonProperty("hs_calculated_phone_number_country_code")
    public HsCalculatedPhoneNumberCountryCode getHsCalculatedPhoneNumberCountryCode() {
        return hsCalculatedPhoneNumberCountryCode;
    }

    @JsonProperty("hs_calculated_phone_number_country_code")
    public void setHsCalculatedPhoneNumberCountryCode(HsCalculatedPhoneNumberCountryCode hsCalculatedPhoneNumberCountryCode) {
        this.hsCalculatedPhoneNumberCountryCode = hsCalculatedPhoneNumberCountryCode;
    }

    @JsonProperty("hs_analytics_num_page_views")
    public HsAnalyticsNumPageViews getHsAnalyticsNumPageViews() {
        return hsAnalyticsNumPageViews;
    }

    @JsonProperty("hs_analytics_num_page_views")
    public void setHsAnalyticsNumPageViews(HsAnalyticsNumPageViews hsAnalyticsNumPageViews) {
        this.hsAnalyticsNumPageViews = hsAnalyticsNumPageViews;
    }

    @JsonProperty("hs_email_optout_4517179")
    public HsEmailOptout4517179 getHsEmailOptout4517179() {
        return hsEmailOptout4517179;
    }

    @JsonProperty("hs_email_optout_4517179")
    public void setHsEmailOptout4517179(HsEmailOptout4517179 hsEmailOptout4517179) {
        this.hsEmailOptout4517179 = hsEmailOptout4517179;
    }

    @JsonProperty("elixirsync_contact_last_sync_date")
    public ElixirsyncContactLastSyncDate getElixirsyncContactLastSyncDate() {
        return elixirsyncContactLastSyncDate;
    }

    @JsonProperty("elixirsync_contact_last_sync_date")
    public void setElixirsyncContactLastSyncDate(ElixirsyncContactLastSyncDate elixirsyncContactLastSyncDate) {
        this.elixirsyncContactLastSyncDate = elixirsyncContactLastSyncDate;
    }

    @JsonProperty("hs_analytics_average_page_views")
    public HsAnalyticsAveragePageViews getHsAnalyticsAveragePageViews() {
        return hsAnalyticsAveragePageViews;
    }

    @JsonProperty("hs_analytics_average_page_views")
    public void setHsAnalyticsAveragePageViews(HsAnalyticsAveragePageViews hsAnalyticsAveragePageViews) {
        this.hsAnalyticsAveragePageViews = hsAnalyticsAveragePageViews;
    }

    @JsonProperty("lastname")
    public Lastname getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(Lastname lastname) {
        this.lastname = lastname;
    }

    @JsonProperty("hs_all_contact_vids")
    public HsAllContactVids getHsAllContactVids() {
        return hsAllContactVids;
    }

    @JsonProperty("hs_all_contact_vids")
    public void setHsAllContactVids(HsAllContactVids hsAllContactVids) {
        this.hsAllContactVids = hsAllContactVids;
    }

    @JsonProperty("hs_predictivecontactscore_v2")
    public HsPredictivecontactscoreV2 getHsPredictivecontactscoreV2() {
        return hsPredictivecontactscoreV2;
    }

    @JsonProperty("hs_predictivecontactscore_v2")
    public void setHsPredictivecontactscoreV2(HsPredictivecontactscoreV2 hsPredictivecontactscoreV2) {
        this.hsPredictivecontactscoreV2 = hsPredictivecontactscoreV2;
    }

    @JsonProperty("phone")
    public Phone getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @JsonProperty("hs_is_contact")
    public HsIsContact getHsIsContact() {
        return hsIsContact;
    }

    @JsonProperty("hs_is_contact")
    public void setHsIsContact(HsIsContact hsIsContact) {
        this.hsIsContact = hsIsContact;
    }

    @JsonProperty("num_conversion_events")
    public NumConversionEvents getNumConversionEvents() {
        return numConversionEvents;
    }

    @JsonProperty("num_conversion_events")
    public void setNumConversionEvents(NumConversionEvents numConversionEvents) {
        this.numConversionEvents = numConversionEvents;
    }

    @JsonProperty("hs_object_id")
    public HsObjectId getHsObjectId() {
        return hsObjectId;
    }

    @JsonProperty("hs_object_id")
    public void setHsObjectId(HsObjectId hsObjectId) {
        this.hsObjectId = hsObjectId;
    }

    @JsonProperty("currentlyinworkflow")
    public Currentlyinworkflow getCurrentlyinworkflow() {
        return currentlyinworkflow;
    }

    @JsonProperty("currentlyinworkflow")
    public void setCurrentlyinworkflow(Currentlyinworkflow currentlyinworkflow) {
        this.currentlyinworkflow = currentlyinworkflow;
    }

    @JsonProperty("hs_analytics_num_event_completions")
    public HsAnalyticsNumEventCompletions getHsAnalyticsNumEventCompletions() {
        return hsAnalyticsNumEventCompletions;
    }

    @JsonProperty("hs_analytics_num_event_completions")
    public void setHsAnalyticsNumEventCompletions(HsAnalyticsNumEventCompletions hsAnalyticsNumEventCompletions) {
        this.hsAnalyticsNumEventCompletions = hsAnalyticsNumEventCompletions;
    }

    @JsonProperty("firstname")
    public Firstname getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(Firstname firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("elixirsync_external_account_id")
    public ElixirsyncExternalAccountId getElixirsyncExternalAccountId() {
        return elixirsyncExternalAccountId;
    }

    @JsonProperty("elixirsync_external_account_id")
    public void setElixirsyncExternalAccountId(ElixirsyncExternalAccountId elixirsyncExternalAccountId) {
        this.elixirsyncExternalAccountId = elixirsyncExternalAccountId;
    }

    @JsonProperty("hs_social_num_broadcast_clicks")
    public HsSocialNumBroadcastClicks getHsSocialNumBroadcastClicks() {
        return hsSocialNumBroadcastClicks;
    }

    @JsonProperty("hs_social_num_broadcast_clicks")
    public void setHsSocialNumBroadcastClicks(HsSocialNumBroadcastClicks hsSocialNumBroadcastClicks) {
        this.hsSocialNumBroadcastClicks = hsSocialNumBroadcastClicks;
    }

    @JsonProperty("hs_analytics_last_timestamp")
    public HsAnalyticsLastTimestamp getHsAnalyticsLastTimestamp() {
        return hsAnalyticsLastTimestamp;
    }

    @JsonProperty("hs_analytics_last_timestamp")
    public void setHsAnalyticsLastTimestamp(HsAnalyticsLastTimestamp hsAnalyticsLastTimestamp) {
        this.hsAnalyticsLastTimestamp = hsAnalyticsLastTimestamp;
    }

    @JsonProperty("hs_email_recipient_fatigue_recovery_time")
    public HsEmailRecipientFatigueRecoveryTime getHsEmailRecipientFatigueRecoveryTime() {
        return hsEmailRecipientFatigueRecoveryTime;
    }

    @JsonProperty("hs_email_recipient_fatigue_recovery_time")
    public void setHsEmailRecipientFatigueRecoveryTime(HsEmailRecipientFatigueRecoveryTime hsEmailRecipientFatigueRecoveryTime) {
        this.hsEmailRecipientFatigueRecoveryTime = hsEmailRecipientFatigueRecoveryTime;
    }

    @JsonProperty("hs_analytics_num_visits")
    public HsAnalyticsNumVisits getHsAnalyticsNumVisits() {
        return hsAnalyticsNumVisits;
    }

    @JsonProperty("hs_analytics_num_visits")
    public void setHsAnalyticsNumVisits(HsAnalyticsNumVisits hsAnalyticsNumVisits) {
        this.hsAnalyticsNumVisits = hsAnalyticsNumVisits;
    }

    @JsonProperty("hs_email_optout_4516374")
    public HsEmailOptout4516374 getHsEmailOptout4516374() {
        return hsEmailOptout4516374;
    }

    @JsonProperty("hs_email_optout_4516374")
    public void setHsEmailOptout4516374(HsEmailOptout4516374 hsEmailOptout4516374) {
        this.hsEmailOptout4516374 = hsEmailOptout4516374;
    }

    @JsonProperty("hs_social_linkedin_clicks")
    public HsSocialLinkedinClicks getHsSocialLinkedinClicks() {
        return hsSocialLinkedinClicks;
    }

    @JsonProperty("hs_social_linkedin_clicks")
    public void setHsSocialLinkedinClicks(HsSocialLinkedinClicks hsSocialLinkedinClicks) {
        this.hsSocialLinkedinClicks = hsSocialLinkedinClicks;
    }

    @JsonProperty("hs_analytics_last_visit_timestamp")
    public HsAnalyticsLastVisitTimestamp getHsAnalyticsLastVisitTimestamp() {
        return hsAnalyticsLastVisitTimestamp;
    }

    @JsonProperty("hs_analytics_last_visit_timestamp")
    public void setHsAnalyticsLastVisitTimestamp(HsAnalyticsLastVisitTimestamp hsAnalyticsLastVisitTimestamp) {
        this.hsAnalyticsLastVisitTimestamp = hsAnalyticsLastVisitTimestamp;
    }

    @JsonProperty("hs_social_last_engagement")
    public HsSocialLastEngagement getHsSocialLastEngagement() {
        return hsSocialLastEngagement;
    }

    @JsonProperty("hs_social_last_engagement")
    public void setHsSocialLastEngagement(HsSocialLastEngagement hsSocialLastEngagement) {
        this.hsSocialLastEngagement = hsSocialLastEngagement;
    }

    @JsonProperty("hs_analytics_source")
    public HsAnalyticsSource getHsAnalyticsSource() {
        return hsAnalyticsSource;
    }

    @JsonProperty("hs_analytics_source")
    public void setHsAnalyticsSource(HsAnalyticsSource hsAnalyticsSource) {
        this.hsAnalyticsSource = hsAnalyticsSource;
    }

    @JsonProperty("hs_searchable_calculated_phone_number")
    public HsSearchableCalculatedPhoneNumber getHsSearchableCalculatedPhoneNumber() {
        return hsSearchableCalculatedPhoneNumber;
    }

    @JsonProperty("hs_searchable_calculated_phone_number")
    public void setHsSearchableCalculatedPhoneNumber(HsSearchableCalculatedPhoneNumber hsSearchableCalculatedPhoneNumber) {
        this.hsSearchableCalculatedPhoneNumber = hsSearchableCalculatedPhoneNumber;
    }

    @JsonProperty("hs_analytics_first_touch_converting_campaign")
    public HsAnalyticsFirstTouchConvertingCampaign getHsAnalyticsFirstTouchConvertingCampaign() {
        return hsAnalyticsFirstTouchConvertingCampaign;
    }

    @JsonProperty("hs_analytics_first_touch_converting_campaign")
    public void setHsAnalyticsFirstTouchConvertingCampaign(HsAnalyticsFirstTouchConvertingCampaign hsAnalyticsFirstTouchConvertingCampaign) {
        this.hsAnalyticsFirstTouchConvertingCampaign = hsAnalyticsFirstTouchConvertingCampaign;
    }

    @JsonProperty("hs_email_domain")
    public HsEmailDomain getHsEmailDomain() {
        return hsEmailDomain;
    }

    @JsonProperty("hs_email_domain")
    public void setHsEmailDomain(HsEmailDomain hsEmailDomain) {
        this.hsEmailDomain = hsEmailDomain;
    }

    @JsonProperty("elixirsync_external_contact_id")
    public ElixirsyncExternalContactId getElixirsyncExternalContactId() {
        return elixirsyncExternalContactId;
    }

    @JsonProperty("elixirsync_external_contact_id")
    public void setElixirsyncExternalContactId(ElixirsyncExternalContactId elixirsyncExternalContactId) {
        this.elixirsyncExternalContactId = elixirsyncExternalContactId;
    }

    @JsonProperty("hs_calculated_phone_number")
    public HsCalculatedPhoneNumber getHsCalculatedPhoneNumber() {
        return hsCalculatedPhoneNumber;
    }

    @JsonProperty("hs_calculated_phone_number")
    public void setHsCalculatedPhoneNumber(HsCalculatedPhoneNumber hsCalculatedPhoneNumber) {
        this.hsCalculatedPhoneNumber = hsCalculatedPhoneNumber;
    }

    @JsonProperty("email")
    public Email getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Email email) {
        this.email = email;
    }

    @JsonProperty("elixirsync_external_entity")
    public ElixirsyncExternalEntity getElixirsyncExternalEntity() {
        return elixirsyncExternalEntity;
    }

    @JsonProperty("elixirsync_external_entity")
    public void setElixirsyncExternalEntity(ElixirsyncExternalEntity elixirsyncExternalEntity) {
        this.elixirsyncExternalEntity = elixirsyncExternalEntity;
    }

    @JsonProperty("jobtitle")
    public Jobtitle getJobtitle() {
        return jobtitle;
    }

    @JsonProperty("jobtitle")
    public void setJobtitle(Jobtitle jobtitle) {
        this.jobtitle = jobtitle;
    }

    @JsonProperty("hs_analytics_first_visit_timestamp")
    public HsAnalyticsFirstVisitTimestamp getHsAnalyticsFirstVisitTimestamp() {
        return hsAnalyticsFirstVisitTimestamp;
    }

    @JsonProperty("hs_analytics_first_visit_timestamp")
    public void setHsAnalyticsFirstVisitTimestamp(HsAnalyticsFirstVisitTimestamp hsAnalyticsFirstVisitTimestamp) {
        this.hsAnalyticsFirstVisitTimestamp = hsAnalyticsFirstVisitTimestamp;
    }

    @JsonProperty("hs_analytics_first_timestamp")
    public HsAnalyticsFirstTimestamp getHsAnalyticsFirstTimestamp() {
        return hsAnalyticsFirstTimestamp;
    }

    @JsonProperty("hs_analytics_first_timestamp")
    public void setHsAnalyticsFirstTimestamp(HsAnalyticsFirstTimestamp hsAnalyticsFirstTimestamp) {
        this.hsAnalyticsFirstTimestamp = hsAnalyticsFirstTimestamp;
    }

    @JsonProperty("lastmodifieddate")
    public Lastmodifieddate getLastmodifieddate() {
        return lastmodifieddate;
    }

    @JsonProperty("lastmodifieddate")
    public void setLastmodifieddate(Lastmodifieddate lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    @JsonProperty("hs_analytics_last_touch_converting_campaign")
    public HsAnalyticsLastTouchConvertingCampaign getHsAnalyticsLastTouchConvertingCampaign() {
        return hsAnalyticsLastTouchConvertingCampaign;
    }

    @JsonProperty("hs_analytics_last_touch_converting_campaign")
    public void setHsAnalyticsLastTouchConvertingCampaign(HsAnalyticsLastTouchConvertingCampaign hsAnalyticsLastTouchConvertingCampaign) {
        this.hsAnalyticsLastTouchConvertingCampaign = hsAnalyticsLastTouchConvertingCampaign;
    }

    @JsonProperty("hs_social_google_plus_clicks")
    public HsSocialGooglePlusClicks getHsSocialGooglePlusClicks() {
        return hsSocialGooglePlusClicks;
    }

    @JsonProperty("hs_social_google_plus_clicks")
    public void setHsSocialGooglePlusClicks(HsSocialGooglePlusClicks hsSocialGooglePlusClicks) {
        this.hsSocialGooglePlusClicks = hsSocialGooglePlusClicks;
    }

    @JsonProperty("hs_email_optout_6308272")
    public HsEmailOptout6308272 getHsEmailOptout6308272() {
        return hsEmailOptout6308272;
    }

    @JsonProperty("hs_email_optout_6308272")
    public void setHsEmailOptout6308272(HsEmailOptout6308272 hsEmailOptout6308272) {
        this.hsEmailOptout6308272 = hsEmailOptout6308272;
    }

    @JsonProperty("hs_predictivescoringtier")
    public HsPredictivescoringtier getHsPredictivescoringtier() {
        return hsPredictivescoringtier;
    }

    @JsonProperty("hs_predictivescoringtier")
    public void setHsPredictivescoringtier(HsPredictivescoringtier hsPredictivescoringtier) {
        this.hsPredictivescoringtier = hsPredictivescoringtier;
    }

    @JsonProperty("hs_social_facebook_clicks")
    public HsSocialFacebookClicks getHsSocialFacebookClicks() {
        return hsSocialFacebookClicks;
    }

    @JsonProperty("hs_social_facebook_clicks")
    public void setHsSocialFacebookClicks(HsSocialFacebookClicks hsSocialFacebookClicks) {
        this.hsSocialFacebookClicks = hsSocialFacebookClicks;
    }

    @JsonProperty("hs_analytics_source_data_2")
    public HsAnalyticsSourceData2 getHsAnalyticsSourceData2() {
        return hsAnalyticsSourceData2;
    }

    @JsonProperty("hs_analytics_source_data_2")
    public void setHsAnalyticsSourceData2(HsAnalyticsSourceData2 hsAnalyticsSourceData2) {
        this.hsAnalyticsSourceData2 = hsAnalyticsSourceData2;
    }

    @JsonProperty("hs_social_twitter_clicks")
    public HsSocialTwitterClicks getHsSocialTwitterClicks() {
        return hsSocialTwitterClicks;
    }

    @JsonProperty("hs_social_twitter_clicks")
    public void setHsSocialTwitterClicks(HsSocialTwitterClicks hsSocialTwitterClicks) {
        this.hsSocialTwitterClicks = hsSocialTwitterClicks;
    }

    @JsonProperty("hs_analytics_source_data_1")
    public HsAnalyticsSourceData1 getHsAnalyticsSourceData1() {
        return hsAnalyticsSourceData1;
    }

    @JsonProperty("hs_analytics_source_data_1")
    public void setHsAnalyticsSourceData1(HsAnalyticsSourceData1 hsAnalyticsSourceData1) {
        this.hsAnalyticsSourceData1 = hsAnalyticsSourceData1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonAnySetter
	public List<Property> getProperties() {
		return properties;
	}

    @JsonAnySetter
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

    
}

package com.bit.camel.CamelDSL;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Contact {
	@JsonProperty("InstallerID")
	private String installerID;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("EmailAddress")
	private String emailAddress;
	@JsonProperty("RegionID")
	private String regionID;
	@JsonProperty("LanguageID")
	private String languageID;
	@JsonProperty("CompanyName")
	private String companyName;
	@JsonProperty("MarketingConsent")
	private String marketingConsent;
	@JsonProperty("PrivacyConsent")
	private String privacyConsent;
	@JsonProperty("RewardsT&CsConsent")
	private String rewardsTAndCsConsent;
	@JsonProperty("AccountBalance")
	private String accountBalance;
	@JsonProperty("PendingBalance")
	private String pendingBalance;
	@JsonProperty("SignupDate")
	private String signupDate;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("LatestSubmissionDate")
	private String submissionDate;

	public String getInstallerID() {
		return installerID;
	}

	public void setInstallerID(String installerID) {
		this.installerID = installerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getLanguageID() {
		return languageID;
	}

	public void setLanguageID(String languageID) {
		this.languageID = languageID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMarketingConsent() {
		return marketingConsent;
	}

	public void setMarketingConsent(String marketingConsent) {
		this.marketingConsent = marketingConsent;
	}

	public String getPrivacyConsent() {
		return privacyConsent;
	}

	public void setPrivacyConsent(String privacyConsent) {
		this.privacyConsent = privacyConsent;
	}

	public String getRewardsTAndCsConsent() {
		return rewardsTAndCsConsent;
	}

	public void setRewardsTAndCsConsent(String rewardsTAndCsConsent) {
		this.rewardsTAndCsConsent = rewardsTAndCsConsent;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getPendingBalance() {
		return pendingBalance;
	}

	public void setPendingBalance(String pendingBalance) {
		this.pendingBalance = pendingBalance;
	}

	public String getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(String signupDate) {
		this.signupDate = signupDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [installerID=");
		builder.append(installerID);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append(", regionID=");
		builder.append(regionID);
		builder.append(", languageID=");
		builder.append(languageID);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", marketingConsent=");
		builder.append(marketingConsent);
		builder.append(", privacyConsent=");
		builder.append(privacyConsent);
		builder.append(", rewardsTAndCsConsent=");
		builder.append(rewardsTAndCsConsent);
		builder.append(", accountBalance=");
		builder.append(accountBalance);
		builder.append(", pendingBalance=");
		builder.append(pendingBalance);
		builder.append(", signupDate=");
		builder.append(signupDate);
		builder.append(", status=");
		builder.append(status);
		builder.append(", submissionDate=");
		builder.append(submissionDate);
		builder.append("]");
		return builder.toString();
	}

	
}
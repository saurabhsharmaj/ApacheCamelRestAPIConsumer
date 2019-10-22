
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
    "vid",
    "canonical-vid",
    "merged-vids",
    "portal-id",
    "is-contact",
    "profile-token",
    "profile-url",
    "properties",
    "form-submissions",
    "identity-profiles",
    "merge-audits"
})
public class Contact {

    @JsonProperty("vid")
    private Long vid;
    @JsonProperty("canonical-vid")
    private Long canonicalVid;
    @JsonProperty("merged-vids")
    private List<Object> mergedVids = null;
    @JsonProperty("portal-id")
    private Long portalId;
    @JsonProperty("is-contact")
    private Boolean isContact;
    @JsonProperty("profile-token")
    private String profileToken;
    @JsonProperty("profile-url")
    private String profileUrl;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("form-submissions")
    private List<Object> formSubmissions = null;
    @JsonProperty("identity-profiles")
    private List<IdentityProfile> identityProfiles = null;
    @JsonProperty("merge-audits")
    private List<Object> mergeAudits = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("vid")
    public Long getVid() {
        return vid;
    }

    @JsonProperty("vid")
    public void setVid(Long vid) {
        this.vid = vid;
    }

    @JsonProperty("canonical-vid")
    public Long getCanonicalVid() {
        return canonicalVid;
    }

    @JsonProperty("canonical-vid")
    public void setCanonicalVid(Long canonicalVid) {
        this.canonicalVid = canonicalVid;
    }

    @JsonProperty("merged-vids")
    public List<Object> getMergedVids() {
        return mergedVids;
    }

    @JsonProperty("merged-vids")
    public void setMergedVids(List<Object> mergedVids) {
        this.mergedVids = mergedVids;
    }

    @JsonProperty("portal-id")
    public Long getPortalId() {
        return portalId;
    }

    @JsonProperty("portal-id")
    public void setPortalId(Long portalId) {
        this.portalId = portalId;
    }

    @JsonProperty("is-contact")
    public Boolean getIsContact() {
        return isContact;
    }

    @JsonProperty("is-contact")
    public void setIsContact(Boolean isContact) {
        this.isContact = isContact;
    }

    @JsonProperty("profile-token")
    public String getProfileToken() {
        return profileToken;
    }

    @JsonProperty("profile-token")
    public void setProfileToken(String profileToken) {
        this.profileToken = profileToken;
    }

    @JsonProperty("profile-url")
    public String getProfileUrl() {
        return profileUrl;
    }

    @JsonProperty("profile-url")
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("form-submissions")
    public List<Object> getFormSubmissions() {
        return formSubmissions;
    }

    @JsonProperty("form-submissions")
    public void setFormSubmissions(List<Object> formSubmissions) {
        this.formSubmissions = formSubmissions;
    }

    @JsonProperty("identity-profiles")
    public List<IdentityProfile> getIdentityProfiles() {
        return identityProfiles;
    }

    @JsonProperty("identity-profiles")
    public void setIdentityProfiles(List<IdentityProfile> identityProfiles) {
        this.identityProfiles = identityProfiles;
    }

    @JsonProperty("merge-audits")
    public List<Object> getMergeAudits() {
        return mergeAudits;
    }

    @JsonProperty("merge-audits")
    public void setMergeAudits(List<Object> mergeAudits) {
        this.mergeAudits = mergeAudits;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
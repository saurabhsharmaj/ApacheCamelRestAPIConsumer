
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
    "saved-at-timestamp",
    "deleted-changed-timestamp",
    "identities"
})
public class IdentityProfile {

    @JsonProperty("vid")
    private Long vid;
    @JsonProperty("saved-at-timestamp")
    private Long savedAtTimestamp;
    @JsonProperty("deleted-changed-timestamp")
    private Long deletedChangedTimestamp;
    @JsonProperty("identities")
    private List<Identity> identities = null;
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

    @JsonProperty("saved-at-timestamp")
    public Long getSavedAtTimestamp() {
        return savedAtTimestamp;
    }

    @JsonProperty("saved-at-timestamp")
    public void setSavedAtTimestamp(Long savedAtTimestamp) {
        this.savedAtTimestamp = savedAtTimestamp;
    }

    @JsonProperty("deleted-changed-timestamp")
    public Long getDeletedChangedTimestamp() {
        return deletedChangedTimestamp;
    }

    @JsonProperty("deleted-changed-timestamp")
    public void setDeletedChangedTimestamp(Long deletedChangedTimestamp) {
        this.deletedChangedTimestamp = deletedChangedTimestamp;
    }

    @JsonProperty("identities")
    public List<Identity> getIdentities() {
        return identities;
    }

    @JsonProperty("identities")
    public void setIdentities(List<Identity> identities) {
        this.identities = identities;
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

package com.demo.api.e2e.core.modle.api.response.category;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Fees {
    @JsonProperty("Bundle")
    private Double bundle;
    @JsonProperty("EndDate")
    private Double endDate;
    @JsonProperty("Feature")
    private Double feature;
    @JsonProperty("Gallery")
    private Double gallery;
    @JsonProperty("Listing")
    private Double listing;
    @JsonProperty("Reserve")
    private Double reserve;
    @JsonProperty("Subtitle")
    private Double subtitle;
    @JsonProperty("TenDays")
    private Double tenDays;
    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTier> listingFeeTiers = null;
    @JsonProperty("SecondCategory")
    private Double secondCategory;

    @JsonProperty("Bundle")
    public Double getBundle() {
        return bundle;
    }

    @JsonProperty("Bundle")
    public void setBundle(Double bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("EndDate")
    public Double getEndDate() {
        return endDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(Double endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("Feature")
    public Double getFeature() {
        return feature;
    }

    @JsonProperty("Feature")
    public void setFeature(Double feature) {
        this.feature = feature;
    }

    @JsonProperty("Gallery")
    public Double getGallery() {
        return gallery;
    }

    @JsonProperty("Gallery")
    public void setGallery(Double gallery) {
        this.gallery = gallery;
    }

    @JsonProperty("Listing")
    public Double getListing() {
        return listing;
    }

    @JsonProperty("Listing")
    public void setListing(Double listing) {
        this.listing = listing;
    }

    @JsonProperty("Reserve")
    public Double getReserve() {
        return reserve;
    }

    @JsonProperty("Reserve")
    public void setReserve(Double reserve) {
        this.reserve = reserve;
    }

    @JsonProperty("Subtitle")
    public Double getSubtitle() {
        return subtitle;
    }

    @JsonProperty("Subtitle")
    public void setSubtitle(Double subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("TenDays")
    public Double getTenDays() {
        return tenDays;
    }

    @JsonProperty("TenDays")
    public void setTenDays(Double tenDays) {
        this.tenDays = tenDays;
    }

    @JsonProperty("ListingFeeTiers")
    public List<ListingFeeTier> getListingFeeTiers() {
        return listingFeeTiers;
    }

    @JsonProperty("ListingFeeTiers")
    public void setListingFeeTiers(List<ListingFeeTier> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    @JsonProperty("SecondCategory")
    public Double getSecondCategory() {
        return secondCategory;
    }

    @JsonProperty("SecondCategory")
    public void setSecondCategory(Double secondCategory) {
        this.secondCategory = secondCategory;
    }
}

package com.s24.geoip;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.base.MoreObjects;

/**
 * A geolocation database entry.
 */
@JsonAutoDetect(fieldVisibility = ANY, getterVisibility = NONE, isGetterVisibility = NONE)
@JsonInclude(NON_EMPTY)
public final class GeoIpEntry {

    private final String country;
    private final String stateprov;
    private final String city;
    private final String latitude;
    private final String longitude;
    private final String timezone;
    private final String isp;
    private final String organization;
    private final Integer asn;
    private final String asnOrganization;

    private GeoIpEntry(String country, String stateprov, String city,
            String latitude, String longitude, String timezone,
            String isp, String organization, Integer asn, String asnOrganization) {
        this.country = country;
        this.stateprov = stateprov;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.timezone = timezone;
        this.isp = isp;
        this.organization = organization;
        this.asn = asn;
        this.asnOrganization = asnOrganization;
    }

    public String getCountry() {
        return country;
    }

    public String getStateprov() {
        return stateprov;
    }

    public String getCity() {
        return city;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public String getIsp() {
        return isp;
    }

    public String getOrganization() {
        return organization;
    }

    public Integer getAsn() {
        return asn;
    }

    public String getAsnOrganization() {
        return asnOrganization;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("country", country)
                .add("stateprov", stateprov)
                .add("city", city)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .add("timezone", timezone)
                .add("isp", isp)
                .add("organization", organization)
                .add("asn", asn)
                .add("asnOrganization", asnOrganization)
                .toString();
    }

    /**
     * Builder for {@link GeoIpEntry} instances.
     */
    public static final class Builder {
        private String country;
        private String stateprov;
        private String city;
        private String latitude;
        private String longitude;
        private String timezone;
        private String isp;
        private String organization;
        private Integer asn;
        private String asnOrganization;

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setStateprov(String stateprov) {
            this.stateprov = stateprov;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setIsp(String isp) {
            this.isp = isp;
            return this;
        }

        public Builder setOrganization(String organization) {
            this.organization = organization;
            return this;
        }

        public Builder setAsn(Integer asn) {
            this.asn = asn;
            return this;
        }

        public Builder setAsnOrganization(String asnOrganization) {
            this.asnOrganization = asnOrganization;
            return this;
        }

        public GeoIpEntry build() {
            return new GeoIpEntry(country, stateprov, city, latitude, longitude, timezone, isp, organization, asn,
                    asnOrganization);
        }
    }
}

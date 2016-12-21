
package com.bosch.aa.cose.generator.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Gps {

    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("lng")
    @Expose
    private double lng;
    @SerializedName("alt")
    @Expose
    private double alt;
    @SerializedName("sat")
    @Expose
    private int sat;
    @SerializedName("prec")
    @Expose
    private double prec;

    /**
     * 
     * @return
     *     The lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    public Gps withLat(double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * 
     * @return
     *     The lng
     */
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    public void setLng(double lng) {
        this.lng = lng;
    }

    public Gps withLng(double lng) {
        this.lng = lng;
        return this;
    }

    /**
     * 
     * @return
     *     The alt
     */
    public double getAlt() {
        return alt;
    }

    /**
     * 
     * @param alt
     *     The alt
     */
    public void setAlt(double alt) {
        this.alt = alt;
    }

    public Gps withAlt(double alt) {
        this.alt = alt;
        return this;
    }

    /**
     * 
     * @return
     *     The sat
     */
    public int getSat() {
        return sat;
    }

    /**
     * 
     * @param sat
     *     The sat
     */
    public void setSat(int sat) {
        this.sat = sat;
    }

    public Gps withSat(int sat) {
        this.sat = sat;
        return this;
    }

    /**
     * 
     * @return
     *     The prec
     */
    public double getPrec() {
        return prec;
    }

    /**
     * 
     * @param prec
     *     The prec
     */
    public void setPrec(double prec) {
        this.prec = prec;
    }

    public Gps withPrec(double prec) {
        this.prec = prec;
        return this;
    }

}

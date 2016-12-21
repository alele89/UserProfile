
package com.bosch.aa.cose.generator.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MessageData {

    @SerializedName("utc")
    @Expose
    private Long utc;
    @SerializedName("gps")
    @Expose
    private Gps gps;
    @SerializedName("car data")
    @Expose
    private List<CarData> carData;
    @SerializedName("acc")
    @Expose
    private Acceleration acceleration;
    @SerializedName("gyr")
    @Expose
    private Gyroscope gyroscope;

    /**
     * 
     * @return
     *     The utc
     */
    public long getUtc() {
        return utc;
    }

    /**
     * 
     * @param utc
     *     The utc
     */
    public void setUtc(long utc) {
        this.utc = utc;
    }

    public MessageData withUtc(long utc) {
        this.utc = utc;
        return this;
    }

    /**
     * 
     * @return
     *     The gps
     */
    public Gps getGps() {
        return gps;
    }

    /**
     * 
     * @param gps
     *     The gps
     */
    public void setGps(Gps gps) {
        this.gps = gps;
    }

    public MessageData withGps(Gps gps) {
        this.gps = gps;
        return this;
    }

    /**
     * 
     * @return
     *     The carData
     */
    public List<CarData> getCarData() {
        return carData;
    }

    /**
     * 
     * @param carData
     *     The car data
     */
    public void setCarData(List<CarData> carData) {
        this.carData = carData;
    }

    public MessageData withCarData(List<CarData> carData) {
        this.carData = carData;
        return this;
    }

    /**
     * 
     * @return
     *     The acceleration
     */
    public Acceleration getAcceleration() {
        return acceleration;
    }

    /**
     * 
     * @param acceleration
     *     The acceleration
     */
    public void setAcceleration(Acceleration acceleration) {
        this.acceleration = acceleration;
    }

    public MessageData withAcc(Acceleration acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    /**
     * 
     * @return
     *     The gyroscope
     */
    public Gyroscope getGyroscope() {
        return gyroscope;
    }

    /**
     * 
     * @param gyroscope
     *     The gyroscope
     */
    public void setGyroscope(Gyroscope gyroscope) {
        this.gyroscope = gyroscope;
    }

    public MessageData withGyr(Gyroscope gyroscope) {
        this.gyroscope = gyroscope;
        return this;
    }

}

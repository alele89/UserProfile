
package com.bosch.aa.cose.generator.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Acceleration {

    @SerializedName("x")
    @Expose
    private double x;
    @SerializedName("y")
    @Expose
    private double y;
    @SerializedName("z")
    @Expose
    private double z;

    /**
     * 
     * @return
     *     The x
     */
    public double getX() {
        return x;
    }

    /**
     * 
     * @param x
     *     The x
     */
    public void setX(double x) {
        this.x = x;
    }

    public Acceleration withX(double x) {
        this.x = x;
        return this;
    }

    /**
     * 
     * @return
     *     The y
     */
    public double getY() {
        return y;
    }

    /**
     * 
     * @param y
     *     The y
     */
    public void setY(double y) {
        this.y = y;
    }

    public Acceleration withY(double y) {
        this.y = y;
        return this;
    }

    /**
     * 
     * @return
     *     The z
     */
    public double getZ() {
        return z;
    }

    /**
     * 
     * @param z
     *     The z
     */
    public void setZ(double z) {
        this.z = z;
    }

    public Acceleration withZ(double z) {
        this.z = z;
        return this;
    }

}

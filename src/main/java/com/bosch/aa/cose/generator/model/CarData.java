
package com.bosch.aa.cose.generator.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CarData {

    @SerializedName("avid")
    @Expose
    private int avid;
    @SerializedName("value")
    @Expose
    private List<Integer> value = new ArrayList<Integer>();

    /**
     * 
     * @return
     *     The avid
     */
    public int getAvid() {
        return avid;
    }

    /**
     * 
     * @param avid
     *     The avid
     */
    public void setAvid(int avid) {
        this.avid = avid;
    }

    public CarData withAvid(int avid) {
        this.avid = avid;
        return this;
    }

    /**
     * 
     * @return
     *     The value
     */
    public List<Integer> getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    public void setValue(List<Integer> value) {
        this.value = value;
    }

    public CarData withValue(List<Integer> value) {
        this.value = value;
        return this;
    }

}

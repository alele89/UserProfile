
package com.bosch.aa.cose.generator.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Message {

    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("utc")
    @Expose
    private long utc;
    @SerializedName("imsi")
    @Expose
    private long imsi;
    @SerializedName("data")
    @Expose
    private List<List<MessageData>> data = new ArrayList<List<MessageData>>();

    /**
     * 
     * @return
     *     The event
     */
    public String getEvent() {
        return event;
    }

    /**
     * 
     * @param event
     *     The event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    public Message withEvent(String event) {
        this.event = event;
        return this;
    }

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

    public Message withUtc(long utc) {
        this.utc = utc;
        return this;
    }

    /**
     * 
     * @return
     *     The imsi
     */
    public long getImsi() {
        return imsi;
    }

    /**
     * 
     * @param imsi
     *     The imsi
     */
    public void setImsi(long imsi) {
        this.imsi = imsi;
    }

    public Message withImsi(long imsi) {
        this.imsi = imsi;
        return this;
    }

    /**
     * 
     * @return
     *     The data
     */
    public List<List<MessageData>> getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    public void setData(List<List<MessageData>> data) {
        this.data = data;
    }

    public Message withData(List<List<MessageData>> data) {
        this.data = data;
        return this;
    }

}

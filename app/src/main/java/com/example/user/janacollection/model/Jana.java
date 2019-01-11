package com.example.user.janacollection.model;

import com.google.gson.annotations.SerializedName;

public class Jana {

    @SerializedName("Collection_MC_Code")
    private String Collection_MC_Code;
    @SerializedName("Collection_MC_Name")
    private String Collection_MC_Name;
    @SerializedName("URN_Number")
    private String URN_Number;
    @SerializedName("CREC_ID")
    private String CREC_ID;
    @SerializedName("CREC_Name")
    private String CREC_Name;
    @SerializedName("Collection_MC_Latitude")
    private double Collection_MC_Latitude;
    @SerializedName("Collection_MC_Longitude")
    private double Collection_MC_Longitude;
    @SerializedName("CollectionStatus")
    private int CollectionStatus;
    @SerializedName("CollectionReason")
    private String CollectionReason;
    @SerializedName("CollectionReasonID")
    private int CollectionReasonID;
    @SerializedName("Collection_Preffered_Time")
    private String Collection_Preffered_Time;

    public String getCollection_MC_Code() {
        return Collection_MC_Code;
    }

    public void setCollection_MC_Code(String collection_MC_Code) {
        Collection_MC_Code = collection_MC_Code;
    }

    public String getCollection_MC_Name() {
        return Collection_MC_Name;
    }

    public void setCollection_MC_Name(String collection_MC_Name) {
        Collection_MC_Name = collection_MC_Name;
    }

    public String getURN_Number() {
        return URN_Number;
    }

    public void setURN_Number(String URN_Number) {
        this.URN_Number = URN_Number;
    }

    public String getCREC_ID() {
        return CREC_ID;
    }

    public void setCREC_ID(String CREC_ID) {
        this.CREC_ID = CREC_ID;
    }

    public String getCREC_Name() {
        return CREC_Name;
    }

    public void setCREC_Name(String CREC_Name) {
        this.CREC_Name = CREC_Name;
    }

    public double getCollection_MC_Latitude() {
        return Collection_MC_Latitude;
    }

    public void setCollection_MC_Latitude(double collection_MC_Latitude) {
        Collection_MC_Latitude = collection_MC_Latitude;
    }

    public double getCollection_MC_Longitude() {
        return Collection_MC_Longitude;
    }

    public void setCollection_MC_Longitude(double collection_MC_Longitude) {
        Collection_MC_Longitude = collection_MC_Longitude;
    }

    public int getCollectionStatus() {
        return CollectionStatus;
    }

    public void setCollectionStatus(int collectionStatus) {
        CollectionStatus = collectionStatus;
    }

    public String getCollectionReason() {
        return CollectionReason;
    }

    public void setCollectionReason(String collectionReason) {
        CollectionReason = collectionReason;
    }

    public int getCollectionReasonID() {
        return CollectionReasonID;
    }

    public void setCollectionReasonID(int collectionReasonID) {
        CollectionReasonID = collectionReasonID;
    }

    public String getCollection_Preffered_Time() {
        return Collection_Preffered_Time;
    }

    public void setCollection_Preffered_Time(String collection_Preffered_Time) {
        Collection_Preffered_Time = collection_Preffered_Time;
    }
}

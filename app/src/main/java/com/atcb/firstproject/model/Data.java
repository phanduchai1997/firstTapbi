package com.atcb.firstproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("data")
    @Expose
    private List<Datum> listData;
    public List<Datum> getListData() {
        return listData;
    }
}

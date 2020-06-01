package com.atcb.firstproject.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.atcb.firstproject.R;
import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("package_name")
    @Expose
    private String packageName;
    @SerializedName("real_package_name")
    @Expose
    private String realPackageName;
    @SerializedName("downloads")
    @Expose
    private Integer downloads;
    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("ctime")
    @Expose
    private String ctime;
    @SerializedName("promotion_image_url")
    @Expose
    private String promotionImageUrl;

    @SerializedName("preview_gif_image_url")
    @Expose
    private String previewGifImageUrl;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("dimension")
    @Expose
    private String dimension;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getRealPackageName() {
        return realPackageName;
    }

    public void setRealPackageName(String realPackageName) {
        this.realPackageName = realPackageName;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getPromotionImageUrl() {
        return promotionImageUrl;
    }

    public void setPromotionImageUrl(String promotionImageUrl) {
        this.promotionImageUrl = promotionImageUrl;
    }


    public String getPreviewGifImageUrl() {
        return previewGifImageUrl;
    }

    public void setPreviewGifImageUrl(String previewGifImageUrl) {
        this.previewGifImageUrl = previewGifImageUrl;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

}



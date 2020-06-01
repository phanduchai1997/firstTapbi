package com.atcb.firstproject.database;

import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.atcb.firstproject.R;
import com.bumptech.glide.Glide;

@Entity(tableName = "Data")
public class DatumDatabase {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private String name;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @BindingAdapter({"android:image"})
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .error(R.mipmap.ic_launcher)
                .into(view);
    }
}

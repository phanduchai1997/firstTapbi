package com.atcb.firstproject.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.atcb.firstproject.R;
import com.atcb.firstproject.database.DatumDatabase;
import com.atcb.firstproject.databinding.LayoutDatumBinding;
import com.atcb.firstproject.model.Datum;

import java.util.ArrayList;
import java.util.List;

public class DatumAdapter extends RecyclerView.Adapter<DatumAdapter.ViewHolder> {
    private List<DatumDatabase> mListDatum;

    public DatumAdapter(List<DatumDatabase> mListDatum) {
        this.mListDatum = mListDatum;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutDatumBinding datumBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.layout_datum,parent,false);
        return new ViewHolder(datumBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DatumDatabase datum = mListDatum.get(position);
        if(datum.getName().equals(""))
            datum.setName("OK");
        holder.datumBinding.setData(datum);

    }


    @Override
    public int getItemCount() {
        return mListDatum.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LayoutDatumBinding datumBinding;
        public ViewHolder(@NonNull LayoutDatumBinding itemView) {
            super(itemView.getRoot());
            datumBinding = itemView;
        }
    }
}

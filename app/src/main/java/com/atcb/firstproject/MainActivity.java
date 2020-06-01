package com.atcb.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Dao;
import androidx.room.Room;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Toast;

import com.atcb.firstproject.adapter.DatumAdapter;
import com.atcb.firstproject.api.DataApi;
import com.atcb.firstproject.api.Service;
import com.atcb.firstproject.database.AppDatabase;
import com.atcb.firstproject.database.DAO;
import com.atcb.firstproject.database.DatumDatabase;
import com.atcb.firstproject.databinding.ActivityMainBinding;
import com.atcb.firstproject.model.Data;
import com.atcb.firstproject.model.Datum;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private DatumAdapter adapter;
    private List<DatumDatabase> mDatumList;
    DAO dao;
    AppDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

       mainBinding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        database = Room.databaseBuilder(this, AppDatabase.class, "Data")
                .allowMainThreadQueries()
                .build();
        dao = database.getDataDAO();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mDatumList = new ArrayList<>();
        adapter = new DatumAdapter(mDatumList);
        new AddListData().execute();
        mainBinding.rvMain.setLayoutManager(layoutManager);
        mainBinding.rvMain.setAdapter(adapter);

    }
    public class AddListData extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            addListDatum();
            return null;
        }
    }

    private void addListDatum() {
         Call<Data> call = DataApi.getmService().getData();
         call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
                if(response.isSuccessful()){
                    Data data = response.body();
                    if(data!=null){
                       List<Datum> list = data.getListData();
                       for (int i=0;i<list.size();i++){
                           DatumDatabase datumDatabase = new DatumDatabase();
                           datumDatabase.setName(list.get(i).getRealPackageName());
                           datumDatabase.setImage(list.get(i).getPromotionImageUrl());
                           mDatumList.add(datumDatabase);
                       }
                       dao.insertALl(mDatumList);
                       adapter.notifyDataSetChanged();

                    }
                }
            }
            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                Toast.makeText(MainActivity.this,"cant connect",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.pmondal.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ImageModel> modelClassList;
    private RecyclerView recyclerView;
    Adapter adapter;
    CardView mNature,mBus,mTruck,mTrain,mCar,mTrending;
    EditText editText;
    ImageButton search;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recyclerview);
        mNature = findViewById(R.id.nature);
        mBus = findViewById(R.id.bus);
        mTruck = findViewById(R.id.truck);
        mTrain = findViewById(R.id.train);
        mCar = findViewById(R.id.car);
        mTrending = findViewById(R.id.trending);
        editText = findViewById(R.id.editText);
        search = findViewById(R.id.search);

        modelClassList = new ArrayList<>();
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        adapter = new Adapter(getApplicationContext(),modelClassList);
        recyclerView.setAdapter(adapter);
        findPhotos();
        mNature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "nature";
                getsearchimage(query);
            }
        });

        mCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "car";
                getsearchimage(query);
            }
        });

        mTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "train";
                getsearchimage(query);
            }
        });

        mTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "truck";
                getsearchimage(query);
            }
        });

        mBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = "bus";
                getsearchimage(query);
            }
        });

        mTrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findPhotos();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = editText.getText().toString().trim().toLowerCase();
                if (query.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Enter something",Toast.LENGTH_SHORT).show();

                }
                else
                {
                    getsearchimage(query);
                }
            }
        });

    }

    private void getsearchimage(String query) {
    }

    private void findPhotos() {


    }
}
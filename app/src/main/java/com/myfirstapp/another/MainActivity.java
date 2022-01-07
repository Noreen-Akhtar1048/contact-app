package com.myfirstapp.another;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String arr[] = {"Noreen Akhtar,Shahbaz Akram,Noor Asim,Fahad Ali,Nida Aslam," +
                "Rida Abid,Ifra Munir,Iqra Rasheed,Aneha Malik,Fahad Azeem,Haider Ali,Abbas Ali,Parveen Akhtar,Tayyab Ali," +
                "Aqsa Saleem, Samia Mughal,Minhaj Ali, Yasir Ali"};
        recyclerView.setAdapter(new myadapter(arr));
    }
}
package com.daffzzaqihaq.planets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaPlanet,detailPlanet;
    int[] gambarPlanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        namaPlanet = getResources().getStringArray(R.array.planets_name);
        detailPlanet = getResources().getStringArray(R.array.planets_detail);
        gambarPlanet = new int[]{R.drawable.jupiter, R.drawable.saturnus, R.drawable.uranus, R.drawable.neptunus, R.drawable.bumi, R.drawable.venus, R.drawable.mars, R.drawable.merkurius};

        Adapter adapter = new Adapter(RecycleActivity.this, gambarPlanet,namaPlanet,detailPlanet);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);
    }
}

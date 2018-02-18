package com.example.awl.sitiaulianoor_1202151364_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContentMenu extends AppCompatActivity {
    private List<menu> menuList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new MenuAdapter(this, menuList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();

    }

    private void prepareMovieData() {
        menu menu = new menu(R.drawable.bakso, "Bakso", "Rp. 15.000", R.string.bakso);
        menuList.add(menu);

        menu = new menu(R.drawable.nasgor, "Nasi Goreng", "Rp. 15.000", R.string.nasgor);
        menuList.add(menu);
        menu = new menu(R.drawable.sotobanjar, "Soto Banjar", "Rp. 20.000", R.string.sotobanjar);
        menuList.add(menu);
        menu = new menu(R.drawable.cumi, "Cumi Goreng Tepung", "Rp. 12.000", R.string.cumi);
        menuList.add(menu);
        menu = new menu(R.drawable.sate, "Sate", "Rp. 18.000", R.string.sate);
        menuList.add(menu);
        menu = new menu(R.drawable.ayambakaar, "Ayam Bakar", "Rp. 18.000", R.string.ayambakar);
        menuList.add(menu);





        // mAdapter.notifyDataSetChanged();
    }
}

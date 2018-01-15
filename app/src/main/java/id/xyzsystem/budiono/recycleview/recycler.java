package id.xyzsystem.budiono.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class recycler extends AppCompatActivity {
    RecyclerView rview;
    List<model> profList = new ArrayList<>();
    adapter profAdapter;
    model profModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycler);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rview = (RecyclerView) findViewById(R.id.budi_recyler);
        profAdapter = new adapter(getApplicationContext(), profList);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(getApplicationContext());
        rview.setLayoutManager(lm);
        rview.setItemAnimator(new DefaultItemAnimator());
        rview.setAdapter(profAdapter);

        data();

    }
    private void tambahdata(int gambar, String eng, String indo) {
        profModel = new model(gambar, eng, indo);
        profList.add(profModel);
    }

    private void data() {
        tambahdata(R.drawable.chef, "Chef", "Koki");
        tambahdata(R.drawable.doctor, "Doctor", "Dokter");
        tambahdata(R.drawable.farmer, "Farmer", "Petani");
        tambahdata(R.drawable.judge, "Judge", "Hakim");
        tambahdata(R.drawable.pilot, "Pilot", "Pilot");
        tambahdata(R.drawable.policeman, "Policeman", "Polisi");
        tambahdata(R.drawable.teacher, "Teacher", "Guru");
        tambahdata(R.drawable.writer, "Writer", "Penulis");
    }
}

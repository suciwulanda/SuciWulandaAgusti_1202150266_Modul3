package com.android.suci.suciwulandaagusti_1202150266_modul3;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class ListMineral extends AppCompatActivity {

    private final LinkedList<String> nTitle = new LinkedList<>();
    private final LinkedList<String> nDesc = new LinkedList<>();
    private final LinkedList<Integer> nPhotos = new LinkedList<>();

    private RecyclerView recycle;
    private RecycleMineral mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mineral);

        recycle = (RecyclerView)findViewById(R.id.recycle);

        mAdapter = new RecycleMineral(this, nTitle, nDesc, nPhotos);

        recycle.setAdapter(mAdapter);

        recycle.setLayoutManager(new LinearLayoutManager(this));

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            recycle.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            recycle.setLayoutManager(new LinearLayoutManager(this));
        }

        data(); //memanggil isi data

    }

    //memberikan nama atau judul pada daftar minuman
    private void data(){
        nTitle.add("Aqua");
        nTitle.add("Ades");
        nTitle.add("Club");
        nTitle.add("Equil");
        nTitle.add("Cleo");
        nTitle.add("Evian");
        nTitle.add("Vit");
        nTitle.add("Lemineral");
        nTitle.add("Nestle");
        nTitle.add("Pristine");
        nTitle.add("Amidis");


//menambahkan deskripsi pada daftar minuman
        nDesc.add("Ini Adalah Air Minum Merk Agua");
        nDesc.add("Ini Adalah Air Minum Merk Ades");
        nDesc.add("Ini Adalah Air Minum Merk Club");
        nDesc.add("Ini Adalah Air Minum Merk Equil");
        nDesc.add("Ini Adalah Air Minum Merk Cleo");
        nDesc.add("Ini Adalah Air Minum Merk Evian");
        nDesc.add("Ini Adalah Air Minum Merk Vit");
        nDesc.add("Ini Adalah Air Minum Merk Lamineral");
        nDesc.add("Ini Adalah Air Minum Merk Nestle");
        nDesc.add("Ini Adalah Air Minum Merk Pristine");
        nDesc.add("Ini Adalah Air Minum Merk Amidis");


//menambahkan gambar pada daftar minuman
        nPhotos.add(R.drawable.aqua);
        nPhotos.add(R.drawable.ades);
        nPhotos.add(R.drawable.club);
        nPhotos.add(R.drawable.equil);
        nPhotos.add(R.drawable.cleo);
        nPhotos.add(R.drawable.evian);
        nPhotos.add(R.drawable.vit);
        nPhotos.add(R.drawable.leminerale);
        nPhotos.add(R.drawable.nestle);
        nPhotos.add(R.drawable.pristine);
        nPhotos.add(R.drawable.amidis);
    }
}

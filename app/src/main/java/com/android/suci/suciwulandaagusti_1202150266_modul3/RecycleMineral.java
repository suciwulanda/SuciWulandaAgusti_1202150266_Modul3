package com.android.suci.suciwulandaagusti_1202150266_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by SuciWulanda on 2/24/2018.
 */

public class RecycleMineral extends RecyclerView.Adapter<RecycleMineral.MineralHolder> {

    private final LinkedList<String> title;
    private final LinkedList<String> descrip;
    private final LinkedList<Integer> photos;

    private LayoutInflater inflate;



    public RecycleMineral(Context context, LinkedList<String> nTitle, LinkedList<String> nDesc, LinkedList<Integer> nPhotos) {

        inflate = LayoutInflater.from(context);
        this.title = nTitle;
        this.descrip = nDesc;
        this.photos = nPhotos;
    }

    @Override
    public MineralHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View ListView = inflate.inflate(R.layout.mineral, parent,false);
        return new MineralHolder(ListView,this);


    }

    @Override
    public void onBindViewHolder(MineralHolder holder, int position) {
        String CurrentTittle = title.get(position);
        String CurrentDesc = descrip.get(position);
        Integer CurrentPhoto = photos.get(position);

        holder.Title.setText(CurrentTittle);
        holder.Desc.setText(CurrentDesc);
        holder.Image.setImageResource(CurrentPhoto);


    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public LinkedList<String> getTitle(){
        return title;
    }

    public class MineralHolder extends RecyclerView.ViewHolder {
        private final TextView Title;
        public final TextView Desc;
        private final ImageView Image;

        final RecycleMineral mAdapter;

        public MineralHolder(final View itemView, RecycleMineral madapter1){
            super(itemView);
            Title = (TextView) itemView.findViewById(R.id.title);
            Desc = (TextView) itemView.findViewById(R.id.descrip);
            Image = (ImageView) itemView.findViewById(R.id.photo);

            Image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getLayoutPosition();

                    String titles = title.get(position);
                    String descs = descrip.get(position);
                    Integer photo = photos.get(position);

                    Intent intent = new Intent(itemView.getContext(),DetailDrink.class);
                    intent.putExtra("titles", titles);
                    intent.putExtra("desc", descs);
                    intent.putExtra("photo", photo);

                    itemView.getContext().startActivity(intent);


                }
            });
            this.mAdapter = madapter1;
        }
    }
}

package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListViewHolder> {
    private ArrayList<TempatWisata> listwisata;

    public Adapter(ArrayList<TempatWisata> list){
        this.listwisata= list;
    };
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new  ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.tvName.setText(listwisata.get(position).getName());
        holder.tvDetail.setText(listwisata.get(position).getDesc());
        holder.imgPhoto.setImageResource(listwisata.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return (listwisata != null) ? listwisata.size() : 0;
    }



    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_wisata);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
        }
    }
}

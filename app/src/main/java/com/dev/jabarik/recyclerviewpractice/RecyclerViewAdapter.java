package com.dev.jabarik.recyclerviewpractice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> titles;
    private ArrayList<String> links;


    public RecyclerViewAdapter(ArrayList<String> titles, ArrayList<String> links) {
        this.titles = titles;
        this.links = links;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_card, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(titles.get(position));

        Picasso.get().load(links.get(position)).placeholder(R.drawable.ic_launcher_background).error(R.drawable.ic_launcher_background).into(holder.imageView);
    }



    @Override
    public int getItemCount() {
        return titles.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.rv_imageView);
            textView = (TextView) itemView.findViewById(R.id.rv_textView);
        }


    }
}

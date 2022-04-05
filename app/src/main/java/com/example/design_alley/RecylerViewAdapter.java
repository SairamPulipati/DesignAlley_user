package com.example.design_alley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecylerViewAdapter.MyViewHolder> {
//      private ArrayList<String> Images;
//      private Context context1;
    private ArrayList<MainModel> data;

    private Context context;
    public RecylerViewAdapter(Context context,ArrayList<MainModel> images){
        this.context = context;
        this.data = images;
    }

    @NonNull
    @Override
    public RecylerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecylerViewAdapter.MyViewHolder holder, int position) {
  holder.imageView.setImageResource(data.get(position).getGallery());
//        Glide.with(context1)
//                .asBitmap()
//                .load(Images.get(position))
//                .into(holder.imageView);
//        holder.imageView.setOnClickListener(new View.OnClickListener() {
         //   @Override
//            public void onClick(View view) {

//            }
//        });

    }

    @Override
    public int getItemCount() {
        return data.size();

    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imageView;
        public MyViewHolder(View itemview){
            super(itemview);
            imageView = itemview.findViewById(R.id.list_items1_image);
        }
    }
}

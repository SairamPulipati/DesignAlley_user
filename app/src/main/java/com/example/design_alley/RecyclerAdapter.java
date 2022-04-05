package com.example.design_alley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder1> {
    private ArrayList<Mainmodel1> list;
    private Context context;
    public RecyclerAdapter(Context context1,ArrayList<Mainmodel1> info){
        this.context = context1;
        this.list = info;
    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items2,parent,false);
        return new MyViewHolder1(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder1 holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImageslist());
        holder.textView.setText(list.get(position).getNames());
     //holder.imageView.setImageResource(list.get(position).getImagelist());
    // holder.textView.setText(list.get(position).getNames());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder{
       ImageView imageView;
       TextView textView;

        public MyViewHolder1(View itemview){
            super(itemview);
            imageView = itemview.findViewById(R.id.list_items2_image);
            textView = itemview.findViewById(R.id.list_items2_tv_title);
        }
    }
}

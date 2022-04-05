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

public class RecyclerAdapter3 extends RecyclerView.Adapter<RecyclerAdapter3.MyViewHolder3> {
    private ArrayList<Mainmodel2> info;
    private Context context3;
    public RecyclerAdapter3(Context Context3,ArrayList<Mainmodel2> Info){
        this.context3 =Context3;
        this.info = Info;
    }

    @NonNull
    @Override
    public MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items3,parent,false);
        return new MyViewHolder3(view3);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder3 holder, int position) {
        holder.imageView3.setImageResource(info.get(position).getImageinfo());
        holder.textView3.setText(info.get(position).getLabels());
    }

    @Override
    public int getItemCount() {
        return info.size();
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder{
        ImageView imageView3;
        TextView textView3;
        public MyViewHolder3(@NonNull View itemView3) {
           super(itemView3);
            imageView3 = itemView3.findViewById(R.id.list_items3_image);
            textView3 = itemView3.findViewById(R.id.list_items3_tv_title);
       }
   }
}

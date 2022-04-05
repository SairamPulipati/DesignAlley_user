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

public class PaymentMoreRecycler extends RecyclerView.Adapter<PaymentMoreRecycler.MyViewHolder4> {
    private ArrayList<moreModel> more;

    public PaymentMoreRecycler(ArrayList<moreModel> more) {
        this.more =more;
    }

    @NonNull
    @Override
    public MyViewHolder4 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewm = LayoutInflater.from(parent.getContext()).inflate(R.layout.payment_more,parent,false);
        return new MyViewHolder4(viewm);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder4 holder, int position) {
     holder.imageViewm.setImageResource(more.get(position).getIcons());
     holder.textViewm.setText(more.get(position).getDetails());
    }

    @Override
    public int getItemCount() {
        return more.size();
    }

    public class MyViewHolder4 extends RecyclerView.ViewHolder{
        ImageView imageViewm;
        TextView textViewm;
        public MyViewHolder4(@NonNull View itemViewm) {
            super(itemViewm);
            imageViewm = itemViewm.findViewById(R.id.payment_more_image);
            textViewm = itemViewm.findViewById(R.id.payment_more_tv_title);
        }
    }
}

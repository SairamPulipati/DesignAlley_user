package com.example.design_alley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.MyViewHolderChat> {
    private ArrayList<chatModel> info;
    private Context chatContext;
    public ChatAdapter(Context ChatContext,ArrayList<chatModel> inmessages){
        this.chatContext = ChatContext;
        this.info = inmessages;

    }
    @NonNull
    @Override
    public ChatAdapter.MyViewHolderChat onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View chatview = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_items,parent,false);
        return new MyViewHolderChat(chatview);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.MyViewHolderChat holder, int position) {
     holder.chatin.setText(info.get(position).getInmessages());
     holder.chatout.setText(info.get(position).getOutMesages());

    }

    @Override
    public int getItemCount() {
        return info.size();
    }
    public class MyViewHolderChat extends RecyclerView.ViewHolder{
        private TextView chatin,chatout;
        public MyViewHolderChat(@NonNull View itemView) {
            super(itemView);
            chatin = itemView.findViewById(R.id.chat_tv_text1);
            chatout = itemView.findViewById(R.id.chat_tv_text2);
        }
    }
}

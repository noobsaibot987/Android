package com.example.learningenglish;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder> {

    ArrayList<String> word;
    Context context;

    public MyListAdapter(ArrayList<String> word, Context context) {
        this.word = word;
        this.context = context;
    }


    @NonNull
    @Override
    public MyListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);

        MyListAdapter.ViewHolder viewHolder = new MyListAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyListAdapter.ViewHolder holder, int position) {
        word = new ArrayList<String>();

        word.add("Hello ");
        word.add("Mello");

        holder.textView.setText((String) word.get(position));
    }

    @Override
    public int getItemCount() {
        return word.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textView;

        public ViewHolder(View view){
            super(view);

            textView = view.findViewById(R.id.textView);

        }

    }


}

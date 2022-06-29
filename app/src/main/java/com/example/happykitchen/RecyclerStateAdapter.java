package com.example.happykitchen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerStateAdapter extends RecyclerView.Adapter<RecyclerStateAdapter.ViewHolder>
{

    Context context;
    ArrayList<StateModule> arrState;

    RecyclerStateAdapter(Context context , ArrayList<StateModule> arrState)
    {
        this.context = context;
        this.arrState = arrState;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.state_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.txt1.setText(arrState.get(position).txt1);
        holder.txt2.setText(arrState.get(position).txt2);
        holder.img.setImageResource(arrState.get(position).img);
        holder.txt3.setText(arrState.get(position).txt3);
    }

    @Override
    public int getItemCount() {
        return arrState.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt1,txt2,txt3;
        ImageView img;

        public ViewHolder(View v)
        {
            super(v);
            txt1 = v.findViewById(R.id.txt1);
            txt2 = v.findViewById(R.id.txt2);
            img = v.findViewById(R.id.img);
            txt3 = v.findViewById(R.id.txt3) ;
        }
    }
}
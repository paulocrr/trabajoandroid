package com.example.paulo.mychat;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created by paulo on 6/9/2017.
 */

public class RecyclerViewContactos extends RecyclerView.Adapter<View_Holder> {
    List<ItemsContactos> list = Collections.emptyList();
    Context context;
    private int lastPosition = -1;
    public RecyclerViewContactos(List<ItemsContactos>list, Context context){
        this.list=list;
        this.context=context;
    }
    @Override
    public View_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_contacto,parent,false);
        View_Holder holder = new View_Holder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(View_Holder holder, int position) {
        holder.contacto.setText(list.get(position).nombre);
        holder.contacto.setTag(list.get(position).id);
        setAnimation(holder.cv, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        viewToAnimate.startAnimation(animation);
        lastPosition = position;
    }
}

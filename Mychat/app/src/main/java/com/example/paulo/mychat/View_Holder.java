package com.example.paulo.mychat;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by paulo on 6/9/2017.
 */

public class View_Holder extends RecyclerView.ViewHolder{
    CardView cv;
    TextView contacto;
    View_Holder(final View itemView){
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.itemCategoria);
        contacto = (TextView)itemView.findViewById(R.id.categoria);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int id = Integer.parseInt(categoria.getTag().toString());
                //Toast.makeText(itemView.getContext(), categoria.getTag().toString(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(itemView.getContext(),MensajeActivity.class);
                i.putExtra("nom", contacto.getText().toString());
                itemView.getContext().startActivity(i);
            }
        });
    }
}
package com.example.administrador.encal.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrador.encal.Pojos.PojoMarco;
import com.example.administrador.encal.R;

import java.util.ArrayList;

/**
 * Created by Administrador on 17/11/2017.
 */

public class AdapterMarco extends RecyclerView.Adapter<AdapterMarco.ViewHolder>{

    public AdapterMarco(ArrayList<PojoMarco> items,OnItemClickListener listener ) {
        this.items = items;
        this.listener = listener;

    }

    public interface OnItemClickListener {
        void onItemClick(PojoMarco item);
    }
    public final OnItemClickListener listener;
    private ArrayList<PojoMarco> items;


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_marco,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtCampo1.setText(items.get(position).getItem1());
        holder.txtCampo2.setText(items.get(position).getItem2());
        holder.txtCampo3.setText(items.get(position).getItem3());
        holder.txtCampo4.setText(items.get(position).getItem4());
        holder.clickItem(items.get(position),position,listener);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtCampo1;
        TextView txtCampo2;
        TextView txtCampo3;
        TextView txtCampo4;

        public ViewHolder(View itemView) {
            super(itemView);
            txtCampo1 = (TextView) itemView.findViewById(R.id.item_campo1);
            txtCampo2 = (TextView) itemView.findViewById(R.id.item_campo2);
            txtCampo3 = (TextView) itemView.findViewById(R.id.item_campo3);
            txtCampo4 = (TextView) itemView.findViewById(R.id.item_campo4);
        }
        public void clickItem(final PojoMarco item, int posicion, final OnItemClickListener clickListener){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onItemClick(item);
                }
            });
        }
    }
}

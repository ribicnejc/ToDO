package com.example.povio.todo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.InfoViewHolder> {
    private Context mContext;
    public static class InfoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private View.OnClickListener clickListener;
        CardView cv;
        TextView thingTodo;
        TextView type;
        ImageView typePhoto;

        InfoViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            thingTodo = (TextView)itemView.findViewById(R.id.todo);
            type = (TextView)itemView.findViewById(R.id.type);
            typePhoto = (ImageView)itemView.findViewById(R.id.typePhoto);
        }

        @Override
        public void onClick(View v) {
            clickListener.onClick(v);
        }
    }

    List<Data> data;

    public RVAdapter(List<Data> data, Context ctx){
        this.data = data;
        this.mContext = ctx;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        InfoViewHolder pvh = new InfoViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(InfoViewHolder weatherViewHolder, final int i) {
        weatherViewHolder.thingTodo.setText(data.get(i).name);
        weatherViewHolder.type.setText(data.get(i).type);
        weatherViewHolder.typePhoto.setImageResource(data.get(i).photoID);
        weatherViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Thing has been pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}

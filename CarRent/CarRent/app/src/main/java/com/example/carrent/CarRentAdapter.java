package com.example.carrent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrent.model.Car;

public class CarRentAdapter extends RecyclerView.Adapter<CarRentAdapter.ViewHolder> {
    Car[] data;

    public CarRentAdapter(Car[] data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        CardView view = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_image,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardView cardView = holder.cardView;

        ImageView imageView = (ImageView) cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(),data[position].getImgId());
        imageView.setImageDrawable(dr);

        TextView price = (TextView) cardView.findViewById(R.id.price);
        price.setText(data[position].getPrice());

        TextView type = (TextView)  cardView.findViewById(R.id.auto_type);
        type.setText(data[position].getType());


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public CardView cardView;

        public ViewHolder(CardView cardView) {
            super(cardView);
            this.cardView=cardView;
        }
    }
}

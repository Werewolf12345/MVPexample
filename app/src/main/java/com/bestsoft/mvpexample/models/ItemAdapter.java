package com.bestsoft.mvpexample.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bestsoft.mvpexample.R;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private Context context;
    private List<Item> itemList;

    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);

        holder.textViewTitle.setText(item.getTitle());
        holder.textViewSubtitle.setText(item.getSubtitle());
        holder.imageView.setImageBitmap(ItemsRepository.getBitmapFromString(item.getImage()));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        TextView textViewSubtitle;
        ImageView imageView;

        ItemViewHolder(View itemView) {
            super(itemView);

            this.textViewTitle = itemView.findViewById(R.id.img_title);
            this.textViewSubtitle = itemView.findViewById(R.id.img_subtitle);
            this.imageView = itemView.findViewById(R.id.image);
        }
    }
}
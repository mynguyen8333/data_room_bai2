package com.example.database_room_bai2;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    ArrayList<Dulich> mDuliches;

    public CustomAdapter(ArrayList<Dulich> mDuliches, MainActivity mainActivity) {
        this.mDuliches = mDuliches;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.dulich_item,parent,false);
        return new ViewHolder(view);
    }



    @Override
    public int getItemCount() {
        return mDuliches.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageButton imgbtnxoa,imgbtnsua;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgbtnxoa =itemView.findViewById(R.id.imgbutton_xoa);
            imgbtnsua =itemView.findViewById(R.id.imgbutton_sua);
            tvName = itemView.findViewById(R.id.tv_nametp);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        Dulich dulich = mDuliches.get(position);
        holder.tvName.setText(dulich.getTv_name());
        holder.imgbtnxoa.setImageResource(dulich.getImg_xoa());
        holder.imgbtnsua.setImageResource(dulich.getImg_sua());

    }
}

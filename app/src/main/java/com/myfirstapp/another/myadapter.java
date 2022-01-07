package com.myfirstapp.another;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myadapter extends RecyclerView.Adapter<myadapter.holder>
{
    String data[];
    public myadapter(String[] data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_row_design,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position)
    {
        holder.text_name.setText(position);
    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    class holder extends RecyclerView.ViewHolder{

        ImageView image_alphabet,image_call,image_outgoing;
        TextView text_jazz,text_phone,text_day,text_name,text_transparent;

        public holder(@NonNull View itemView) {
            super(itemView);
            image_alphabet = itemView.findViewById(R.id.image_alphabet);
            image_call = itemView.findViewById(R.id.image_call);
            image_outgoing = itemView.findViewById(R.id.image_outgoing);
            text_jazz = itemView.findViewById(R.id.textjazz);
            text_day = itemView.findViewById(R.id.text_day);
            text_name = itemView.findViewById(R.id.text_name);
            text_phone = itemView.findViewById(R.id.text_phone);
            text_transparent = itemView.findViewById(R.id.text_transparent);
        }
    }
}

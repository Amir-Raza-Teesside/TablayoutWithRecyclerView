package uk.ac.tees.aad.tabfrag;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myadapter.myviewholder> {

    public ArrayList<Model> list;


    public myadapter(ArrayList<Model> list) {
        this.list = list;

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {


        holder.imageView.setImageResource(list.get(position).getImage());
        holder.txt1.setText(list.get(position).getFirtText());
        holder.txt2.setText(list.get(position).getSecondText());}


    @Override
    public int getItemCount() {
        return list.size();

    }

    class  myviewholder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView txt1,txt2;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            txt1 = itemView.findViewById(R.id.txt1);
            txt2 = itemView.findViewById(R.id.txt2);
        }
    }
}

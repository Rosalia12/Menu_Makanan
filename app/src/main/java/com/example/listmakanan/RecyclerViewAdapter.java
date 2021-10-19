package com.example.listmakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> fotomakanan=new ArrayList<>();
    private ArrayList<String> namamakanan=new ArrayList<>();
    private ArrayList<String> infomakanan=new ArrayList<>();

    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotomakanan, ArrayList<String> namamakanan,ArrayList<String>infomakanan,Context context) {
        this.fotomakanan = fotomakanan;
        this.namamakanan = namamakanan;
        this.infomakanan=infomakanan;

        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter,parent,false);
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotomakanan.get(position)).into(holder.imgfotomakanan);
        holder.txtnamaMakanan.setText(namamakanan.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(context, namamakanan.get(position), Toast.LENGTH_LONG).show();

                Intent intent= new Intent(context, DetailActivity.class);

                intent.putExtra("foto_makanan",fotomakanan.get(position));
                intent.putExtra("nama_makanan",namamakanan.get(position));
                intent.putExtra("info_makanan",infomakanan.get(position));

                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return namamakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgfotomakanan;
        TextView txtnamaMakanan;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfotomakanan = itemView.findViewById(R.id.imgfotomakanan);
            txtnamaMakanan= itemView.findViewById(R.id.txtnamaMakanan);


            constraintLayout=itemView.findViewById(R.id.constrainLayout);

        }
    }
}

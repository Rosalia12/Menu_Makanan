package com.example.listmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageviewfotomakanan;
    TextView teksViewnamamakanan,teksViewinfomakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);


        imageviewfotomakanan=findViewById(R.id.imageViewfotomakanan);
        teksViewnamamakanan=findViewById(R.id.textViewnamamakanan);
        teksViewinfomakanan=findViewById(R.id.textViewinfomakanan);

        getIncomingExtra();
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_makanan") && getIntent().hasExtra("nama_makanan") && getIntent().hasExtra("info_makanan")) {
            String fotomakanan= getIntent().getStringExtra("foto_makanan");
            String namamakanan=getIntent().getStringExtra("nama_makanan");
            String infomakanan=getIntent().getStringExtra("info_makanan");

            setDataActivity(fotomakanan,namamakanan,infomakanan);
        }
    }

    private void setDataActivity(String fotomakanan, String namamakanan, String infomakanan){
        Glide.with(this).asBitmap().load(fotomakanan).into(imageviewfotomakanan);

        teksViewnamamakanan.setText(namamakanan);

        teksViewinfomakanan.setText(infomakanan);

    }
}
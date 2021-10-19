package com.example.listmakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> fotomakanan= new ArrayList<>();
    private ArrayList<String> namamakanan=new ArrayList<>();
    private ArrayList<String> infomakanan=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getDataFromInternet();

    }

    private void prosesrecyclerView(){

        RecyclerView recyclerView=findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(fotomakanan,namamakanan,infomakanan,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namamakanan.add("Gulai Ikan Patin  \n  Rp.40.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Gulai-Ikan-Patin-Riau.jpg");
        infomakanan.add("Gulai ikan patin merupakan makanan asli Riau yang sangat terkenal. Nama makanan tersebut adalah gulai ikan patin.\n" +
                "\n" +
                "Di Pekanbaru makanan ini tidak pernah sepi pengunjung. Gulai ikan patin memiliki cita rasa yang sangat lezat sehingga bisa membuat lidah kamu tak henti bergoyang.\n" +
                "\n" +
                "Kamu bisa menjumpai menu gulai ikan patin ini dengan mudah diberbagai restoran yang tersebar di Pekanbaru.\n" +
                "\n" +
                "Gulai ikan batin merupakan jenis kuliner yang memiliki kuah berwarna kuning pekat untuk merendam potongan ikan tersebut.\n" +
                "\n" +
                "Warga riau kebanyakan tidak hanya mengonsumsi ikan patin saja melainkan akan diolah menjadi beragam jenis masakan.");


        namamakanan.add("Nasi Lemek Khas Riau \n Rp.30.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Nasi-Lemek-Khas-Riau.jpg");
        infomakanan.add("Nasi Lemek banyak disajikan sebagai menu sarapan masyarakat melayu. Nasi Lemek merupakan kuliner dengan menggunakan bahan utama berupa nasi yang diolah bersama campuran santan kelapa serta daun pandan untuk memberikan rasa yang gurih serta aroma yang harum.\n" +
                "\n" +
                "Nasi Lemek ini kerap disajikan bersama dengan campuran lauk pauk seperti telur, sambal, ikan teri goreng, cabai serta irisan mentimun.\n" +
                "\n" +
                "Dengan adanya lauk pendamping maka banyak juga nasi lemek yang disajikan bersamaan dengan tempe, kacang panjang, tahu, sate, kacang tanah, cumi-cumi, daging, ikan, kerang, pertanian serta limpa.");

        namamakanan.add("Asam Pedas Ikan Baung Riau \n Rp.45.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Asam-Pedas-Ikan-Baung-Riau.jpg");
        infomakanan.add("Makanan berbahan dasar ikan yang tidak kalah terkenal dengan makanan khas Riau lainnya yaitu ikan baung.\n" +
                "\n" +
                "Mendengar namanya kita sudah bisa melihat perbedaan antara ikan asam pedas dengan ikan baung gulai ikan patin.\n" +
                "\n" +
                "Untuk mendapatkan olahan asam pedas ikan baung maka masyarakat Riau meramunya dengan menggunakan beragam macam rempah tradisional seperti bawang putih, jahe, bawang merah, lengkuas dan kunyit.\n" +
                "\n" +
                "Di sisi lain cita rasa asam didapatkan dari penggunaan asam kandis atau air asam Jawa yang digunakan sebagai rendaman bumbu serta ikan.");

        namamakanan.add("Sup Tunjang Riau \n Rp.30.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Sup-Tunjang-Riau.jpg");
        infomakanan.add("Dinginnya kota Pekanbaru akan terasa panas dengan kehadiran sup tunjang. Sup tunjang ini adalah jenis makanan dari Riau yang memiliki kuah hangat.\n" +
                "\n" +
                "Saat cuaca sedang dingin-dinginnya maka sangat nikmat rasanya menyantap satu porsi nasi hangat dengan sup tunjang.\n" +
                "\n" +
                "Sup tunjang memiliki ciri khas yaitu menggunakan bahan dasar berupa tulang kaki sapi yang masih ada dagingnya.\n" +
                "\n" +
                "Tulang kaki sapi ini kemudian direndam dalam kuah bening berwarna kuning dan tambahan beberapa bahan pelengkap seperti irisan kentang, tomat, wortel dan daun bawang.");

        namamakanan.add("Mie Sagu Riau \n Rp.20.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Mie-Sagu-Riau.jpg");
        infomakanan.add("Mendengar nama sagu tentu yang terlintas adalah nama Papua yang identik menggunakan sagu sebagai bahan dasarnya.\n" +
                "\n" +
                "Karena memang di Papua sagu ini menjadi bahan pokok makanan sehari-hari. Nah ternyata makanan dengan bahan baku sagu bukan hanya ada di papua saja, melainkan juga ada di Riau.\n" +
                "\n" +
                "\n" +
                "Kamu bisa menjumpai Mie Sagu ini di daerah Selat Panjang yang merupakan sebuah daerah penghasil sagu terbesar di Indonesia.\n" +
                "\n" +
                "Mie sagu adalah makanan yang siap disantap oleh siapa saja, terlebih bagi mereka yang sedang menjalankan program diet atau yang sedang menderita diabetes.");

        namamakanan.add("Cincalok \n Rp.20.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Cincalok-Riau.jpg");
        infomakanan.add("alam membuat cincalok ini bahan dasar yang digunakan adalah udang dari genus ini bahan dasar yang digunakan adalah udang dari genus Acutes.\n" +
                "\n" +
                "Untuk membuatnya langkah pertama udang dicuci bersih menggunakan air laut, setelah itu udang yang sudah dicuci campur dengan garam.\n" +
                "\n" +
                "Udang yang dicampur dengan garam, didiamkan pada wadah tembikar yang di tutup menggunakan kain atau apa aja yang bisa menutupi tembikar lalu tutup sampai 20 -30 hari. Setelah diawetkan, cincalok akan dicampurkan ke dalam sambal atau ikan asin supaya rasanya semakin nikmat.");

        namamakanan.add("Bacah Daging  \n Rp.35.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Bacah-Daging-Khas-Riau.jpg");
        infomakanan.add("Jangan salah ternyata Riau juga memiliki makanan khas dengan menggunakan daging sebagai bahan utamanya yaitu Bacah Daging.\n" +
                "\n" +
                "Secara sekilas makanan ini memiliki tampilan seperti rendang khas Padang serta Dendeng batokok khas Jambi namun rasanya sedikit beda serta memiliki beberapa campuran bumbu dalam penyajiannya.\n" +
                "\n" +
                "Jika dendeng dihidangkan dengan nasi, maka bacah daging ini dihidangkan bersama dengan ketupat.\n" +
                "\n" +
                "Yang membuat unik makanan dari riau ini hanya dihidangkan saat waktu tertentu seperti saat hari raya idul fitri misalnya.");

        namamakanan.add("Mie Lendir Khas Riau  \n Rp.10.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Mie-Lendir-Khas-Riau.jpg");
        infomakanan.add("Makanan dari Riau ini dijual dengan harga yang cukup terjangkau. Dengan mengeluarkan uang sebesar 10.000 hingga 15.000 kamu sudah bisa mencicipi nikmatnya mie Lendir. Secara tampilan, mie lendir ini mirip dengan mie kebanyakan.\n" +
                "\n" +
                "Yang membedakan mie lendir dengan mie pada umumnya yaitu rasanya yang tidak bisa diremehkan. Kuah kental pada mie lendir akan menjadikan makanan menjadi semakin nikmat.");

        namamakanan.add("Mie Terampa  \n Rp.15.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Mie-Tarempa-Riau.jpg");
        infomakanan.add("Setelah mie lendir makanan khas daerah Riau selanjutnya yaitu Mie Terempa. Cara pengolahan mie terampa ini sama dengan pengolahan mie kebanyakan. Yang membedakan terletak pada bumbu serta cara membuatnya.\n" +
                "\n" +
                "Mie terampah atau biasa orang Riau menyebutnya dengan sebutan mie siantan ini berbahan dasar sama seperti mie kuning dengan kombinasi telur, udang, cabai rawit, tauge dan kecap.\n" +
                "\n" +
                "Mie terempah memiliki dua macam mie yaitu mie basah dan juga mie goreng. Umumnya mie terempah yang digoreng lebih banyak mencampurkan kecap daripada mie terempah kuah");

        namamakanan.add("Lopek Bugi Riau \n Rp.10.000");
        fotomakanan.add("https://makananoleholeh.com/wp-content/uploads/2018/09/Lopek-Bugi-Riau.jpg");
        infomakanan.add("Lopek bugi merupakan makanan dari Kabupaten Kampar yang sudah terkenal hingga berbagai daerah di nusantara. Sebagian besar masyarakat kerap menyebutnya lepat ketan.\n" +
                "\n" +
                "Makanan ini awalnya hanya diperuntukan untuk kaum bangsawan. Akan tetapi sampai saat ini, cemilan satu ini bukan hanya dihidangkan oleh orang bangsawan saja melainkan semua masyarakat sudah bisa menikmatinya.\n" +
                "\n" +
                "Lopek bugi bisa ditemukan dengan mudah di beberapa toko oleh-oleh khas Riau serta beberapa gerai-gerai yang ada disepanjang jalan di Pekanbaru.");

        prosesrecyclerView();
    }
}
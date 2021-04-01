package com.example.nurainunapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sekolah extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSekolah=new String[] { "Sekolah Dasar Negeri 79 Pekanbaru",
                "Sekolah Dasar Negeri 80 Pekanbaru", "SMA Negeri 4 Pekanbaru", "SMA Darma Yudha"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSekolah));
    }

    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o=this.getListAdapter().getItem(position);
        String pilihan=o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a=null;
            if(pilihan.equals("Sekolah Dasar Negeri 79 Pekanbaru")) {
                a=new Intent(this, SDN79PKU.class);


            }  else if(pilihan.equals("Sekolah Dasar Negeri 80 Pekanbaru")) {
                a=new Intent(this, SDN80PKU.class);

            }else if (pilihan.equals("SMA Negeri 4 Pekanbaru")){
                a=new Intent(this, SmaN4PKU.class);

            }else if (pilihan.equals("SMA Darma Yudha")){
                a=new Intent(this, SmaDharmaYudha.class);

            }

            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}




package com.example.nurainunapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polisi extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listPolisi=new String[] { "Polda Pekanbaru",
                "Polresta Pekanbaru", "Polsek Pekanbaru Kota", "Polsek Tampan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listPolisi));
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
            if(pilihan.equals("Polda Pekanbaru")) {
                a=new Intent(this, PoldaPekanbaru.class);


            }  else if(pilihan.equals("Polresta Pekanbaru")) {
                a=new Intent(this, PolrestaPekanbaru.class);

            }else if (pilihan.equals("Polsek Pekanbaru Kota")){
                a=new Intent(this, PolsekPekanbaruKota.class);

            }else if (pilihan.equals("Polsek Tampan")){
                a=new Intent(this, PolsekTampan.class);

            }

            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}


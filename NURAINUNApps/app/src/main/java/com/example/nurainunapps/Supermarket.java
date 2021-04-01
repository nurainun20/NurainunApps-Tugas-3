package com.example.nurainunapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Supermarket extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listSupermarket=new String[] { "KAS Swalayan",
                "Hypermart Mal SKA", "Ion Swalayan", "Planet Swalayan Marpoyan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listSupermarket));
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
            if(pilihan.equals("KAS Swalayan")) {
                a=new Intent(this, KasSwalayan.class);


            }  else if(pilihan.equals("Hypermart Mal SKA")) {
                a=new Intent(this, HypermartMallSka.class);

            }else if (pilihan.equals("Ion Swalayan")){
                a=new Intent(this, IonSwalayan.class);

            }else if (pilihan.equals("Planet Swalayan Marpoyan")){
                a=new Intent(this, PlanetSwalayanMarpoyan.class);

            }

            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}



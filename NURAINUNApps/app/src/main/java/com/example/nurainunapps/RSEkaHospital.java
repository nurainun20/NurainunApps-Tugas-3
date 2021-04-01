package com.example.nurainunapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSEkaHospital extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct=new String[] {"Call Center","SMS Center", "Driving Direction",
                 "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,listAct));
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
            if(pilihan.equals("Call Center")) {
                String nomortel="tel:0761-73646347";
                a=new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }  else if(pilihan.equals("SMS Center")) {
                String smsText="Nurainun/P";
                a=new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082276464695"));
                a.putExtra("sms_body",smsText);

            } else if(pilihan.equals("Driving Direction")) {
                String lokasirs="https://www.google.com/maps/dir/2.3586454,100.1023853/rs++eka+hospital+pekanbaru/@1.4207573,99.582502,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31d5a958ff468d7d:0x958ef365745c3ff7!2m2!1d101.41969!2d0.4823185";
                a=new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));
                

            } else if(pilihan.equals("Info di Google")) {
                a=new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "RS Eka Hospital");
            }
            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}





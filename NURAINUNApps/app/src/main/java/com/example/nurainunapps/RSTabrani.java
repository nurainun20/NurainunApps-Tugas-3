package com.example.nurainunapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSTabrani  extends ListActivity {
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listAct=new String[] {"Call Center","SMS Center", "Driving Direction",
                "Website", "Info di Google", "Exit"};
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
                String nomortel="tel:0761-79824356";
                a=new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            }  else if(pilihan.equals("SMS Center")) {
                String smsText="Nurainun/P";
                a=new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082284566123"));
                a.putExtra("sms_body",smsText);

            } else if(pilihan.equals("Driving Direction")) {
                String lokasirs="https://www.google.com/maps/dir/2.3586454,100.1023853/rs+tabrani/@1.429494,99.58292,8z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31d5aea48935ea9b:0x7ba569918bbb6a30!2m2!1d101.4500512!2d0.5082811";
                a=new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if(pilihan.equals("Website")) {
                String website="http://www.rstabrani.co.id/";
                a=new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if(pilihan.equals("Info di Google")) {
                a=new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "RS Tabrani");
            }
            startActivity(a);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

}






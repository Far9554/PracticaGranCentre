package com.example.prcticagrancentre;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] negoci;
    private final String[] adress;
    private final Integer[] imageId;
    private final String[] url;
    private final String[] tel;
    public CustomList(Activity context, String[] negoci, Integer[] imageId, String[] adress,String[] url,String[] tel ) {
        super(context, R.layout.list_single, negoci);
        this.context = context;
        this.negoci = negoci;
        this.imageId = imageId;
        this.adress=adress;
        this.url=url;
        this.tel=tel;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        TextView txtAdress=(TextView) rowView.findViewById(R.id.txtAdress);
        Button btnweb=(Button) rowView.findViewById(R.id.btnweb);
        Button btntel=(Button) rowView.findViewById(R.id.btntel);
        Button btnubi=(Button) rowView.findViewById(R.id.btnubi);

        txtTitle.setText(negoci[position]);
        imageView.setImageResource(imageId[position]);
        txtAdress.setText(adress[position]);

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWeb=new Intent(Intent.ACTION_VIEW, Uri.parse(url[position]));
                context.startActivity(intentWeb);
            }
        });
        btntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel=new Intent(Intent.ACTION_VIEW, Uri.parse(tel[position]));
                context.startActivity(intentTel);
            }
        });

        return rowView;
    }
}
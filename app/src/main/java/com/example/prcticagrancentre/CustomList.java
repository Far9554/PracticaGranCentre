package com.example.prcticagrancentre;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] negoci;
    private final String[] adress;
    private final Integer[] imageId;
    public CustomList(Activity context, String[] negoci, Integer[] imageId, String[] adress ) {
        super(context, R.layout.list_single, negoci);
        this.context = context;
        this.negoci = negoci;
        this.imageId = imageId;
        this.adress=adress;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        TextView txtAdress=(TextView) rowView.findViewById(R.id.txtAdress);

        txtTitle.setText(negoci[position]);
        imageView.setImageResource(imageId[position]);
        txtAdress.setText(adress[position]);
        return rowView;
    }
}
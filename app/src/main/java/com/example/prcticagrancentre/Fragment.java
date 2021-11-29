package com.example.prcticagrancentre;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment extends ArrayAdapter<String> {
    private static LayoutInflater inflater=null;
    Context context;
    String[] nom;
    String[] desc;
    int[] image;

    public Fragment(Activity context, String[] nom, int[] image, String[] desc) {
        super(context, R.layout.list_fragment, nom);
        this.context=context;
        this.nom=nom;
        this.desc=desc;
        this.image=image;
        inflater =(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista=inflater.inflate(R.layout.list_fragment,null,true);
        TextView titulo=(TextView) vista.findViewById(R.id.textTi);
        TextView Descrip = (TextView) vista.findViewById(R.id.textDesc);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imgm);
        titulo.setText(nom[i]);
        imagen.setImageResource(image[i]);
        Descrip.setText(desc[i]);
        return vista;
    }
}
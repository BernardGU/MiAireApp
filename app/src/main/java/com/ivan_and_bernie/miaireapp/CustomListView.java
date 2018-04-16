package com.ivan_and_bernie.miaireapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String>{

    private String[] fecha;
    private String[] sensor;
    private String[] medicion;
    private Activity context;

    public CustomListView(Activity context, String[] fecha, String[] sensor, String[] medicion) {
        super(context, R.layout.listview_layout,fecha);

        this.context=context;
        this.fecha=fecha;
        this.sensor=sensor;
        this.medicion=medicion;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if(r==null){
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) r.getTag();

        }
        viewHolder.tx1.setText(fecha[position]);
        viewHolder.tx2.setText(sensor[position]);
        viewHolder.tx3.setText(medicion[position]);

        return r;
    }
    class ViewHolder{
        TextView tx1;
        TextView tx2;
        TextView tx3;
        ViewHolder(View v){
            tx1 = v.findViewById(R.id.tvf);
            tx2 = v.findViewById(R.id.tvs);
            tx3 = v.findViewById(R.id.tvm);
        }
    }
}

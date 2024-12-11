package com.example.api_orai;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;

import java.util.List;

public class BevasarloAdapter extends ArrayAdapter<ListViewItem> {
    public BevasarloAdapter(Context context, int resource, List<ListViewItem> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listviewitem, parent, false);
        }

        CardView cardView = convertView.findViewById(R.id.cardView);
        ListViewItem item = getItem(position);
        TextView nevDisplay = convertView.findViewById(R.id.nevDisplay);
        TextView kategoriaDisplay = convertView.findViewById(R.id.kategoriaDisplay);
        TextView arDisplay = convertView.findViewById(R.id.arDisplay);
        TextView mennyisegDisplay = convertView.findViewById(R.id.mennyisegDisplay);
        Button torles = convertView.findViewById(R.id.torles);


        if (item != null) {
            nevDisplay.setText(item.getNev());
            kategoriaDisplay.setText(item.getKategoria());
            arDisplay.setText(String.valueOf(item.getAr()));
            mennyisegDisplay.setText(String.valueOf(item.getMennyiseg()));



            torles.setOnClickListener(view -> {
                AlertDialog.Builder alert = new AlertDialog.Builder(getContext());
                alert.setMessage("Biztos törölni szeretnéd?");
                alert.setPositiveButton("Igen", (dialog, which) -> {
                    remove(item);
                    notifyDataSetChanged();
                });
                alert.setNegativeButton("Nem", (dialog, which) -> {

                });
                alert.show();
            });
        }

        return convertView;
    }
}

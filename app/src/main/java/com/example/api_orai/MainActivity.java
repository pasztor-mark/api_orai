package com.example.api_orai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText nevEditText;
    private EditText mennyisegEditText;
    private EditText arEditText;
    private EditText kategoriaEditText;
    private Button submitButton;
    private ListView listView;
    private ArrayList<ListViewItem> ujTargy;

    private BevasarloAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });

        adapter = new BevasarloAdapter(this, R.layout.listviewitem, ujTargy);
         nevEditText = findViewById(R.id.nev);
         mennyisegEditText  = findViewById(R.id.mennyiseg);
        arEditText = findViewById(R.id.ar);
        kategoriaEditText  = findViewById(R.id.kategoria);
        submitButton = findViewById(R.id.submit);
    }
}
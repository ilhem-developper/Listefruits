package com.example.myapplicationtp3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    ListView liste;
    TextView res;
    ImageView image;
    Spinner sp;
    String options[] = {"pomme", "kiwi", "banane" , "poire" , "figue", "raisin", "abrico" , "datte"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liste = (ListView) this.findViewById(R.id.liste);
        res = (TextView) this.findViewById(R.id.res);
        image=(ImageView)this.findViewById(R.id.img);
        image.setImageResource(R.drawable.pomme);
       image.setImageResource(R.drawable.kiwi);
        image.setImageResource(R.drawable.banane);
        image.setImageResource(R.drawable.banane);
        image.setImageResource(R.drawable.poire);
        image.setImageResource(R.drawable.figue);
        image.setImageResource(R.drawable.raisin);
        image.setImageResource(R.drawable.abrico);
        image.setImageResource(R.drawable.datte);
        //1er methode avec la listview
       String[] listItem = getResources().getStringArray(R.array.array_fruit);
        final ArrayAdapter <String> adapter = new ArrayAdapter<String>(
                this,R.layout.mylist, R.id.texte, listItem);
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valeur = adapter.getItem(i);
                res.setText("vous avez choisis " + valeur);
                //To Do la deuxiéme partie de l'image
                if (valeur.equalsIgnoreCase("pomme")) {
                    image.setImageResource(R.drawable.pomme);
               }
                if (valeur.equalsIgnoreCase("kiwi")) {
                    image.setImageResource(R.drawable.kiwi);
                }
                if (valeur.equalsIgnoreCase("banane")) {
                    image.setImageResource(R.drawable.banane);
                }
                if (valeur.equalsIgnoreCase("poire")) {
                    image.setImageResource(R.drawable.poire);
                }
                if (valeur.equalsIgnoreCase("figue")) {
                    image.setImageResource(R.drawable.figue);
                }
                if (valeur.equalsIgnoreCase("raisain")) {
                    image.setImageResource(R.drawable.abrico);
                }
                if (valeur.equalsIgnoreCase("datte")) {
                    image.setImageResource(R.drawable.datte);
                }


            }
        });
        //2éme methodes avec le spinner
        /*sp=(Spinner)this.findViewById(R.id.sp);
        final ArrayAdapter<String> adapterSpinner =new ArrayAdapter<>(this,R.layout.mylist,R.id.texte,options);
        adapterSpinner.setDropDownViewResource(R.layout.mylist);
        sp.setAdapter((adapterSpinner));
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView , View view, int i, long l) {
                res.setText("Biens choisis"+adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/

    }
}





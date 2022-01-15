package com.example.libraryproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


class MainActivity extends AppCompatActivity{

    ImageButton imageview1;
    ImageButton imageview2;
    ImageButton imageview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  UrlPDFOpen();
        imageview1 = findViewById(R.id.image1);
        imageview1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(),com.example.libraryproject.Book1.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Clicked on" + imageview1, Toast.LENGTH_LONG
                ).show();
            }
        });
        imageview2 = findViewById(R.id.image2);
        imageview2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent i = new Intent(getApplicationContext(),com.example.libraryproject.Book2.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Clicked on" + imageview2, Toast.LENGTH_LONG
                ).show();
            }
        });
        imageview3 = findViewById(R.id.image3);
        imageview3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {

                Intent i = new Intent(getApplicationContext(),com.example.libraryproject.Book3.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Clicked on" + imageview3, Toast.LENGTH_LONG
                ).show();
            }
        });
    }
    public  boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.contacts_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void Menu(MenuItem Menu)
    {
        Toast.makeText(getApplicationContext(), "Clicked on" + Menu.getTitle(), Toast.LENGTH_LONG).show();
    }

    //Broadcast receiver which alerts when there is a change in  the configuration of the application
    public void onConfigurationChanged(@NonNull Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        Snackbar snack= Snackbar.make(findViewById(android.R.id.content), "Configuration has been changed", 1200 + newConfig.orientation);
        snack.show();
        Toast.makeText(this, "Changed orientation to" + newConfig.orientation, Toast.LENGTH_SHORT).show();
    }
}
 /*   public void UrlPDFOpen()
    {
        Uri pdfUri = Uri.parse("https://drive.google.com/file/d/1n1rCIDk0Cyhhto2uIiqjc2RdyO1Ne211/view");
        Intent shareIntent = ShareCompat.IntentBuilder.from(this)
                .setText("Share PDF doc")
                .setType("application/pdf")
                .setStream(pdfUri )
                .getIntent()
                .setPackage("com.google.android.apps.docs");
        startActivity(shareIntent);
    }
*/


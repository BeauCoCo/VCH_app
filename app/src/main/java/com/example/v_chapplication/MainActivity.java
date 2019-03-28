package com.example.v_chapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linkBtn = (Button)findViewById(R.id.linkBtn);
        linkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String link = "https://vchphotoeditor.blogspot.com/?fbclid=IwAR0_RQk-Vr-kX06fVl-ZPXjTcS7-FKpA0tPtcQHgaVVs0_5ZQU7vi412FpU";
                Uri webaddress = Uri.parse(link);

                Intent gotoLink = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotoLink.resolveActivity(getPackageManager())!= null){
                    startActivity(gotoLink);
                }
            }
        });

        ImageButton imageBtn  = (ImageButton)findViewById(R.id.imageBtn);
        imageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntend = new Intent(getApplicationContext(), MainActivity1.class);
                startActivity(startIntend);
            }
        });

    }
}

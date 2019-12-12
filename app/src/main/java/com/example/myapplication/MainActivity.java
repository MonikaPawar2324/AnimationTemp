package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn;
CheckBox chk1;
TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chk1=findViewById(R.id.chk1);
        btn=findViewById(R.id.btn_VID);
        txtview=findViewById(R.id.txtview);
        txtview.setSelected(true);
        txtview.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        txtview.setText("General Information... general information... General Information.................................................");
        txtview.setSelected(true);
        txtview.setSingleLine(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String finalUrl="https://resident.uidai.gov.in/web/resident/vidgeneration";
                Intent browserIntent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse(finalUrl));
                startActivity(browserIntent);
            }
        });
        chk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

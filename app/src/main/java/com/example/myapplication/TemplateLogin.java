package com.example.myapplication;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TemplateLogin extends AppCompatActivity {
    TextView sin;
    LinearLayout circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template_login);
        sin=findViewById(R.id.sin);
        Typeface tf = Typeface.createFromAsset(getAssets(), "Lato-Regular.ttf");
        sin.setTypeface(tf);
        circle = (LinearLayout)findViewById(R.id.circle);

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(TemplateLogin.this,signup.class);
                startActivity(it);

            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TemplateLogin.this,signin.class);
                startActivity(it);
            }
        });
    }
}

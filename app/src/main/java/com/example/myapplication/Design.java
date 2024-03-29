package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Design extends AppCompatActivity {
    TextView tv;
    String eventName = "bhbjkkkkkkkkkkkkkkkkkkkkkkkkkkkkg.jjggggggggggggggggguuuuu";
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        tv = (TextView) this.findViewById(R.id.txtTicker);
        tv.setSelected(true);
        tv.setText("\t \t \t \t \t \t" + eventName + "\t \t \t \t \t \t\t\t\t\t\t");

        Button btnFadeIn, btnFadeOut, btnCrossFade, btnBlink, btnZoomIn,
                btnZoomOut, btnRotate, btnMove, btnSlideUp, btnSlideDown,
                btnBounce, btnSequential, btnTogether;
        final Animation animFadeIn, animFadeOut, animBlink, animZoomIn, animZoomOut, animRotate, animMove, animSlideUp, animSlideDown, animBounce, animSequential, animTogether, animCrossFadeIn, animCrossFadeOut;
        final TextView txtFadeIn, txtFadeOut, txtBlink, txtZoomIn, txtZoomOut, txtRotate, txtMove, txtSlideUp,
                txtSlideDown, txtBounce, txtSeq, txtTog, txtIn, txtOut;


        btnFadeIn = (Button) findViewById(R.id.btnFadeIn);
        btnFadeOut = (Button) findViewById(R.id.btnFadeOut);
        btnCrossFade = (Button) findViewById(R.id.btnCrossFade);
        btnBlink = (Button) findViewById(R.id.btnBlink);
        btnZoomIn = (Button) findViewById(R.id.btnZoomIn);
        btnZoomOut = (Button) findViewById(R.id.btnZoomOut);
        btnRotate = (Button) findViewById(R.id.btnRotate);
        btnMove = (Button) findViewById(R.id.btnMove);
        btnSlideUp = (Button) findViewById(R.id.btnSlideUp);
        btnSlideDown = (Button) findViewById(R.id.btnSlideDown);
        btnBounce = (Button) findViewById(R.id.btnBounce);
        btnSequential = (Button) findViewById(R.id.btnSequential);
        btnTogether = (Button) findViewById(R.id.btnTogether);
        txtFadeIn = (TextView) findViewById(R.id.txt_fade_in);
        txtFadeOut = (TextView) findViewById(R.id.txt_fade_out);
        txtBlink = (TextView) findViewById(R.id.txt_blink);
        txtZoomIn = (TextView) findViewById(R.id.txt_zoom_in);
        txtZoomOut = (TextView) findViewById(R.id.txt_zoom_out);
        txtRotate = (TextView) findViewById(R.id.txt_rotate);
        txtMove = (TextView) findViewById(R.id.txt_move);
        txtSlideUp = (TextView) findViewById(R.id.txt_slide_up);
        txtSlideDown = (TextView) findViewById(R.id.txt_slide_down);
        txtBounce = (TextView) findViewById(R.id.txt_bounce);
        txtSeq = (TextView) findViewById(R.id.txt_seq);
        txtTog = (TextView) findViewById(R.id.txt_tog);
        txtIn = (TextView) findViewById(R.id.txt_in);
        txtOut = (TextView) findViewById(R.id.txt_out);
        imageView = (ImageView) findViewById(R.id.imageView2);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
            /*animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                    R.anim.fade_in);*/
        // fade in
        btnFadeIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtFadeIn.setVisibility(View.VISIBLE);
                txtFadeIn.startAnimation(animFadeIn);
            }
        });
        imageView.startAnimation(animBounce);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        // fade out
        btnFadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFadeOut.setVisibility(View.VISIBLE);
                txtFadeOut.startAnimation(animFadeOut);
            }
        });
        animCrossFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animCrossFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);
        // cross fade
        btnCrossFade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOut.setVisibility(View.VISIBLE);
                // start fade in animation
                txtOut.startAnimation(animCrossFadeIn);

                // start fade out animation
                txtIn.startAnimation(animCrossFadeOut);
            }
        });
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        // blink
        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBlink.setVisibility(View.VISIBLE);
                txtBlink.startAnimation(animBlink);
            }
        });

        animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_in);
        // Zoom In
        btnZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomIn.setVisibility(View.VISIBLE);
                txtZoomIn.startAnimation(animZoomIn);
            }
        });
        animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_out);
        // Zoom Out
        btnZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtZoomOut.setVisibility(View.VISIBLE);
                txtZoomOut.startAnimation(animZoomOut);
            }
        });
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);

        // Rotate
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtRotate.startAnimation(animRotate);
            }
        });
        animMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        // Move
        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMove.startAnimation(animMove);
            }
        });
        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        // Slide Up
        btnSlideUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideUp.startAnimation(animSlideUp);
            }
        });
        animSlideDown = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        // Slide Down
        btnSlideDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtSlideDown.startAnimation(animSlideDown);
            }
        });

        // Slide Down
        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBounce.startAnimation(animBounce);
            }
        });
        animSequential = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.sequential);
        // Sequential
        btnSequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtSeq.startAnimation(animSequential);
            }
        });
        animTogether = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.together);

        // Together
        btnTogether.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtTog.startAnimation(animTogether);
            }
        });


    }

}


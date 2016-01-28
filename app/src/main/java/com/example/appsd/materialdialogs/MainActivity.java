package com.example.appsd.materialdialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.vignesh_iopex.confirmdialog.Confirm;
import com.github.vignesh_iopex.confirmdialog.Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Confirm.using(MainActivity.this).ask("Fire missles?").onPositive("Yes", new Dialog.OnClickListener() {
                    @Override
                    public void onClick(Dialog dialog, int which) {
                        /*launchMissles();*/finish();
                    }
                }).onNegative("No", new Dialog.OnClickListener() {
                    @Override
                    public void onClick(Dialog dialog, int which) {
                       // sendFalseAlarm();
                    }
                }).build().show();
            }


        });
    }
}

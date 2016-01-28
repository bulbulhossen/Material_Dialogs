package com.example.appsd.materialdialogs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.vignesh_iopex.confirmdialog.Confirm;
import com.github.vignesh_iopex.confirmdialog.Dialog;


public class MainActivity extends AppCompatActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        //super.onBackPressed();
        openQuitDialog();
    }

    private void openQuitDialog() {
        // super.onCreate(savedInstanceState);
        Confirm.using(this).ask("Are you exit application ?").onPositive("Yes", new Dialog.OnClickListener() {
            @Override
            public void onClick(Dialog dialog, int which) {
                finish();
            }
        }).onNegative("No", new Dialog.OnClickListener() {
            @Override
            public void onClick(Dialog dialog, int which) {
                //sendFalseAlarm();
            }
        }).build().show();
    }
}

package com.example.appsd.materialdialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.drakeet.materialdialog.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt  = (Button) findViewById(R.id.button);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MaterialDialog mMaterialDialog = new MaterialDialog(MainActivity.this)
                        .setTitle("MaterialDialog")
                        .setMessage("Hello world!")
                        .setPositiveButton("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                             finish();

                            }
                        })
                        .setNegativeButton("CANCEL", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                               // mMaterialDialog.dismiss();

                            }
                        });

                mMaterialDialog.show();

// You can change the message anytime. before show
                mMaterialDialog.setTitle("I love");
                mMaterialDialog.show();
// You can change the message anytime. after show
                mMaterialDialog.setMessage("Bulbul");
            }
        });




    }
}

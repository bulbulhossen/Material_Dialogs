package com.example.appsd.materialdialogs;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import net.soulwolf.widget.dialogbuilder.DialogBuilder;
import net.soulwolf.widget.dialogbuilder.Gravity;
import net.soulwolf.widget.dialogbuilder.MasterDialog;
import net.soulwolf.widget.dialogbuilder.OnItemClickListener;
import net.soulwolf.widget.dialogbuilder.adapter.GridDialogAdapter;
import net.soulwolf.widget.dialogbuilder.adapter.TextDialogAdapter;
import net.soulwolf.widget.dialogbuilder.dialog.AlertMasterDialog;
import net.soulwolf.widget.dialogbuilder.dialog.GridMasterDialog;
import net.soulwolf.widget.dialogbuilder.dialog.ListMasterDialog;
import net.soulwolf.widget.dialogbuilder.model.GridModel;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnItemClickListener {


    Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
        findViewById(R.id.left).setOnClickListener(this);
        findViewById(R.id.top).setOnClickListener(this);
        findViewById(R.id.right).setOnClickListener(this);
        findViewById(R.id.bottom).setOnClickListener(this);
        findViewById(R.id.center).setOnClickListener(this);
        findViewById(R.id.center1).setOnClickListener(this);
        findViewById(R.id.grid).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.left) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_slide_in_left, R.anim.da_slide_out_left)
                            //.setIgnoreStatusBar(false)
                    .setLayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT)
                    .setGravity(Gravity.LEFT)
                    .setOnItemClickListener(this)
                    .setBackgroundResource(R.color.toolbar_background);
            ListMasterDialog dialog = new ListMasterDialog(builder);
            dialog.setAdapter(new TextDialogAdapter(this, getSimpleStringData(8)));
            dialog.show();


        }














        else if (v.getId() == R.id.top) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_slide_in_top, R.anim.da_slide_out_top)
                            //.setIgnoreStatusBar(false)
                    .setGravity(Gravity.TOP)
                    .setOnItemClickListener(this)
                    .setBackgroundResource(R.color.toolbar_background);
            ListMasterDialog dialog = new ListMasterDialog(builder);
            dialog.setCancelButton(false);
            dialog.setAdapter(new TextDialogAdapter(this, getSimpleStringData(3)));
            dialog.show();
        } else if (v.getId() == R.id.right) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_slide_in_right, R.anim.da_slide_out_right)
                            //.setIgnoreStatusBar(false)
                    .setLayoutParams(400, ViewGroup.LayoutParams.MATCH_PARENT)
                    .setGravity(Gravity.RIGHT)
                    .setOnItemClickListener(this)
                    .setBackgroundResource(R.color.toolbar_background);
            ListMasterDialog dialog = new ListMasterDialog(builder);
            dialog.setAdapter(new TextDialogAdapter(this, getSimpleStringData(8)));
            dialog.show();
        } else if (v.getId() == R.id.bottom) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_slide_in_bottom, R.anim.da_slide_out_bottom)
                    .setOnItemClickListener(this)
                            //.setIgnoreStatusBar(false)
                    .setGravity(Gravity.BOTTOM);
            ListMasterDialog dialog = new ListMasterDialog(builder);
            dialog.setAdapter(new TextDialogAdapter(this, getSimpleStringData(4)));
            dialog.show();
        } else if (v.getId() == R.id.center) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setOnItemClickListener(this)
                    .setAnimation(R.anim.da_fade_in_center, R.anim.da_fade_out_center)
                            //.setIgnoreStatusBar(false)
                    .setGravity(Gravity.CENTER);
            AlertMasterDialog dialog = new AlertMasterDialog(builder);
            dialog.setTitle("Bangladesh");
            dialog.setContent("O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ");
            dialog.show();
        } else if (v.getId() == R.id.center1) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_fade_in_center, R.anim.da_fade_out_center)
                    .setOnItemClickListener(this)
                            //.setIgnoreStatusBar(false)
                    .setGravity(Gravity.CENTER);
            AlertMasterDialog dialog = new AlertMasterDialog(builder);
            dialog.setTitle("Bangladesh");
            dialog.setButton2("Dhaka");
            dialog.setContent("O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ，\n" +
                    "O amar bondhu go bangla song salman sha ");
            dialog.show();
        } else if (v.getId() == R.id.grid) {
            DialogBuilder builder = new DialogBuilder(this)
                    .setAnimation(R.anim.da_slide_in_bottom, R.anim.da_slide_out_bottom)
                    .setOnItemClickListener(this)
                            //.setIgnoreStatusBar(false)
                    .setGravity(Gravity.BOTTOM);
            GridMasterDialog dialog = new GridMasterDialog(builder);
            dialog.setAdapter(new GridDialogAdapter(this, getSimpleGridModelData()));
            dialog.setNumColumns(4);
            dialog.show();
        }
    }


    private GridModel[] getSimpleGridModelData() {
        return new GridModel[]{
                new GridModel(R.mipmap.share_layout_friends_icon, "Facebook"),
                new GridModel(R.mipmap.share_layout_friends_icon, "Gmail"),
                new GridModel(R.mipmap.share_layout_friends_icon, "Gmail"),
                new GridModel(R.mipmap.share_layout_friends_icon, "Gmail"),
                new GridModel(R.mipmap.share_layout_friends_icon, "Gmail"),
                new GridModel(R.mipmap.share_layout_friends_icon, "Gmail")
        };
    }


    private String[] getSimpleStringData(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = "SIMPLE-DATA" + i;
        }
        return array;
    }


    @Override
    public void onItemClick(MasterDialog dialog, View view, int position) {
        Toast.makeText(this, "Item click:" + position, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}


// First Example

/*
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.vignesh_iopex.confirmdialog.Confirm;
import com.github.vignesh_iopex.confirmdialog.Dialog;


public class MainActivity extends AppCompatActivity {
    */
/**
 * Called when the activity is first created.
 *//*

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
*/

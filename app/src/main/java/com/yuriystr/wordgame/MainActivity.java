package com.yuriystr.wordgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickQuit(View v){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                System.exit(0);
            }
        }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) { }
        }).setMessage(R.string.quit_question);
        alertDialogBuilder.create().show();
    }

    public void onClickOptions(View v){
        startActivity(new Intent(this, OptionsActivity.class));
    }

    public void onClickLoadGame(View v) {
        startActivity(new Intent(this, LoadGameActivity.class));
    }

    public void onClickNewGame(View v) {
        startActivity(new Intent(this, NewGameActivity.class));
    }
}

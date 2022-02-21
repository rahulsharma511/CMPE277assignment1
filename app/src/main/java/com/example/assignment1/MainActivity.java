package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView maincounter;
    private int countermain=0;
    public void movetosecond(View view){
        Intent intent = new Intent(MainActivity.this,SecondAcitvity.class);
        startActivity(intent);
    }
    public void movetothird(View view){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Dialog");
        alertDialog.setMessage("Main activity has went to Pause state");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
    public void killmain(){
        finish();
    }
    @Override
    protected void onRestart() {
        countermain++;
        maincounter.setText("Restart Counter= "+countermain);
        super.onRestart();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maincounter=findViewById(R.id.maincounter);
    }
}
package com.example.assignment1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondAcitvity extends AppCompatActivity {
    int countersecond=0;
    TextView secondcounter;
    public void movetomain(View view){
        Intent intent = new Intent(SecondAcitvity.this,MainActivity.class);
        startActivity(intent);
    }
    public void movetothird(View view){
        AlertDialog alertDialog = new AlertDialog.Builder(SecondAcitvity.this).create();
        alertDialog.setTitle("Dialog");
        alertDialog.setMessage("Second activity has went to Pause state");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
    public void killsecond(){
        finish();
    }
    @Override
    protected void onRestart() {
        countersecond++;
        secondcounter.setText("Restart Counter= "+countersecond);
        super.onRestart();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitvity);
        secondcounter=findViewById(R.id.secondcounter);
    }
}
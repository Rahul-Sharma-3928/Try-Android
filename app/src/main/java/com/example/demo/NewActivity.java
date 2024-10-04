package com.example.demo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        AlertDialog alertDialog = new AlertDialog.Builder(NewActivity.this).create();
//
//        alertDialog.setTitle("Terms & Conditions");
//        alertDialog.setIcon(R.drawable.baseline_info_24);
//        alertDialog.setMessage("Check all details");
//
//
//        alertDialog.setButton("Yes, I do it", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(NewActivity.this, "Okay, I will proceed now...", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        alertDialog.show();


        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("delete");
        alertDialogBuilder.setMessage("are you sure...");
        alertDialogBuilder.setIcon(R.drawable.baseline_delete_24);

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(NewActivity.this, "delete item", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(NewActivity.this, "cancel delete item", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.show();
    }

}

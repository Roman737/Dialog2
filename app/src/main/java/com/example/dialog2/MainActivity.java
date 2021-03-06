package com.example.dialog2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnFon;
    ConstraintLayout constraintLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFon = (Button)findViewById(R.id.idbtn);
        constraintLayout = (ConstraintLayout)findViewById(R.i.idconstl);
        context = MainActivity.this;


    }

    @Override
    public void onClick(View v) {

        final CharSequence[] items = {getText(R.string.red), getText(R.string.yellow), getText(R.string.green)};

        btnFon.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder();
        builder.setTitle(R.string.message);

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0:
                        constraintLayout.setBackgroundColor((R.string.redColor));
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();

                        break;
                    case 1:
                        constraintLayout.setBackgroundColor((R.string.yellowColor));
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();

                        break;
                    case 2:
                        constraintLayout.setBackgroundColor((R.string.greenColor));
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();


    }
}
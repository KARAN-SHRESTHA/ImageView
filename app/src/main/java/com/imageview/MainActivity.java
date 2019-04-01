package com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView ivOut;
    private RadioButton rdo_spiderman, rdo_venom, rdo_miles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivOut = findViewById(R.id.ivOut);

        rdo_spiderman = findViewById(R.id.rdo_spiderman);
        rdo_venom = findViewById(R.id.rdo_venom);
        rdo_miles = findViewById(R.id.rdo_miles);

        rdo_spiderman.setOnClickListener(this);
        rdo_venom.setOnClickListener(this);
        rdo_miles.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.rdo_spiderman:
                Toast toast = Toast.makeText(this, "This is Spiderman", Toast.LENGTH_LONG);
                ivOut.setImageResource(R.drawable.spiderman);
                toast.show();
            break;

            case R.id.rdo_venom:
                Toast toast1 = Toast.makeText(this, "This is venom", Toast.LENGTH_LONG);
                ivOut.setImageResource(R.drawable.venom);
                toast1.show();
            break;

            case R.id.rdo_miles:
                Toast.makeText(this, "This is miles", Toast.LENGTH_LONG).show();
                ivOut.setImageResource(R.drawable.miles);
                break;

        }

    }
}

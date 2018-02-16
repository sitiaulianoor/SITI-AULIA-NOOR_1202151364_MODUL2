package com.example.awl.sitiaulianoor_1202151364_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class RestoMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto_menu);
    }

    public void onClickOrder(View view) {
        if (((RadioButton)findViewById(R.id.rbDineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent);
        }else if (((RadioButton)findViewById(R.id.rbTakeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
}

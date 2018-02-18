package com.example.awl.sitiaulianoor_1202151364_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity  {

    int someVar;
    String pilihan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

   //public void showDatePickerDialog(View view) {
     //   DialogFragment newFragment = new DatePickerFragment();
       // newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));--!>

 //   }
  //  public void processDatePickerResult(int year, int month, int day) {
    //    String month_string = Integer.toString(month + 1);
      //  String day_string = Integer.toString(day);
       // String year_string = Integer.toString(year);
        // Assign the concatenated strings to dateMessage.
        //String dateMessage = (month_string + "/" +
        //        day_string + "/" + year_string);
      //  EditText eTanggal = (EditText) findViewById(R.id.eTanggal);
       // eTanggal.setText(dateMessage);

        //Toast.makeText(this, dateMessage,
          //      Toast.LENGTH_SHORT).show();
 //   }

  //  public void showTimePickerDialog(View view) {
    //    DialogFragment newFragment = new TimePickerFragment();
      //  newFragment.show(getSupportFragmentManager(),
        //        getString(R.string.time_picker));

    //}

    //public void processTimePickerResult(int hourOfDay, int minute) {
        // Convert time elements into strings.
      //  String hour_string = Integer.toString(hourOfDay);
        //String minute_string = Integer.toString(minute);
        // Assign the concatenated strings to timeMessage.

        //EditText eWaktu = (EditText) findViewById(R.id.eWaktu);
        //String timeMessage = (hour_string + ":" + minute_string);
       // eWaktu.setText(timeMessage);
        //Toast.makeText(this, timeMessage,
          //      Toast.LENGTH_SHORT).show();
   // }

    public void PesanTakeAway(View view) {
        Intent i = new Intent(this, ContentMenu.class);
        startActivity(i);
    }
}

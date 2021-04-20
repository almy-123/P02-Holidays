package sg.edu.rp.id19037610.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    TextView type;
    ArrayList<Holiday> data;
    ListView lvHolidays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        type = findViewById(R.id.type);
        lvHolidays = findViewById(R.id.lvHolidays);

        Intent intent = getIntent();
        String holType = intent.getStringExtra(Intent.EXTRA_TEXT);

        type.setText(holType);

        if (holType.equalsIgnoreCase("Secular")) {

            // to reset the arraylist
            data = new ArrayList<>();

            data.add(new Holiday("New Year's Day", "1 January 2021", holType, R.drawable.new_year));
            data.add(new Holiday("Labour Day", "1 May 2021", holType, R.drawable.labour_day));
            data.add(new Holiday("National Day", "9 August 2021", holType, R.drawable.national_day));

        } else if (holType.equalsIgnoreCase("Ethnic & Religion")){

            // to reset the arraylist
            data = new ArrayList<>();

            data.add(new Holiday("Chinese New Year", "12 February 2021", holType, R.drawable.cny));
            data.add(new Holiday("Chinese New Year", "13 February 2021", holType, R.drawable.cny));
            data.add(new Holiday("Good Friday", "2 April 2021", holType, R.drawable.good_friday));
            data.add(new Holiday("Hari Raya Puasa", "13 May 2021", holType, R.drawable.hari_raya_puasa));
            data.add(new Holiday("Vesak Day", "26 May 2021", holType, R.drawable.vesak_day));
            data.add(new Holiday("Hari Raya Haji", "20 July 2021", holType, R.drawable.hari_raya_haji));
            data.add(new Holiday("Deepavali", "4 November 2021", holType, R.drawable.deepavali));
            data.add(new Holiday("Christmas Day", "25 December 2021", holType, R.drawable.christmas));
        }

        CustomAdapter arrayAdapter = new CustomAdapter(this, R.layout.row, data);
        lvHolidays.setAdapter(arrayAdapter);

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Holiday curr = data.get(position);
                String title = curr.getTitle();
                String date = curr.getDate();

                String message = title + " Date: " + date;

                Toast.makeText(Activity2.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
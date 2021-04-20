package sg.edu.rp.id19037610.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView holidayTypes;
    ArrayList<String> types;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        holidayTypes = findViewById(R.id.holidayType);

        types = new ArrayList<>();
        types.add("Secular");
        types.add("Ethnic & Religion");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, types);
        holidayTypes.setAdapter(adapter);

        holidayTypes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = types.get(position);

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(Intent.EXTRA_TEXT, selected);
                startActivity(intent);
            }
        });
    }
}
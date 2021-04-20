package sg.edu.rp.id19037610.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Holiday> {

    private ArrayList<Holiday> holidays;
    private Context context;
    private ImageView imageView;
    private TextView title;
    private TextView date;

    public CustomAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);

        holidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        imageView = rowView.findViewById(R.id.imageView);
        title = rowView.findViewById(R.id.title);
        date = rowView.findViewById(R.id.date);

        Holiday curr = holidays.get(position);

        title.setText(curr.getTitle());
        date.setText(curr.getDate());
        imageView.setImageResource(curr.getImage());

        return rowView;
    }
}

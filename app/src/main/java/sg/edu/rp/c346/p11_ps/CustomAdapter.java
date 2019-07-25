package sg.edu.rp.c346.p11_ps;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    private String[] itemList;

    public CustomAdapter(Context context, int resource,String[] itemList) {
        super(context, resource);
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView textView = rowView.findViewById(R.id.textView);
        ImageView iv = rowView.findViewById(R.id.iv);
        String currentItem = itemList[position];
        String value = itemList[position];
        textView.setText(value);
        if (value == "Bio")  {
            iv.setImageResource(R.drawable.ic_info_outline_black_24dp);
        } else if (value == "Vaccination")  {
            iv.setImageResource(R.drawable.ic_edit_black_24dp);
        } else if (value == "Anniversary") {
            iv.setImageResource(R.drawable.ic_date_range_black_24dp);
        } else {
            iv.setImageResource(R.drawable.ic_star_black_24dp);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}

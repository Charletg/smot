package adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.miagegrenoble.cleavie.R;

import java.util.List;

import data.IContact;


/**
 * Created by Thomas on 12/10/2014.
 */
public class ListContactAdapter extends BaseAdapter{

    protected Activity activity;
    protected LayoutInflater inflater;
    protected List<IContact> contacts;

    public ListContactAdapter(Activity activity, List<IContact> contacts) {
        this.activity = activity;
        this.contacts = contacts;
    }

    public int getCount() {
        return contacts.size();
    }

    public Object getItem(int location) {
        return contacts.get(location);
    }

    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("NewApi")
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.tab2, null);

        // On récupère les différentes view
        ImageView imageView = (ImageView) convertView
                .findViewById(R.id.list_contact_phone);
        TextView nom = (TextView) convertView.findViewById(R.id.list_contact_nom);
        TextView specialite = (TextView) convertView.findViewById(R.id.list_contact_specialite);
        IContact item = contacts.get(position);

        // Le titre et la description du champ
        nom.setText(item.getNom());
        specialite.setText(item.getSpecialite());

        return convertView;
    }
}


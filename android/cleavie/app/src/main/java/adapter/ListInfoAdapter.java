package adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.miagegrenoble.cleavie.R;

import java.util.List;

import data.IInfo;

/**
 * Created by Thomas on 12/10/2014.
 */
public class ListInfoAdapter extends BaseAdapter{

    protected Activity activity;
    protected LayoutInflater inflater;
    protected List<IInfo> infos;

    public ListInfoAdapter(Activity activity, List<IInfo> infos) {
        this.activity = activity;
        this.infos = infos;
    }

    public int getCount() {
        return infos.size();
    }

    public Object getItem(int location) {
        return infos.get(location);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.tab1, null);

        // On récupère les différentes view
        TextView nom = (TextView) convertView.findViewById(R.id.list_info_nom);
        TextView description = (TextView) convertView.findViewById(R.id.list_info_description);
        IInfo item = infos.get(position);

        // Le titre et la description du champ
        nom.setText(item.getNom());
        description.setText(item.getDescription());

        return convertView;
    }
}



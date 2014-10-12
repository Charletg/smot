package fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.miagegrenoble.cleavie.R;
import java.util.ArrayList;
import java.util.List;

import adapter.ListInfoAdapter;
import data.IInfo;
import data.IPatient;

/**
 * Created by Thomas on 12/10/2014.
 */


public class TabFragment1 extends Fragment {
    IPatient patient = null;
    ListView listChamps = null;
    TextView titreChamps = null;
    ArrayAdapter<String> listAdapter = null;

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Activity a = this.getActivity();
        if (a instanceof MediaActivity) {
            mediaActivity = (MediaActivity) a;
        } else {
            throw new IllegalAccessError("Parent activity not an MediaActivity");
        }

        View rootView = super.onCreateView(inflater, container, savedInstanceState);

        // Liste des infos
        List<IInfo> infos = patient.getListInfos();
        final ArrayList<IInfo> lesInfos = new ArrayList<IInfo>();
        for (IInfo c : patient.getListInfos()) {
            lesInfos.add(c);
        }


        View expView = rootView.findViewById(R.id.listChild);
        if (expView instanceof ListView) {
            listView = (ListView) expView;
        } else {
            Log.e(this.getClass().getName(), "listChild not a list view");
        }
        listAdapter = new ListInfoAdapter(getActivity(), lesInfos);
        listView.setAdapter(listAdapter);

        return rootView;
    }
}

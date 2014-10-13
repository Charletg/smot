package fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    ListView listView = null;
    ArrayAdapter<String> listAdapter = null;

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



         super.onCreateView(inflater, container, savedInstanceState);

         View rootView = inflater.inflate(R.layout.listes, container,
                 false);

        // Liste des infos
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

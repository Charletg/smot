package fragment;

import android.app.Fragment;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

import data.IPatient;

import static org.elasticsearch.node.NodeBuilder.*;
/**
 * Created by Guillaume on 13/10/2014.
 */

public class TabFragment1bis extends Fragment {
    IPatient patient = null;
    // Initialisation du client
    Node node = nodeBuilder().clusterName("smot-1.3.2").node();
    Client client = node.client();

    public void ecrireClient(IPatient patient) {

        IndexResponse response = client.prepareIndex("smot", "cleavie").setSource(patient.toString()).execute().actionGet();
        String _id = response.getId();
    }

    // Fermeture de la connexion
    node.close();

}

package fragment;

import android.app.Fragment;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

import data.IPatient;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

/**
 * Created by Thomas on 12/10/2014.
 */
public class TabFragment2 extends Fragment {

    public String getPatient(String id){
        Node node = nodeBuilder().clusterName("smot-1.3.2").node();
        Client client = node.client();
        GetResponse response = client.prepareGet("smot", "cleavie", id)
                .execute()
                .actionGet();
        node.close();
        return String.valueOf(response);
    }
}

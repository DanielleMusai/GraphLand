import api.DirectedWeightedGraph;
import api.DirectedWeightedGraphAlgorithms;
import api.EdgeData;
import api.NodeData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.w3c.dom.Node;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * This class is the main class for Ex2 - your implementation will be tested using this class.
 */
public class Ex2 {
    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @return
     */
    public static DirectedWeightedGraph getGrapg(String json_file) {
        DirectedWeightedGraph ans = new MyGraph();
        try {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(MyGraph.class, new MyGraphDeserialize());
            Gson gson = builder.setPrettyPrinting().create();

            Reader reader = Files.newBufferedReader(Paths.get(json_file));
            ans = gson.fromJson(reader, MyGraph.class);
            System.out.println(ans);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ans;
    }
    /**
     * This static function will be used to test your implementation
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     * @returnc
     */
    public static DirectedWeightedGraphAlgorithms getGrapgAlgo(String json_file) {
        DirectedWeightedGraphAlgorithms ans = new MyAlgorithm();
        return ans;


    }

    /**
     * This static function will run your GUI using the json fime.
     *
     * @param json_file - a json file (e.g., G1.json - G3.gson)
     */
    public static void runGUI(String json_file) {
        DirectedWeightedGraphAlgorithms alg = getGrapgAlgo(json_file);
        // ****** Add your code here ******
        //
        // ********************************
    }
    public static void main(String[] args) {
      //  getGrapg("data\\G1.json");

       getGrapgAlgo("data\\G1.json");
    }
}

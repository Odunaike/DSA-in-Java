import java.util.*;

public class Graph {
    public static void main(String... args){
//        Implementing the graph in book-page 96 of grokking algorithms.
//        The graph starts from A - Z
        HashMap<String, List<String>> graph = new HashMap<>();

        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("F"));
        graph.put("C", List.of("D", "E"));
        graph.put("D", List.of("F"));
        graph.put("E", List.of("F"));
        graph.put("F", List.of("Z"));

        findLeastNumberOfSteps(graph, "A", "Z");
    }

    public static void findLeastNumberOfSteps(HashMap<String, List<String>> graph, String start, String end){
        //Set<String> keys = graph.keySet();
        Queue<String> queueOfNodes = new LinkedList<>();

        queueOfNodes.add(start);//add the start destination to queue
        StringBuilder journey = new StringBuilder();

        while (!queueOfNodes.isEmpty()){
            String node = queueOfNodes.remove();

            journey.append(node);

            List<String> neighbours = graph.get(node); //get node's neighbours

            String q = " -> " + neighbours + " \n";
            journey.append(q);
            for (String neighbour : neighbours){

                String jj =  "\tI checked " + neighbour;
                journey.append(jj);

                if (neighbour.equals(end)){ //check if neighbour is destination
                    System.out.println("yes");
                    String j =  " which is my destination";
                    journey.append(j);

                    System.out.println(journey.toString());
                    return;
                }else { //if not get the neighbours of this neighbour

                    List<String> neighboursChildren = graph.get(neighbour);
                    String h = " which is not it so I will add its neighbours "  + neighboursChildren + " to queue. \n";
                    journey.append(h);
                    queueOfNodes.addAll(neighboursChildren);
                }
            }

            System.out.println(queueOfNodes);
        }

    }
}

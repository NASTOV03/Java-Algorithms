import java.util.*;

public class BFS {
    public static void bfs(Map<String, List<String>> graph, String start) {
        // bfs - goes level by level
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();

            if (!visited.contains(node)) {
                System.out.print(node + " ");
                visited.add(node);

                // add all connected nodes
                for (String neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // simple example graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList());
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList());

        System.out.println("BFS starting from A:");
        bfs(graph, "A");
    }
}

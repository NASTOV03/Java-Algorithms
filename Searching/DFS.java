import java.util.*;

public class DFS {
    public static void dfs(Map<String, List<String>> graph, String start, Set<String> visited) {
        // dfs - dives deep before backtracking
        System.out.print(start + " ");
        visited.add(start);

        for (String neighbor : graph.getOrDefault(start, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        // same graph as bfs
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList());
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList());

        System.out.println("DFS starting from A:");
        dfs(graph, "A", new HashSet<>());
    }
}

package classWorkGraph;

import java.util.ArrayList;
import java.util.List;

public class TraverseGraph {

	private static List<Integer[]> graph = new ArrayList<Integer[]>();
	private static boolean[] visited = new boolean[9];

	public static void main(String[] args) {
		graph.add(new Integer[] { 3, 6 });
		graph.add(new Integer[] { 3, 4, 5, 6 });
		graph.add(new Integer[] { 8 });
		graph.add(new Integer[] { 0, 1, 5 });
		graph.add(new Integer[] { 1, 6 });
		graph.add(new Integer[] { 1, 3 });
		graph.add(new Integer[] { 0, 1, 4 });
		graph.add(new Integer[] {});
		graph.add(new Integer[] { 2 });

		for (int i = 0; i < graph.size(); i++) {
			if (!visited[i]) {
				DFS(i);
				System.out.println();
			}
		}

	}

	private static void DFS(int node) {
		if (!visited[node]) {
			visited[node] = true;
			for (Integer child : graph.get(node)) {
				DFS(child);
			}
			System.out.print(" " + node);
		}
	}

}

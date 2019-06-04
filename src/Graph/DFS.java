package Graph;

import java.util.*;

public class DFS {
	/*
	 * ------------------------------------------ Data structure used to represent a
	 * graph ------------------------------------------
	 */
	int[][] adjMatrix;
	int rootNode = 0;
	int NNodes;

	boolean[] visited;

	/*
	 * ------------------------------- Construct a graph of N nodes
	 * -------------------------------
	 */
	DFS(int N) {
		NNodes = N;
		adjMatrix = new int[N][N];
		visited = new boolean[N];
	}

	DFS(int[][] mat) {
		int i, j;

		NNodes = mat.length;

		adjMatrix = new int[NNodes][NNodes];
		visited = new boolean[NNodes];

		for (i = 0; i < NNodes; i++)
			for (j = 0; j < NNodes; j++)
				adjMatrix[i][j] = mat[i][j];
	}

	public void dfs() {
		// DFS uses Stack data structure

		Stack<Integer> s = new Stack<Integer>();

		s.push(rootNode);
		visited[rootNode] = true;

		printNode(rootNode);

		while (!s.isEmpty()) {
			int n, child;

			n = (s.peek()).intValue();

			child = getUnvisitedChildNode(n);

			if (child != -1) {
				visited[child] = true;

				printNode(child);

				s.push(child);
			} else {
				s.pop();
			}
		}

		clearVisited(); // Clear visited property of nodes
	}

	int getUnvisitedChildNode(int n) {
		int j;

		for (j = 0; j < NNodes; j++) {
			if (adjMatrix[n][j] > 0) {
				if (!visited[j])
					return (j);
			}
		}

		return (-1);
	}

	void clearVisited() {
		int i;

		for (i = 0; i < visited.length; i++)
			visited[i] = false;
	}

	void printNode(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7 8
		// ===================================================
		int[][] conn = { { 0, 1, 0, 1, 0, 0, 0, 0, 1 }, // 0
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0 }, // 1
				{ 0, 0, 0, 1, 0, 1, 0, 1, 0 }, // 2
				{ 1, 0, 1, 0, 1, 0, 0, 0, 0 }, // 3
				{ 0, 0, 0, 1, 0, 0, 0, 0, 1 }, // 4
				{ 0, 0, 1, 0, 0, 0, 1, 0, 0 }, // 5
				{ 0, 0, 0, 0, 0, 1, 0, 0, 0 }, // 6
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0 }, // 7
				{ 1, 0, 0, 0, 1, 0, 0, 0, 0 } };// 8

		DFS G = new DFS(conn);

		G.clearVisited();
		G.dfs();

	}
}

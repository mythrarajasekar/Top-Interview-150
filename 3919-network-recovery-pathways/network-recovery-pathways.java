import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {

        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int maxCost = 0;

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            indegree[e[1]]++;
            maxCost = Math.max(maxCost, e[2]);
        }

        // Topological Sort
        Queue<Integer> q = new LinkedList<>();
        List<Integer> topo = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            topo.add(u);

            for (int[] edge : graph[u]) {
                if (--indegree[edge[0]] == 0) {
                    q.offer(edge[0]);
                }
            }
        }

        int low = 0, high = maxCost;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            long[] dp = new long[n];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;

            for (int u : topo) {

                if (dp[u] == Long.MAX_VALUE) continue;

                if (u != 0 && u != n - 1 && !online[u]) continue;

                for (int[] edge : graph[u]) {

                    int v = edge[0];
                    int cost = edge[1];

                    if (cost < mid) continue;

                    if (v != 0 && v != n - 1 && !online[v]) continue;

                    dp[v] = Math.min(dp[v], dp[u] + cost);
                }
            }

            if (dp[n - 1] <= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
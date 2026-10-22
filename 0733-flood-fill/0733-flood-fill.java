class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int oldColor = image[sr][sc];

        if (oldColor == color)
            return image;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{sr, sc});
        image[sr][sc] = color;

        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int i = curr[0];
            int j = curr[1];

            for (int k = 0; k < 4; k++) {
                int nr = i + dr[k];
                int nc = j + dc[k];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n
                        && image[nr][nc] == oldColor) {

                    image[nr][nc] = color;
                    q.add(new int[]{nr, nc});
                }
            }
        }

        return image;
    }
}

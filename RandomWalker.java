public class RandomWalker {
    public static void main(String[] args) {
        int steps = Integer.parseInt(args[0]);
        int x = 0, y = 0;

        System.out.println("(" + x + ", " + y + ")");
        for (int i = 0; i < steps; i++) {
            double r = Math.random();
            if (r < 0.25) x++;
            else if (r < 0.5) x--;
            else if (r < 0.75) y++;
            else y--;

            System.out.println("(" + x + ", " + y + ")");
        }

        int distance = Math.abs(x) + Math.abs(y);
        System.out.println("Manhattan distance = " + distance);
    }
}

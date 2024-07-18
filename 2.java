public class Main {
    public static void main(String[] args) {
        System.out.println("w x y z");
        for (int w = 0; w < 2; w++) {
            for (int x = 0; x < 2; x++) {
                for (int y = 0; y < 2; y++) {
                    for (int z = 0; z < 2; z++) {
                        if (!(!(x <= w) || (y <= z) || (y == 0))) {
                            System.out.println(w + " " + x + " " + y + " " + z);
                        }
                    }
                }
            }
        }
    }
}

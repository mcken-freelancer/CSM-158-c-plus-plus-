public class EvenLoop {
    public static void main(String[] abra) {

        for (int i = 0; i <= 20; i++) {
            if (i == 0)
                continue;
            System.out.println(i += 1);
            if (i == 18)
                break;
        }
    }
}

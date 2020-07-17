public class Main {
    public static void main(String[] args) {
        int initial = 100;
        int adj = 1000;
        int bonus;
        if (adj >= 1000) {
           bonus = adj / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}
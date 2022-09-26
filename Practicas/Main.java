public class Main {
    public static void main(String[] args) {
        Sim s = new Sim(6, (int) 1e7); // 3 seconds using 6 threads
        System.out.println(s.pi());
    }
}
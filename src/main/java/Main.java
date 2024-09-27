public class Main {
    public static void main(String[] args) {
        CorpoHumano c1 = new CorpoHumano(60, 0.06f);
        System.out.println("Massa: " + c1.getMassa());
        System.out.println("Densidade: " + c1.getDensidade());
        System.out.println("Volume: " + c1.getVolume());
    }
}

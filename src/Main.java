public class Main {
    public static void main(String[] args) {
        Swimable sw = new Duck("Sono");
        sw.swim();
        Swimable sw1 = new Duck("ask");
        Swimable sw2 = new Duck("polo");
        Swimable sw3 = new Duck("son");
        Swimable sw4 = new Duck("sin");
        Swimable saw = new Turtle("Elbek");
        saw.swim();
        Swimable saw1 = new Turtle("shono");
        Swimable saw2 = new Turtle("mok");
        Swimable saw3 = new Turtle("fey");
        Swimable saw4 = new Turtle("gun");
        Swimable sws = new Sharks("hit");
        sws.swim();
        Swimable sws1 = new Sharks("fin");
        Swimable sws2 = new Sharks("mik");
        Swimable sws3 = new Sharks("cas");
        Swimable sws4 = new Sharks("Ariet");
        Swimable[] array = {sw, sw1, sw2, sw3, sw4, saw, saw1, saw2, saw3, saw4, sws, sws1, sws2, sws3, sws4};
        for (Swimable swimable : array) {
            System.out.println(swimable);
        }
    }
}
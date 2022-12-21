public class Sharks implements Swimable  {
    private String name ;

    public Sharks(String name) {
        this.name = name;
    }
    @Override
    public void swim() {
        System.out.println("плавает быстро");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sharks{" +
                "name='" + name + '\'' +
                '}';
    }
}

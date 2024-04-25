package day12.stream.quiz2;

public class Traveler {
    private String name;
    private String email;

    public Traveler(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String
    toString() {
        return "Traveler{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

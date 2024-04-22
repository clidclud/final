import java.util.List;

public class Animal {
    private static int idCounter = 0;
    private int id;
    private String name;
    private String data;
    private List<String> commands;

    public Animal(String name, String data, List<String> commands) {
        this.id = ++idCounter;
        this.name = name;
        this.data = data;
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "{" +
                "ID: " + id +
                ", Кличка: " + name +
                ", Дата рождения: " + data +
                ", Команды: " + commands +
                '}';
    }
}
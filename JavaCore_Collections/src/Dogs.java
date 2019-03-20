public class Dogs extends Animals {
    Dogs(String name, String color, String race,  int age)  {
        type = "Собаки";
        this.name = name;
        this.color = color;
        this.sex = race;
        this.age = age;
    }
    Dogs(String color, String type)  {
        this.color = color;
        this.type = type;
    }
}

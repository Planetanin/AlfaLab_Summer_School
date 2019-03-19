public class Cats extends Animals {
    Cats(String name, String color, String sex, int age)  {
        type = "Кошки";
        this.name = name;
        this.color = color;
        this.sex = sex;
        this.age = age;
    }
    Cats(String color, String type)
    {
        this.color = color;
        this.type = type;
    }
}

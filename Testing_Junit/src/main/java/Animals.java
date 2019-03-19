public abstract class Animals{
    String name;
    String sex;
    String color;
    int age;
    String type;
    @Override
    public String toString() {
        if(name == null)
            return "Животное: " + type + "\nЦвет: " + color;
        else
            return "Животное: " + type + "\nИмя: " + name + "\nРод: " + sex + "\nЦвет: " + color + "\nВозраст: " + age;
    }
}


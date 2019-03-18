import java.util.Random;
public class Battle {
    private String name;
    private int age;
    private String color;
    private int gender;

    private int endurance;
    private int strength;
    private int agility;

    public Battle(String name, int age, String color, int size) {
        this.name = name;
        this.age = age;
        this.color = color;

        Random rnd = new Random();
        this.endurance = rnd.nextInt(5);
        this.strength = rnd.nextInt(3);
        this.agility = rnd.nextInt(6);
        this.gender = rnd.nextInt(2);
    }


    public static void victory(Battle cat){
        System.out.println("Победитель: " + cat);
    }

    public static void defeat(Battle cat){
        System.out.println("Проигравший: " + cat);
    }

    public static void fight(Battle chmpOne, Battle chmpTwo){
        long chmpOneChar = chmpOne.getEndurance() + chmpOne.getStrength() + chmpOne.getAgility();
        long chmpTwoChar = chmpTwo.getEndurance() + chmpTwo.getStrength() + chmpTwo.getAgility();

        System.out.println("** S - Сила, E - Выносливость, A - Ловкость");
        System.out.println();
        System.out.println(chmpOne.getName() + " VS. " + chmpTwo.getName());
        System.out.println("S:" + chmpOne.getStrength() + " E:" + chmpOne.getEndurance() + " A:" + chmpOne.getAgility() + " X " +
                "S:" + chmpTwo.getStrength() + " E:" + chmpTwo.getEndurance() + " A:" + chmpTwo.getAgility() );

        if(chmpOne.getGender()!=chmpTwo.getGender()){
            System.out.println("Это не по джентельменски");
            System.out.println(chmpOne);
            System.out.println(chmpTwo);
            return;
        }

        System.out.println("МЯУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУУ");

        if(chmpOneChar > chmpTwoChar){
            Battle.victory(chmpOne);
            Battle.defeat(chmpTwo);
        }else if(chmpOneChar < chmpTwoChar){
            Battle.victory(chmpTwo);
            Battle.defeat(chmpOne);
        }else{
            System.out.println("Ничья!");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getGender() {
        return gender;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }


    @Override
    public String toString() {
        String gender;
        if(this.gender == 1) gender = "male";
        else gender = "female";
        return name + ", age=" + age + ", color=" + color + ", gender=" + gender;
    }


}

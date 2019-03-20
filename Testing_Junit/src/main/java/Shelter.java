import java.util.*;
public class Shelter {

    List<Animals> shelter = new ArrayList<>();

    public void setPet(Animals Animals){

        shelter.add(Animals);
    }

    public void petsInShelter() {
        int shelterSize = shelter.size();
        for (int i = 0; i < shelterSize; i++) {
            System.out.println("Животные в приюте:\n" + "\n" + shelter.get(i));
        }

    }

    public Animals getRandomPet() {
       Random random = new Random();
       int index = random.nextInt(shelter.size());
       return (shelter.get(index));

}

    public static void main(String args[]){
        Dogs Grom = new Dogs("Гром", "серый", "кобель", 8);
        Cats Nora = new Cats("Нора", "белый", "кошка", 3);
        Cats Oskar = new Cats("Оскар", "рыжий", "кот", 18);
        Dogs Runa = new Dogs("Руна", "чёрно-белый", "сука", 4);
        Shelter main = new Shelter();
        main.setPet(Grom);
        main.setPet(Nora);
        main.setPet(Oskar);
        main.setPet(Runa);
        main.petsInShelter();
        System.out.println("\nСлучайное животное:\n" + "\n" + main.getRandomPet());

    }




}




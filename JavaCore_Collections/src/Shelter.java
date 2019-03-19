import java.util.*;
public class Shelter {
        public static void main(String args[]) {
            String animalColor;
            int animalType;
            Dogs Grom = new Dogs("Гром", "серый", "кобель", 8);
            Cats Nora = new Cats("Нора", "белый", "кошка", 3);
            Cats Oskar = new Cats("Оскар", "рыжий", "кот", 18);
            Dogs Runa = new Dogs("Руна", "чёрно-белый", "сука", 4);
            List<Animals> animals = new ArrayList<Animals>();
            animals.add(Grom);
            animals.add(Nora);
            animals.add(Oskar);
            animals.add(Runa);
            Scanner in = new Scanner(System.in);
            int i;
            System.out.println("Действия:\n" +
                    "1. Добавить в приют\n2. Забрать случайное животное\n");
            if (in.hasNextInt()) {
                i = in.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("Тип: \n1. Кошки \n2. Собаки");
                        if (in.hasNextInt()) {
                            animalType= in.nextInt();
                            if (animalType == 1) {
                                System.out.println("\nЦвет: ");
                                animalColor = in.next();
                                Cats cat = new Cats(animalColor, "Кошки");
                                animals.add(cat);
                                System.out.println("\nДобавлено:" + animals.get(animals.size() - 1));
                            } else if (animalType == 2) {
                                System.out.println("\nЦвет: ");
                                animalColor = in.next();
                                Dogs dog = new Dogs(animalColor,"Cобака");
                                animals.add(dog);
                                System.out.println("Добавлено:\n" + animals.get(animals.size() - 1));
                            } else
                                System.out.println("Таких нет");
                        } else
                            System.out.println("Таких нет");
                        break;
                    case 2:
                        final Random random = new Random();
                        System.out.println("Случайное животное:\n" + animals.get(random.nextInt(animals.size())));
                        break;
                }
            } else {
                System.out.println("Нет такого пункта");
            }
        }
    }


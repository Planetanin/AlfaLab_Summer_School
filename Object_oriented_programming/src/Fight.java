public class Fight {
    public static void main(String[] args) {
        Battle Oskar = new Battle(" Оскар ", 3, " Рыжий ", 15);
        Battle Murzic = new Battle(" Мурзик ", 5, " Чёрный ", 20);

        Battle.fight(Oskar, Murzic);
    }

}

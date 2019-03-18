/*
1.Создать 2 своих собственных исключения
2.Написать методы, в которых могут бросаться ваши исключения
3.Написать метод, который будет вызывать методы из пункта 2 и обрабатывать все
 */

        public class SolutionException {
           public static void main(String[] args) {
                Amigo amigo = new Amigo(false);

                       System.out.print("Установлен ли у вас самый лучший в мире браузер Амиго: ");
                System.out.println(amigo.isInstalled());
                System.out.println();

                        try {
                        amigo.Uninstall();
                        throw new SomethingWrongException("Попытка удаления Амиго");
                    }
                catch (SomethingWrongException e) {
                        System.out.println("1. Тут перехватываем ручное исключение, с проброшенным сообщением об ошибке");
                   }
                finally {
                        if (amigo.isInstalled()) {
                               amigo.Reinstall();
                            }
                        else {
                                amigo.Install();
                            }
                    }
                        System.out.print("Установлен ли теперь у вас браузер Амиго: ");
                System.out.println(amigo.isInstalled());
               System.out.println();

                        try {
                        amigo.Run();
                    }
                catch (AmigoException e){
                        System.out.println("2. Тут дождались подставы от метода Run:" + e);
                    }
                finally {
                        System.out.println();
                        System.out.println("Ну всё, теперь проще купить новый компьютер.");
                    }
            }
}

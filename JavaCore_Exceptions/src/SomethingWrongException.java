public class SomethingWrongException extends Exception {

            public SomethingWrongException(String error) {
                System.out.println("Случилось что-то непредвиденное: " + error);
           }
}

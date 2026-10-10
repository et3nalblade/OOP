package arrays;

// обработка ошибок при работе с массивами
public class ArrayException extends RuntimeException {

    // Конструктор принимает сообщение об ошибке и передаёт его родительскому классу
    public ArrayException(String message) {
        super(message);
    }
}

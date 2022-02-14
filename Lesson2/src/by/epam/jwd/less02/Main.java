package by.epam.jwd.less02;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        Logic logic = new Logic();

        //task1
        int number = input.inputByScanner();
        boolean isTrue = logic.task1(number);
        output.outputBoolean(isTrue);

        //task2
        int x = input.inputByScanner();
        int y = input.inputByScanner();
        boolean isTrue2 = logic.task2(x, y);
        output.outputBoolean(isTrue2);

        //task3
        int number1 = input.inputByRandom();
        int number2 = input.inputByRandom();
        int number3 = input.inputByRandom();
        int sum = logic.task3(number1, number2, number3);
        output.outputInt(sum);
    }
}

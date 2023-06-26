import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        converterParaWrapper();
    }

    public static void converterParaWrapper() {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira um número: ");
        long inputNum = s.nextLong();

        Long inputToWrapper = Long.valueOf(inputNum);

        System.out.println("O número escolhido foi: " + inputToWrapper);
    }
}

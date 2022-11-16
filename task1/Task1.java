import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Аргументов должно быть 2");
            return;
        }
        int n = 0;
        int m = 0;

        try {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder printAnswer = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        int answerNumber = 1;
        answer.add(answerNumber);

        while (true) {
            answerNumber = 1 + (answerNumber + m - 2) % n;
            if (answerNumber == 1) {
                break;
            }
            answer.add(answerNumber);
        }

        for (int i : answer) {
            printAnswer.append(i);
        }

        System.out.println(printAnswer);
    }
}
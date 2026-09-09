import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Syllabus_Task1_SalaryTransformation {
    public static void main(String[] args) {
        List<Integer> salaryList = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int salary = sc.nextInt();
                salaryList.add((int) Math.round(salary * 1.1));
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < salaryList.size(); i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(salaryList.get(i));
        }

        System.out.println(result.toString());
    }
}

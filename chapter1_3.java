import java.util.Scanner;

public class chapter1_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("생일을 입력하세요: ");
        int birthday = scanner.nextInt();
        String birthdayStr = String.valueOf(birthday);
        if (birthdayStr.length() != 8) {
        	scanner.close();
        	return;
        }

        String year = birthdayStr.substring(0, 4);
        String month = birthdayStr.substring(4, 6);
        String day = birthdayStr.substring(6, 8);

        System.out.println(year+"년 "+month+"월 "+day+"일");

        scanner.close();
    }
}
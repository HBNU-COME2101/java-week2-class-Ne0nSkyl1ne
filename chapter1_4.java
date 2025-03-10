import java.util.Scanner;

public class chapter1_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("여행지 >> ");
        String destination=scanner.nextLine();
        
        System.out.print("인원수 >> ");
        int people=scanner.nextInt();
        
        System.out.print("숙박일 >> ");
        int days=scanner.nextInt();
        
        System.out.print("1인당 항공료 >> ");
        int price1=scanner.nextInt();
        
        System.out.print("1인당 숙박비 >> ");
        int price2=scanner.nextInt();
        
        int total=people*price1+(people/2+1)*days*price2;

        System.out.println(people+"명의 "+destination+" "+days+"박 "+(days+1)+"일 여행에는 방이 "+(people/2+1)+"개 필요하며 경비는 "+total+"원 입니다.");

        scanner.close();
    }
}
import java.util.Scanner;

public class CurrencyAlgorithm {
    public static void main(String[] args) {
        //25000원을
      int curr50000 = 50000;
      int curr10000 = 10000;
      int curr5000 = 5000;
      int curr1000 = 1000;
      int curr500 = 500;
      int curr100 = 100;
      int curr50 = 50;
      int curr10 = 10;

      int refund = 25480;

        System.out.printf("5만원권 %d장 나머지 :%d\n",refund/curr50000,refund%curr50000);
        refund = refund%50000;
        System.out.printf("1만원권 %d장 나머지 :%d\n",refund/curr10000,refund%curr10000);
        // 5000원권은 1장만 나오게 하고 싶다. 왜냐하면 25000에서 2만원은 만원짜리 두개로 처리했기 때문이다.
        refund = refund%10000;
        System.out.printf("5천원권 %d장 나머지 :%d\n",refund/curr5000,refund%curr5000);
        refund = refund%5000;
        System.out.printf("1천원권 %d장 나머지 :%d\n",refund/curr1000,refund%curr1000);
        refund = refund%1000;
        System.out.printf("5백원권 %d장 나머지 :%d\n",refund/curr500,refund%curr500);
        refund = refund%500;
        System.out.printf("1백원권 %d장 나머지 :%d\n",refund/curr100,refund%curr100);
        refund = refund%100;
        System.out.printf("5십원권 %d장 나머지 :%d\n",refund/curr50,refund%curr50);
        refund = refund%50;
        System.out.printf("십원권 %d장 나머지 :%d\n",refund/curr10,refund%curr10);
        refund = refund%10;

    }
}

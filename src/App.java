import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int n1,n2,select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz:");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();

        switch(select){
            case 1:
            inp.close();
            System.out.println("Toplam: "+(n1+n2));
            break;
            case 2:
            inp.close();
            System.out.println("Çıkarma: "+(n1-n2));
            break;
            case 3:
            inp.close();
            System.out.println("Çarpma: "+(n1*n2));
            break;
            case 4:
            if(n2!=0){
                inp.close();
                System.out.println("Bölme: "+(n1/n2));
            }else{
                inp.close();
                System.out.println("Bir Sayı 0'a Bölünemez!");
            }
            break;
            default:
            inp.close();
            System.out.println("Yanlış Giriş Yaptınız!");
        }
    }
}

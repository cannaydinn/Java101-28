import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        // Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı
        // mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı
        // değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

        // Mükemmel Sayı Nedir ?
        // Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen
        // sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        Scanner sc = new Scanner(System.in);
        int toplam = 0, sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi=sc.nextInt();

        if(sayi<1){
            System.out.println(sayi+" Mükemmel sayi değildir");
        }
        else{
            for(int i=1; i<sayi; i++){
                if(sayi % i == 0){
                    toplam += i;
                }
            }
            if(sayi % toplam == 0){
                System.out.println(sayi+" Mükemmel sayıdır");
            }
            else{
                System.out.println(sayi+" Mükemmel sayı değildir");
            }
        }
    }
}
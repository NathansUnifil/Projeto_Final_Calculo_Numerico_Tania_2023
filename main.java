import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int faone = 5;
        int fatwo = 5;
        int fbone = -5;
        int fbtwo = -5;
        int dife =  0;
        int perg = 1;
        boolean ale = false;
        boolean secondStop = false;
        String Sfaone;
        String Sfatwo;
        String Sfbone;
        String Sfbtwo;
        String Sdife;
        int min = 0;
        int max = 1;
        boolean stop = false;
        System.out.println("Começa agora!");
        System.out.println("Utiliza configurações default? (0/1)");
        perg = input.nextInt();
        if (perg == 1) {
            System.out.println("Ok");
            ale = true;
        } else if (perg == 0) {
            System.out.println("Digite F(a) vertical");
            faone = input.nextInt();
            System.out.println("Digite F(a) horizotal");
            fatwo = input.nextInt();

            System.out.println("Digite F(b) vertical");
            fbone = input.nextInt();

            System.out.println("Digite F(b) horizotal");
            fbtwo = input.nextInt();

            System.out.println("Digite o episolon");
            dife = input.nextInt();

            System.out.println("Numeros Aleatorios? (0/1)");
            perg = input.nextInt();
            if (perg == 1) {
                ale = true;
            } else if (perg == 0) {
                ale = false;
            }
        } else {
            System.out.println("Erro!");
        }
        if (ale) {
            while (stop == false) {
            int bool = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (bool == 1){
                faone = faone + 1;
            } else {
                faone = faone - 1;
            }
            //System.out.println("F(aa) = " + faone);
            bool = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (bool == 1){
                fatwo = fatwo + 1;
            } else {
                fatwo = fatwo - 1;
            }
            //System.out.println("F(ab) = " + fatwo);
            bool = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (bool == 1){
                fbone = fbone + 1;
            } else {
                fbone = fbone - 1;
            }
            //System.out.println("F(ba) = " + fbone);
            bool = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (bool == 1){
                fbtwo = fbtwo + 1;
            } else {
                fbtwo = fbtwo - 1;
            }
            //System.out.println("F(bb) = " + fbtwo);
            if (faone == -fbone - dife && fatwo == -fbtwo - dife) {
                stop = true;
                System.out.println("Resultados finais");
                System.out.println("F(aa) = " + faone);
                System.out.println("F(ab) = " + fatwo);
                System.out.println("F(ba) = " + fbone);
                System.out.println("F(bb) = " + fbtwo);
                System.out.println("Episolon = " + dife);
                secondStop = true;
                }
            }
        }
        if (faone == -fbone - dife && fatwo == -fbtwo - dife && !secondStop) {
            System.out.println("F(aa) = " + faone);
            System.out.println("F(ab) = " + fatwo);
            System.out.println("F(ba) = " + fbone);
            System.out.println("F(bb) = " + fbtwo);
            System.out.println("Episolon = " + dife);
            System.out.println("É possivel um zero de função não-linear");
        }

        if (faone != -fbone - dife && fatwo != -fbtwo - dife && !secondStop) {
            System.out.println("F(aa) = " + faone);
            System.out.println("F(ab) = " + fatwo);
            System.out.println("F(ba) = " + fbone);
            System.out.println("F(bb) = " + fbtwo);
            System.out.println("Episolon = " + dife);
            System.out.println("Não é possivel um zero de função não-linear");
        }
    }
}

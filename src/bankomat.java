import java.util.Scanner;

public class bankomat
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Dzień dobry.Wprowadź kartę.\nDziękuję.A teraz podaj kod PIN:\n___");
        String pin = s.nextLine();

        if (pin.equals("123")) {
            {
                System.out.println("Proszę czekać, trwa sprawdzanie karty.\nWitaj w banku Shtrap-gang-bank!");
            }
            konto saldo = new konto();
            saldo.Menu();
            int n = s.nextInt();
            switch (n) {
                case 1:
                    for (int wydrukujmeni = 0; wydrukujmeni <= n; wydrukujmeni = s.nextInt()) {
                        System.out.println(saldo.getStankonta());
                        saldo.Menu();
                    }

                case 2:
                    for (int wydrukujmeni = 0; wydrukujmeni <= n; wydrukujmeni = s.nextInt()) {
                        System.out.println("Podaj kwotę:");
                        int x = s.nextInt();
                        if (x > saldo.getStankonta()) {
                            System.out.println("Nie masz wystarczających środków na koncie. Wpisz ponownie kwotę:");
                            saldo.Menu();
                            continue;
                        } else {
                            System.out.println("wypłacasz " + x + " złotych");
                            System.out.println("Na twoim koncie pozostało: " + saldo.setStankonta(saldo.stankonta - x));
                            saldo.Menu();
                            continue;
                        }
                        //System.out.println("Na twoim koncie pozostało: " + saldo.setStankonta(saldo.stankonta - x));
                        //saldo.Menu();
                    }


                case 3:
                    System.out.println("Dziękuję. Odbierz kartę.");
                    break;
            }
        } else {
            System.out.println("Niewłaściwy PIN. Spróbój ponownie");
        }
    }

}

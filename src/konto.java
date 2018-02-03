public class konto extends bankomat {
    public int stankonta = 1050;

    public int getStankonta() {
        return stankonta;
    }

    public int setStankonta(int f) {
        this.stankonta = f;
        return stankonta;
    }
    public void Menu()
    {
        System.out.println("Wybierz co chcesz teraz zrobić: \n1-Sprawdź stan konta.\n2-Wypłać gotówkę\n3-Zakończ i zabierz kartę");
    }

}

package edu.kis.vh.nursery;

/**
 * Klasa reprezentujaca wyliczanke dzialajaca na zasadach wiezy Hanoi.
 * Wartosci dodawane do wyliczanki nie moga byc wieksze niz wartosc obecnie
 * znajdujaca sie na szczycie (zwracana przez metode peekaboo).
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * Licznik przechowujacy ilosc odrzuconych prob dodania elementu do wyliczanki.
     */
    private int totalRejected = 0;

    /**
     * Zwraca calkowita liczbe odrzuconych prob dodania elementu do wyliczanki.
     * * @return liczba odrzuconych elementow
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nowa wartosc do wyliczanki, o ile spelnia ona zasady wiezy Hanoi.
     * Jesli dodawana wartosc jest wieksza niz obecna na szczycie, zostaje odrzucona,
     * a licznik odrzuconych elementow (totalRejected) jest inkrementowany.
     * * @param in wartosc, ktora ma zostac dodana do wyliczanki
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
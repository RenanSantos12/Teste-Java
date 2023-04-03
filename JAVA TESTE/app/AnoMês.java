package app;

import java.time.YearMonth;
import java.time.LocalDate;
public class AnoMês {
    public static void main(String[] args) {

    //  obter o ano e o mês atuais

        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();

        // Criar um objeto YearMonth
        YearMonth anoMes = YearMonth.of(ano, mes);

        System.out.println("ano e mês atuais: " + anoMes);
    }
}

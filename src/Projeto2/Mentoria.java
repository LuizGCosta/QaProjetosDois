package Projeto2;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nMentoria" +
                "\nTitulo= " + getTitulo()  +
                "\nDescriçãoo= " + getDescricao() +
                "\nData= " + data;
    }
}
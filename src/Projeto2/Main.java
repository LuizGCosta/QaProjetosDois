package Projeto2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java\n");
        curso1.setDescricao("descrição curso java\n");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js\n");
        curso2.setDescricao("descrição curso js\n");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java\n");
        mentoria.setDescricao("descrição mentoria java\n");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila\n");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(" ".repeat(22) +  "Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println(" ");
        System.out.println(" ".repeat(22) +  "Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println(" ".repeat(22) +  "Conteúdos Inscritos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-".repeat(200));

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(" ".repeat(22) + "Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(" ".repeat(22) + "\nConteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println(" ".repeat(22) + "\nConteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}

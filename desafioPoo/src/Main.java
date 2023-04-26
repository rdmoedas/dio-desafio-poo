import me.dio.desafio.dominio.Bootcamp;
import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Dev;
import me.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso Intermediário de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso Básico de JavaScript");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria ao Vivo de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println("=============");
//        System.out.println(mentoria);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Botcamp Java Developer Banco Pan");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devRodolfo = new Dev();
        devRodolfo.setNome("Rodolfo Santana");
        devRodolfo.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos Rodolfo:" + devRodolfo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rodolfo:" + devRodolfo.getConteudosConcluidos());
        System.out.println("XP Rodolfo:" + devRodolfo.calcularXP());

        Dev devJoao = new Dev();
        devJoao.setNome("João da Silva");
        devJoao.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP João:" + devJoao.calcularXP());

        devRodolfo.progredir();
        System.out.println("Conteudos Inscritos Rodolfo:" + devRodolfo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rodolfo:" + devRodolfo.getConteudosConcluidos());
        System.out.println("XP Rodolfo:" + devRodolfo.calcularXP());

        devRodolfo.progredir();
        devRodolfo.progredir();
        System.out.println("Conteudos Inscritos Rodolfo:" + devRodolfo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rodolfo:" + devRodolfo.getConteudosConcluidos());
        System.out.println("XP Rodolfo:" + devRodolfo.calcularXP());

        devJoao.progredir();
        System.out.println("Conteudos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP João:" + devJoao.calcularXP());

    }

}
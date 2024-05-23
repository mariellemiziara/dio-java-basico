package DesafioAbstraindo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descricao curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());     
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devCamila.getConteudosInscritos());
       System.out.println("Conteudos Concluidos" + devCamila.getConteudosConcluidos());
       System.out.println("XP:" + devCamila.calcularTotalXp());

       System.out.println("=======");
       Dev devJoao = new Dev();
       devJoao.setNome("João");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
       devJoao.progredir();
       devCamila.progredir();
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
       System.out.println("Conteudos Concluidos" + devJoao.getConteudosConcluidos());
       System.out.println("XP:" + devJoao.calcularTotalXp());



    }
}

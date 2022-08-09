import br.com.dio.desafio.domino.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso de Java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de JAVA");
        mentoria.setDescricao("Descrição Mentoria em Java");
        mentoria.setData(LocalDate.now());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java SCRIPT");
        curso2.setDescricao("Descricao curso de Java SCRIPT");
        curso2.setCargaHoraria(18);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());


        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println(" --") ;
        System.out.println("Conteúdos Inscritos Rodrigo: " + devRodrigo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rodrigo: " + devRodrigo.getConteudosConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        System.out.println(" -------------------------------------- ") ;

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println(" --") ;
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}

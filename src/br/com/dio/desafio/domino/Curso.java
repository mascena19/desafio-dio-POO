package br.com.dio.desafio.domino;

public class Curso extends Conteudo {
     private int cargaHoraria;

     @Override
    public double calucarXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}

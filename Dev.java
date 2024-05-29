import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosConcluidos;
    private List<Mentoria> mentoriasParticipadas;

    
    public Dev(String nome) {
        this.nome = nome;
        this.cursosConcluidos = new ArrayList<>();
        this.mentoriasParticipadas = new ArrayList<>();
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(List<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }

    public List<Mentoria> getMentoriasParticipadas() {
        return mentoriasParticipadas;
    }

    public void setMentoriasParticipadas(List<Mentoria> mentoriasParticipadas) {
        this.mentoriasParticipadas = mentoriasParticipadas;
    }

    public void adicionarCursoConcluido(Curso curso) {
        this.cursosConcluidos.add(curso);
    }

    public void adicionarMentoriaParticipada(Mentoria mentoria) {
        this.mentoriasParticipadas.add(mentoria);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", cursosConcluidos=" + cursosConcluidos +
                ", mentoriasParticipadas=" + mentoriasParticipadas +
                '}';
    }
}
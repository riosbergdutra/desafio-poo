public class Mentoria {
    private String tema;
    private String horario;

    public Mentoria(String tema, String horario) {
        this.tema = tema;
        this.horario = horario;
    }

    // Métodos getters e setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tema='" + tema + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }
}
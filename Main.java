public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Fundamentals", 40);
        Curso curso2 = new Curso("Python Basics", 30);
        
        Mentoria mentoria1 = new Mentoria("Orientação a Objetos", "Segunda-feira, 14:00");
        Mentoria mentoria2 = new Mentoria("Testes de Software", "Quarta-feira, 10:00");
        
        Bootcamp bootcamp = new Bootcamp("Bootcamp de Programação");
        
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);
        bootcamp.adicionarMentoria(mentoria1);
        bootcamp.adicionarMentoria(mentoria2);
        
        Dev dev = new Dev("João");
        
        dev.adicionarCursoConcluido(curso1);
        dev.adicionarMentoriaParticipada(mentoria1);
        
        System.out.println("Informações do Bootcamp:");
        System.out.println(bootcamp);
        
        System.out.println("\nInformações do Dev:");
        System.out.println(dev);
    }
}

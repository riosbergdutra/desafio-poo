    public class Curso {
        private String nome;
        private int duracaoHoras;
    
        public Curso(String nome, int duracaoHoras) {
            this.nome = nome;
            this.duracaoHoras = duracaoHoras;
        }
    
        // Métodos getters e setters
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public int getDuracaoHoras() {
            return duracaoHoras;
        }
    
        public void setDuracaoHoras(int duracaoHoras) {
            this.duracaoHoras = duracaoHoras;
        }
    
        @Override
        public String toString() {
            return "Curso{" +
                    "nome='" + nome + '\'' +
                    ", duracaoHoras=" + duracaoHoras +
                    '}';
        }
    }

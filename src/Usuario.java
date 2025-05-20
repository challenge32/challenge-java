public class Usuario {
        private String nome;
        private String email;
        private String mensagem;

        public Usuario(String nome, String email, String mensagem) {
            this.nome = nome;
            this.email = email;
            this.mensagem = mensagem;
        }

        public String getNome() {
            return nome;
        }

        public String getEmail() {
            return email;
        }

        public String getMensagem() {
            return mensagem;
        }
}

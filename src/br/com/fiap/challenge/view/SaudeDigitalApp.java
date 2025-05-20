package br.com.fiap.challenge.view;

import br.com.fiap.challenge.model.Usuario;

import java.util.Scanner;

public class SaudeDigitalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU SAÚDE DIGITAL ===");
            System.out.println("1. Página Inicial");
            System.out.println("2. Ajuda");
            System.out.println("3. FAQ");
            System.out.println("4. Contato");
            System.out.println("5. Quem Somos");
            System.out.println("6. Solução");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> mostrarPaginaInicial(sc);
                case 2 -> menuAjuda(sc);
                case 3 -> mostrarFAQ();
                case 4 -> formularioContato(sc);
                case 5 -> mostrarIntegrantes();
                case 6 -> mostrarSolucao();
                case 0 -> System.out.println("Encerrando o programa.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        sc.close();
    }

    public static void mostrarPaginaInicial(Scanner sc) {
        System.out.println("\n--- Página Inicial ---");
        System.out.println("Bem-vindo ao site de Saúde Digital!");
        System.out.println("1. Acesse o vídeo tutorial de como acessar sua consulta");
        System.out.println("0. Voltar");
        int op = sc.nextInt();
        sc.nextLine();
        if (op == 1) mostrarVideoTutorial();
    }

    public static void mostrarVideoTutorial() {
        System.out.println("\n--- Vídeo Tutorial ---");
        System.out.println("1. Como entrar na consulta pelo celular");
        System.out.println("2. Como usar câmera e microfone");
        System.out.println("3. Como se preparar para a teleconsulta");
        System.out.println("\nApp para consulta:");
        System.out.println("📲 App Store: https://apps.apple.com/app/id123456789");
        System.out.println("🤖 Google Play: https://play.google.com/store/apps/details?id=app.consulta");
    }

    public static void menuAjuda(Scanner sc) {
        int op;
        do {
            System.out.println("\n--- Ajuda ---");
            System.out.println("1. Checklist de Preparação para a Consulta");
            System.out.println("2. Passo a Passo de Como Acessar a Consulta");
            System.out.println("3. Falar com Alguém Agora");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> mostrarChecklist();
                case 2 -> mostrarPassoAPasso();
                case 3 -> mostrarContatoRapido();
                case 0 -> {}
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 0);
    }

    public static void mostrarChecklist() {
        System.out.println("\n--- Checklist ---");
        System.out.println("- Estar em local silencioso");
        System.out.println("- Internet estável");
        System.out.println("- Dispositivo carregado");
        System.out.println("- Documentos e exames em mãos");
    }

    public static void mostrarPassoAPasso() {
        System.out.println("\n--- Passo a Passo ---");
        System.out.println("1. Acesse o link recebido");
        System.out.println("2. Clique em 'Entrar na consulta'");
        System.out.println("3. Permita o uso da câmera e microfone");
        System.out.println("4. Aguarde o profissional de saúde iniciar a sessão");
    }

    public static void mostrarContatoRapido() {
        System.out.println("\n--- Fale com Alguém ---");
        System.out.println("Telefone de suporte: 0800-000-0000");
        System.out.println("Chatbot (Telegram): @Challenge1737bot");
    }

    public static void mostrarFAQ() {
        System.out.println("\n--- Perguntas Frequentes ---");
        System.out.println("1. O que é uma teleconsulta?\nR: Consulta médica por vídeo chamada.");
        System.out.println("2. Preciso instalar algum app?\nR: Apenas clique no link enviado por SMS ou e-mail.");
        System.out.println("3. Como remarcar uma consulta?\nR: Entre em contato pelo telefone ou Telegram.");
    }

    public static void formularioContato(Scanner sc) {
        System.out.println("\n--- Formulário de Contato ---");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Mensagem: ");
        String mensagem = sc.nextLine();

        Usuario usuario = new Usuario(nome, email, mensagem);
        System.out.println("\nObrigado, " + usuario.getNome() + ". Sua mensagem foi enviada com sucesso.");
    }

    public static void mostrarIntegrantes() {
        System.out.println("\n--- Quem Somos ---");
        System.out.println("Júlia Menezes Farias - RM565568 - Turma: 1TDSPV");
        System.out.println("Pedro Henrique Costa - RM559932 - Turma: 1TDSPV");
    }

    public static void mostrarSolucao() {
        System.out.println("\n--- Sobre a Solução ---");
        System.out.println("Plataforma de ajuda para pacientes com dificuldades em tecnologia.");
        System.out.println("Inclui: tutoriais, checklist, passo a passo, contato direto e acesso a apps.");
    }
}


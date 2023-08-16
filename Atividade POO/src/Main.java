// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.nome = "Tyler";
        p1.telefone = 382537574;
        p1.email = "tyler.gw@gmail.com";

        Ong o1 = new Ong();
        o1.nome = "alimentafamilia";
        o1.telefone = 883782473;
        o1.email = "alimentafam.regiao@gmail.com";
        o1.localização = "Várzea";


        System.out.println("CLASSE PESSOA");
        System.out.println("Nome da Pessoa: " + p1.nome + "\nTelefone: " + p1.telefone + "\nemail: " + p1.email);

        System.out.println("\nCLASSE ONG");
        System.out.println("Nome da ong: " + o1.nome + "\nTelefone: " + o1.telefone + "\nemail: " + o1.email + "\nlocalização: " + o1.localização);
    }
}
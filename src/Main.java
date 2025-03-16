import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("-----NAVEGADOR DE INTERNET-----");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("https://www.dio.me");

        System.out.println("-----REPRODUTOR MÚSICAL-----");
        iphone.selecionarMusica("With a Little Help from My Friends");
        iphone.tocar();
        iphone.pausar();

        System.out.println("-----APARELHO TELEFÔNICO-----");
        iphone.ligar("999999999");
        iphone.iniciarCorreioVoz();
        iphone.atender();

    }
}
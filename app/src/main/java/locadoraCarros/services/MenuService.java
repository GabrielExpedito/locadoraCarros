package locadoraCarros.services;

public class MenuService {

    public void menuInicial() {
        System.out.println("-----Menu Iniciau-----");
        System.out.println("1- Cadastrar Carro");
        System.out.println("2 - Cadastrar Modelo");
        System.out.println("Selecione a opção desejada: ");

        String opcao = new leituraServices().Ler();

        switch (opcao) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("opcao inválida");
        }

    }

}

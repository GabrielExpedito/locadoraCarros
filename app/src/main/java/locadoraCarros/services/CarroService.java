package locadoraCarros.services;

import locadoraCarros.model.Carro;

public class CarroService {
    
    public void Cadastrar() {
        Carro carroCadastro = new Carro();
        
        Long idFabricante = new FabricanteService().selecionar();
        
        if (idFabricante == -1L) {
            return;
        }
        
        carroCadastro.setIdFabricante(idFabricante);
        
        Long idModelo = new ModeloService().selecionar(idFabricante);
        
        if (idModelo == -1L) {
            return;
        }
        
        carroCadastro.setIdModelo(idModelo);
        carroCadastro.setPlaca(getPlaca());
        carroCadastro.setCor(getCor());

        Boolean disponivel = getDisponivel();

        if (disponivel == null) {
            return;
        }

        carroCadastro.setDisponivel(disponivel);

        Integer ano = getAno();

        if (ano == -1) {
            return;
        }

        carroCadastro.setAno(ano);

        Double valorLocacao = getValorLocacao();

        if (valorLocacao == -1) {
            return;
        }

        carroCadastro.setValorLocacao(valorLocacao);

        System.out.println(carroCadastro.toString());
    }

    public String getPlaca() {
        System.out.println("Informe a placa:");
        String placa = new leituraServices().Ler();

        return placa;
    }

    public String getCor() {
        System.out.println("Informe a cor:");
        String cor = new leituraServices().Ler();

        return cor;
    }

    public Boolean getDisponivel() {
        System.out.println("O veiculo está disponivel? (s/n)?");

        String escolha = new leituraServices().Ler();

        if (!escolha.toUpperCase().equals("S")
                && !escolha.toUpperCase().equals("N")) {
            System.out.println("OPCAO INVALIDA");
            return null;
        }

        Boolean disponivel = false;

        if (escolha.toUpperCase().equals("S")) {
            disponivel = true;
        }

        return disponivel;
    }

    public Integer getAno() {
        System.out.println("Informe o Ano:");
        String ano = new leituraServices().Ler();

        Integer anoCarro = -1;

        try {
            anoCarro = Integer.parseInt(ano);

        } catch (Exception ex) {
            System.out.println("Ano Invalido");
            return -1;
        }

        return anoCarro;
    }

    public Double getValorLocacao() {
        System.out.println("Informe o valor da locacao:");
        String valor = new leituraServices().Ler();

        if (valor.contains(",")) {
            valor = valor.replace(",", ".");
        }

        Double valorLocacao = -1D;

        try {
            valorLocacao = Double.parseDouble(valor);

        } catch (Exception ex) {
            System.out.println("Valor Invalido");
            return -1D;
        }

        return valorLocacao;
    }
}
        
    

package locadoraCarros;

import java.util.List;
import locadoraCarros.classe.conexaoBanco;
import locadoraCarros.model.fabricante;
import locadoraCarros.repositorys.FabricanteRepository;
import locadoraCarros.services.MenuService;
import locadoraCarros.services.leituraServices;

public class App {

    public static void main(String[] args) {
        new conexaoBanco().conectar();
        
        new MenuService().menuInicial();
        new leituraServices().Ler();
        
        List<fabricante> fabricantes = new FabricanteRepository()
                                .consultar();
        
        for(fabricante fabricante : fabricantes) {
            System.out.println(fabricante.toString());
        }
        
    }
}

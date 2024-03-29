package locadoraCarros;

import com.sun.tools.javac.Main;
import java.util.List;
import locadoraCarros.classe.conexaoBanco;
import locadoraCarros.model.fabricante;
import locadoraCarros.repositorys.FabricanteRepository;
import locadoraCarros.services.MainService;
import locadoraCarros.services.MenuService;
import locadoraCarros.services.leituraServices;

public class App {

    public static void main(String[] args) {
        new conexaoBanco().conectar();
        
        new MainService().iniciaSistema();
        
        List<fabricante> fabricantes = new FabricanteRepository()
                                .consultar();
        
        for(fabricante fabricante : fabricantes) {
            System.out.println(fabricante.toString());
        }
        
    }
}

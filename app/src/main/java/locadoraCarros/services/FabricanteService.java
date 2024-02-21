package locadoraCarros.services;

import java.util.ArrayList;
import java.util.List;
import locadoraCarros.model.fabricante;
import locadoraCarros.repositorys.FabricanteRepository;

public class FabricanteService {

    public List<fabricante> consultar() {
            return new FabricanteRepository().consultar();
    }

    public Long selecionar() {
        List<fabricante> listaFabricante = consultar();
        
        System.out.println("Lista Fabricantes");
        System.out.println("---------------------");
        
        List<Long> idsFabricantes = new ArrayList<>();
        
        for (fabricante Fabricante : listaFabricante) {
            System.out.println(Fabricante.toString());
            idsFabricantes.add(Fabricante.getId());
            
            }
        
        System.out.println("------------------");
        System.out.println("Selecione o fabricante");
        
        Long idFabricante = 0L;
        
        try {
            idFabricante = Long.parseLong(new leituraServices().Ler());
            
        } catch (Exception ex) {
            System.out.println("Opcao invalida");
            return -1L;
        }
        
        if (!idsFabricantes.contains(idFabricante)) {
            System.out.println("OPCAO INVALIDA");
            return -1L;
        }
        return idFabricante;
    }
}

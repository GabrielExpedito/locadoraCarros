package locadoraCarros.services;

import java.util.ArrayList;
import java.util.List;
import locadoraCarros.model.modelo;
import locadoraCarros.repositorys.ModeloRepository;

public class ModeloService {
    public List<modelo> consultar(Long idFabricante) {
        return new ModeloRepository().consultar(idFabricante);        
    }

public Long selecionar(Long idFabricante){
    List<modelo> listaModelos = consultar(idFabricante);
    
    System.out.println("Lista de Modelos");
    System.out.println("---------------------------------");
    
    List<Long> idsModelos = new ArrayList<>();
    
    for (modelo Modelo : listaModelos){
        System.out.println(Modelo.toString());
        idsModelos.add(Modelo.getId());
        
    }
    
    System.out.println("---------------------------");
    System.out.println("Selecione o modelo desejado: ");
    
    Long idModelo = 0L;
    
    try {
        idModelo = Long.parseLong(new leituraServices().Ler());
    } catch (Exception ex) {
        System.out.println("Opcao invalida");
        return -1L;
    }
    
    if (!idsModelos.contains(idModelo)) {
        System.out.println("Opcao invalida");
        return -1L;
    }
    
    return idModelo;
    
}
}
         


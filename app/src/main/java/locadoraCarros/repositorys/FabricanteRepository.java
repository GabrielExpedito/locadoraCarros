package locadoraCarros.repositorys;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import locadoraCarros.model.fabricante;
import locadoraCarros.classe.conexaoBanco;

public class FabricanteRepository {
    
    public List<fabricante> consultar() {
        try {

            
        Statement statement = conexaoBanco.getConn().createStatement();
        String sql = "SELECT * from Fabricante";
        
        ResultSet result = statement.executeQuery(sql);
        
        List<fabricante> listaFabricante = new ArrayList<>();
        
       while (result.next()) { 
           listaFabricante.add(new fabricante (
                result.getLong("id"),
                result.getString("nome")));
       }
        return listaFabricante;
        
        } catch (Exception ex) {
            System.out.println("Algo de errado não está certo");
            
            return null;
        }
        
        
    }
        
}

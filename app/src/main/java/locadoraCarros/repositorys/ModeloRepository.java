package locadoraCarros.repositorys;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import locadoraCarros.classe.conexaoBanco;
import locadoraCarros.model.modelo;

public class ModeloRepository {

    public List<modelo> Consultar() {

        try {

            Statement statement = conexaoBanco.getConn().createStatement();
            String sql = "SELECT * from Modelo";

            ResultSet result = statement.executeQuery(sql);

            List<modelo> listaModelo = new ArrayList<>();

            while (result.next()) {
                listaModelo.add(new modelo(
                        result.getLong("id"),
                        result.getString("nome"),
                        result.getLong("idFabricante")));
            }
            
            return listaModelo;

        } catch (Exception ex) {
            System.out.println("Aldo de errado não está certo");
        }
        return null;
    }

    public List<modelo> consultar(Long idFabricante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

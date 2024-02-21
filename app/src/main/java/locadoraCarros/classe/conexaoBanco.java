package locadoraCarros.classe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {

    private static Connection conn;
    
    public void conectar() {
                conectar("localhost", "5432","postgres", "postgres", "12345");
                

    }

    private void conectar(String HOST, String PORTA, String BANCO, String USUARIO, String SENHA) {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://" + HOST + ":" + PORTA + "/" + BANCO, USUARIO, SENHA);
        } catch (SQLException ex) {
            throw new RuntimeException("Não foi possivel estabelecer uma conexao com o Banco de Dados!", ex);
        }
    }

    public static Connection getConn() {
        return conn;
    }
}
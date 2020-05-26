import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import mysql.

class Main {
  public static void main(String[] args) {
    try{
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://165.227.90.98:3306/bancodeteste", "alunos","etec");
      System.out.println("Conectado!");
    }catch(ClassNotFoundException e){
      System.out.println("Não foi possivel carregar o driver\n" + e.getMessage());
    }catch(SQLException e){
      System.out.println("Falha ao conectar no BD\n" + e.getMessage());
    }
  }
}
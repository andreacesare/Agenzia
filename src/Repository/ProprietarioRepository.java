package Repository;

import Config.DbConnection;
import Entity.Proprietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProprietarioRepository {
    private static Logger logger = Logger.getLogger(ProprietarioRepository.class.getName());

    public void createProprietario(Proprietario proprietario) {
        String sql = "insert into proprietari values(?,?,?)";
        try {
            Connection c= DbConnection.openConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,proprietario.getId());
            ps.setString(2,proprietario.getNome());
            ps.setString(3, proprietario.getCognome());
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Proprietario inserido com sucesso");
            }
        }catch(ClassNotFoundException | SQLException e) {
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }

    }

    public ArrayList<Proprietario> readProprietario() {
        ArrayList<Proprietario> proprietarios = new ArrayList<>();
        String sql = "select * from proprietari";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Proprietario proprietario = new Proprietario();
                proprietario.setId(rs.getString("id"));
                proprietario.setNome(rs.getString("nome"));
                proprietario.setCognome(rs.getString("cognome"));
                proprietarios.add(proprietario);
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
        return proprietarios;
    }

    public void deletePropretario(String id) {
        String sql="delete from proprietari where id=?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,id);
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Proprietario inserido com sucesso");
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }

    public void updateProprietario(Proprietario proprietario) {
        String sql = "update proprietari set nome=?,cognome=? where id=?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,proprietario.getNome());
            ps.setString(2,proprietario.getCognome());
            ps.setString(3,proprietario.getId());
            int i = ps.executeUpdate();
            if(i>0){
                System.out.println("Proprietario atualizado com sucesso");
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }
}

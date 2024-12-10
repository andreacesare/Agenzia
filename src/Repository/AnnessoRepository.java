package Repository;

import Config.DbConnection;
import Entity.Annesso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnnessoRepository {
    private static final Logger logger=Logger.getLogger(AnnessoRepository.class.getName());

    public void createAnnesso(Annesso annesso){
        String sql="insert into annessi values (?,?,?,?)";
        try{
            Connection c= DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1, annesso.getId());
            ps.setString(2, annesso.getTipo());
            ps.setString(3, annesso.getSuperficie());
            ps.setString(4,annesso.getImmobile().getId());
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Annesso inserido com sucesso");
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }

    public ArrayList<Annesso> readAnnesso(){
        ArrayList<Annesso> annessi=new ArrayList<>();
        String sql="select a.id,a.tipo,a.superficie,i.id as idi from annessi a full join immobili i on a.idi=i.id";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Annesso annesso=new Annesso();
                annesso.setId(rs.getString("id"));
                annesso.setTipo(rs.getString("tipo"));
                annesso.setSuperficie(rs.getString("superficie"));
                annesso.setIdi(rs.getString("idi"));
                annessi.add(annesso);

            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
        return annessi;
    }

    public void deleteAnnesso(String id){
        String sql="delete from annessi where id=?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1, id);
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Annesso deletado com sucesso");
            }


        }catch (ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }

    public void updateAnnesso(Annesso annesso){
        String sql="update annessi set tipo=?,superficie=?,idi=? where id=?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1, annesso.getTipo());
            ps.setString(2, annesso.getSuperficie());
            ps.setString(3, annesso.getIdi());
            ps.setString(4, annesso.getId());
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Annesso atualizado com sucesso");
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }
}

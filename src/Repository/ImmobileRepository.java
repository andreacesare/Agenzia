package Repository;

import Config.DbConnection;
import Entity.Immobile;
import Entity.Proprietario;

import java.sql.*;

import java.util.ArrayList;
import java.util.logging.*;

public class ImmobileRepository {
    private static final Logger logger=Logger.getLogger(ImmobileRepository.class.getName());

    public void createImmobile(Immobile immobile) {
        String sql="insert into immobili  values(?,?,?,?,?,?,?)";
        try{
            Connection c= DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,immobile.getId());
            ps.setString(2, immobile.getTipo());
            ps.setInt(3,immobile.getVani());
            ps.setInt(4,immobile.getCosto());
            ps.setInt(5,immobile.getSuperficie());
            ps.setInt(6,immobile.getAnno());
            ps.setString(7,immobile.getProprietario().getId());
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Immobile adicionado com sucesso");
            }



        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }

    public ArrayList<Immobile> readImmobile() {
        ArrayList<Immobile> immobili=new ArrayList<>();
        String sql="select i.id,p.id as pa,* from immobili i full join proprietari p on p.id = i.idp;";
        try{
            Connection c= DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Immobile immobile=new Immobile();
                immobile.setId(rs.getString("id"));
                immobile.setTipo(rs.getString("tipo"));
                immobile.setVani(rs.getInt("vani"));
                immobile.setCosto(rs.getInt("costo"));
                immobile.setSuperficie(rs.getInt("superficie"));
                immobile.setAnno(rs.getInt("anno"));
                Proprietario proprietario=new Proprietario();
                proprietario.setId(rs.getString("idp"));
                proprietario.setNome(rs.getString("nome"));
                proprietario.setCognome(rs.getString("cognome"));
                immobile.setProprietario(proprietario);
                immobili.add(immobile);
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
        return immobili;
    }

    public void deleteImmobile(String id) {
        String sql="delete from immobili where id = ?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,id);
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Immobile deletado com sucesso");
            }

        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }
    }

    public void updateImmobile(Immobile immobile) {
        String sql="update immobili set tipo=?,vani=?,costo=?,superficie=?,anno=? where id=?";
        try{
            Connection c=DbConnection.openConnection();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,immobile.getTipo());
            ps.setInt(2,immobile.getVani());
            ps.setInt(3,immobile.getCosto());
            ps.setInt(4,immobile.getSuperficie());
            ps.setInt(5,immobile.getAnno());
            ps.setString(6,immobile.getProprietario().getId());
            int result=ps.executeUpdate();
            if(result>0){
                System.out.println("Immobile atualizado com sucesso");
            }
        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.SEVERE,"Errore"+e.getMessage(),e);
        }

    }

}

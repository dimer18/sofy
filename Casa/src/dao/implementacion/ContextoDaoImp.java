/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao.implementacion;

import dao.ContextoDao;
import dominio.Contexto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Carolina
 */
public class ContextoDaoImp extends DataManager implements ContextoDao {
    private Statement stmt;
    private Connection con;

    public void guardar(Contexto contexto)
    {
        try 
        {
            con = super.getConection();
            stmt = con.createStatement();
            String sql = "INSERT INTO contextos (contexto, coordenada_xn, coordenada_xs, coordenada_yn,coordenada_ys)VALUES" +
                    "('"+ contexto.getContexto().trim()+ "',"+ contexto.getCoordenada_xn()+  ","+ contexto.getCoordenada_xs() + ","
                    + contexto.getCoordenada_yn() +  "," +contexto.getCoordenada_ys()+ ")";
            stmt.executeUpdate(sql);
            this.cerrar();                   
        }
        catch (SQLException e)
        {
            while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
    }
private void cerrar()
{
    try 
    {
       stmt.close();
       con.close();
    }
    catch(SQLException e)
            {
            while (e!= null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
}
    public void modificar(Contexto contexto) 
    {
         try {
                con = super.getConection();
                stmt = con.createStatement();
                String sql = " UPDATE contextos SET contexto = '" + contexto.getContexto().trim()+ "',"
             +" coordenada_xn = "+ contexto.getCoordenada_xn()+ ", " +" coordenada_xs = "+
                        contexto.getCoordenada_xs()+","+" coordenada_yn = "+ contexto.getCoordenada_yn()+","+" coordenada_ys = "+
                        +contexto.getCoordenada_ys()+" WHERE id = "+ contexto.getCodigo();
                stmt.executeUpdate(sql);
                this.cerrar();
            }
            catch(SQLException e)
            {
                while (e != null){
                   e.printStackTrace();
                   e.getNextException();
                }                  
             }
    }

    public void borrar(Contexto contexto) 
    {
         try 
        {
            con = super.getConection();
            stmt = con.createStatement();
            String sql = "DELETE FROM contextos WHERE id = " + contexto.getCodigo();
            stmt.executeUpdate(sql);
            this.cerrar();
        }
                
        catch (SQLException e)
        {
            while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
    }

    public Contexto get(int id)
    {
        Contexto contexto = new Contexto();
        ResultSet resul = null;
        try
        {
            con = super.getConection();
            stmt = con.createStatement();
            String sql = "SELECT id, contexto ,coordenada_xn , coordenada_xs, coordenada_yn," +
                    "coordenada_ys FROM contextos WHERE id= " + id;
            resul = stmt.executeQuery(sql);
        }
        catch(SQLException e)
        {          
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }   
        }
        try 
        {
            contexto.setCodigo(0);
            while (resul.next())
            {
                contexto.setCodigo(resul.getInt(1));
                contexto.setContexto(resul.getString(2));
                contexto.setCoordenada_xn(resul.getInt(3));
                contexto.setCoordenada_xs(resul.getInt(4));
                contexto.setCoordenada_yn(resul.getInt(5));
                contexto.setCoordenada_ys(resul.getInt(6));
            }
            this.cerrar();
            resul.close();
        }
         catch (SQLException e)
        {
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }            
        }     
        return contexto;
    }

    public Collection getAll()
    {
         ResultSet resul = null;
        try
        {
            con = super.getConection();
            stmt = con.createStatement();
            String sql = "SELECT id, contexto,coordenada_xn, coordenada_xs,coordenada_yn, coordenada_ys  FROM contextos";
            resul = stmt.executeQuery(sql);
        }
         catch( SQLException e)
        {
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
        Collection co = new ArrayList();
         try
        {
            while(resul.next())
            {
                Contexto contexto = new Contexto();
                contexto.setCodigo(resul.getInt(1));
                contexto.setContexto(resul.getString(2));
                contexto.setCoordenada_xn(resul.getInt(3));
                contexto.setCoordenada_xs(resul.getInt(4));
                contexto.setCoordenada_yn(resul.getInt(5));
                contexto.setCoordenada_ys(resul.getInt(6));
                co.add(contexto);
            }
            this.cerrar();
            resul.close();
        }
        catch (SQLException e)
        {
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
        return co;
    }

    public Contexto get(String nombre)
    {
        Contexto contexto = new Contexto();
        ResultSet resul = null;
        try
        {
            con = super.getConection();
            stmt = con.createStatement();
            String sql = "SELECT id, contexto ,coordenada_xn , coordenada_xs, coordenada_yn," +
                    "coordenada_ys FROM contextos WHERE contexto = '" + nombre.toUpperCase().trim()+"'";
            resul = stmt.executeQuery(sql);
        }
        catch(SQLException e)
        {
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
        try
        {
            contexto.setCodigo(0);
            while (resul.next())
            {
                contexto.setCodigo(resul.getInt(1));
                contexto.setContexto(resul.getString(2));
                contexto.setCoordenada_xn(resul.getInt(3));
                contexto.setCoordenada_xs(resul.getInt(4));
                contexto.setCoordenada_yn(resul.getInt(5));
                contexto.setCoordenada_ys(resul.getInt(6));
            }
            this.cerrar();
            resul.close();
        }
         catch (SQLException e)
        {
             while (e != null)
            {
                e.printStackTrace();
                e.getNextException();
            }
        }
        return contexto;
    }
}
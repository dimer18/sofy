/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.coordinador;

import dominio.Canal;
import dominio.Cancion;
import dominio.Comando;
import dominio.Objeto;
import java.util.Collection;
import java.util.Iterator;
import servicios.salida.Decodificador;
import shell.Kernel;

/**
 *
 * @author Administrator
 */
public class Coordinador 
{
    
    private Ejecutor ejecutor;
    private Decodificador decodificador;
    private Kernel kernel;

    public Coordinador() 
    {
    }

    public Coordinador(Ejecutor ejecutor, Decodificador decodificador, Kernel kernel) {
        this.ejecutor = ejecutor;
        this.decodificador = decodificador;
        this.kernel = kernel;
    }
    
    

    public Coordinador(Ejecutor ejecutor, Decodificador decodificador) 
    {
        this.ejecutor = ejecutor;
        this.decodificador = decodificador;
    }
    
    public boolean analisisEstado(Comando comando)
    {
        boolean bandera = true;
        int codigo = this.analizarEstadoObjeto(comando);
        if(codigo != 0)
        {
            this.decodificador.emitirMensaje("err", codigo);
            bandera = true;
        }
        else
        {
            this.decodificador.emitirMensaje("inf", 1);
            this.ejecutor.ejecutar(kernel, kernel.getComando());
            bandera = false;
        }
        return bandera;
    }
    
    private int analizarEstadoObjeto(Comando cmd)
    {
        int codigo = 0;
        if(cmd.getNombre().trim().toUpperCase().equals("ENCENDER"))
        {
            if(cmd.getObjeto().trim().toUpperCase().equals("ESTEREO"))
                if(this.kernel.getStereo().isEstado())
                    codigo = 5;
            if(cmd.getObjeto().trim().toUpperCase().equals("TV"))
                if(this.kernel.getTelevisor().isEstado())
                    codigo = 7;
            if(cmd.getObjeto().trim().toUpperCase().equals("LUZ"))
            {
                boolean bandera = false;
                Iterator it = this.kernel.getObjetos().iterator();
                while(it.hasNext())
                {
                    Objeto o = (Objeto)it.next();
                    if(o.getNombre().trim().toUpperCase().equals(cmd.getObjeto().trim().toUpperCase()))
                    {
                        bandera = true;
                        if(o.isEstado())
                            codigo = 11;
                    }
                }
                if(!bandera)
                    codigo = 3;
            }
                
        }
        if(cmd.getNombre().trim().toUpperCase().equals("APAGAR"))
        {
            if(cmd.getObjeto().trim().toUpperCase().equals("ESTEREO"))
                if(!this.kernel.getStereo().isEstado())
                    codigo = 6;
            if(cmd.getObjeto().trim().toUpperCase().equals("TV"))
                if(!this.kernel.getTelevisor().isEstado())
                    codigo = 8;
            if(cmd.getObjeto().trim().toUpperCase().equals("LUZ"))
            {
                boolean bandera = false;
                Iterator it = this.kernel.getObjetos().iterator();
                while(it.hasNext())
                {
                    Objeto o = (Objeto)it.next();
                    if(o.getNombre().trim().toUpperCase().equals(cmd.getObjeto().trim().toUpperCase()))
                    {
                        bandera = true;
                        if(!o.isEstado())
                            codigo = 12;
                    }
                }
                if(!bandera)
                    codigo = 3;
            }
        }
        //definiendo el comando "reproducir" para reproducir una cancion
        if(cmd.getNombre().trim().toUpperCase().equals("REPRODUCIR"))
        {
            //pregunto si el estereo esta encendido
                if(!this.kernel.getStereo().isEstado())
                    codigo = 6;
                else
                {
                    //si el estereo esta encendido me fijo si la cancion que el usuario desea reproducir
                    //esta disponible
                    boolean band = false;
                    Iterator it = this.kernel.getCanciones().iterator();
                    while(it.hasNext())
                    {
                        Cancion c = (Cancion)it.next();
                        if(c.getCodigo() == Integer.parseInt(cmd.getParmetro()))
                            band = true;
                        c = null;
                    }
                    it = null;
                    if(!band)
                        codigo = 10;
                }
        }
        
        //ahora agrego el comando para detener una reproduccion
        if(cmd.getNombre().trim().toUpperCase().equals("DETENER"))
        {
            //pregunto si el estereo esta encendido
                if(!this.kernel.getStereo().isEstado())
                    codigo = 6;
        }
        
        if(cmd.getNombre().trim().toUpperCase().equals("FIJAR"))
        {
            if(cmd.getObjeto().trim().toUpperCase().equals("CANAL"))
            {
                //me fijo si el televisor esta encendido
                if(!this.kernel.getTelevisor().isEstado())
                    codigo = 8;
                else
                {
                    //si el televisor esta encendido me fijo si el canal que el usuario quiere ver
                    //esta disponible.
                    boolean band = false;
                    Iterator it = this.kernel.getCanales().iterator();
                    while(it.hasNext())
                    {
                        Canal c = (Canal)it.next();
                        if(c.getFrecuencia() == Integer.parseInt(cmd.getParmetro()))
                            band = true;
                        c = null;
                    }
                    it = null;
                    if(!band)
                        codigo = 9;
                }
            }
            if(cmd.getObjeto().trim().toUpperCase().equals("CANCION"))
            {
                //pregunto si el estereo esta encendido
                if(!this.kernel.getStereo().isEstado())
                    codigo = 6;
                else
                {
                    //si el estereo esta encendido me fijo si la cancion que el usuario desea reproducir
                    //esta disponible
                    boolean band = false;
                    Iterator it = this.kernel.getCanciones().iterator();
                    while(it.hasNext())
                    {
                        Cancion c = (Cancion)it.next();
                        if(c.getCodigo() == Integer.parseInt(cmd.getParmetro()))
                            band = true;
                        c = null;
                    }
                    it = null;
                    if(!band)
                        codigo = 10;
                }
            }
        }
        return codigo;
    }
    
}

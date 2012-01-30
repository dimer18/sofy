/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package contexto;

import dominio.Contexto;
import dominio.Posicion;
import shell.Kernel;

/**
 *
 * @author Marcelo
 */
public class ContextoHabitacion extends Contexto implements Observer
{

    private Kernel kernel;
    private boolean activo = false;

    public ContextoHabitacion()
    {
    }

    public ContextoHabitacion(Kernel kernel)
    {
        this.kernel = kernel;
    }

    

    public void update(Posicion p)
    {
        if((p.getCoordenadaX() >= super.getCoordenada_xn()) && (p.getCoordenadaX() <= super.getCoordenada_xs()))
            if((p.getCoordenadaY() >= super.getCoordenada_yn()) && (p.getCoordenadaY() <= super.getCoordenada_ys()))
            {
                if(!this.activo)
                {
                    this.kernel.setCanales(this.kernel.getPerfil().getCanales());
                    this.activo = true;
                    this.kernel.armarListaObjetosHabitacion();
                }
                if((p.getCoordenadaX() >= 362))
                    this.kernel.entrarHabitacion();
            }
//                this.kernel.mostrarTelevisor(true);
            else
                this.activo = false;
        else
            this.activo = false;
    }

}

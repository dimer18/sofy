/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package generadores;

import cern.jet.random.Distributions;
import cern.jet.random.engine.RandomEngine;
import distribuciones.Triangular;

/**
 *
 * @author marcelo
 */
public class GeneradorTriangular implements Generador
{

//    private Distributions genTriangular;
    private Triangular triangular = new Triangular();
    private GeneradorCongruencial congruencial;
    private boolean banderaGenerador = true; //false = generador congruencial

    public GeneradorTriangular(Triangular triangular)
    {
        this.banderaGenerador = true;
        this.triangular = triangular;
    }


    public GeneradorTriangular(Triangular triangular, String congruencial)
    {
        this.banderaGenerador = false;
        this.triangular = triangular;
    }


    public double getNumero()
    {
        double numero = 0.0;
        if(this.banderaGenerador)
            numero = Distributions.nextTriangular(triangular.getMinimo(), triangular.getMaximo(), triangular.getMedio(), RandomEngine.makeDefault());
        else
            numero = this.congruencial.nextDouble();
        return numero;
    }

}

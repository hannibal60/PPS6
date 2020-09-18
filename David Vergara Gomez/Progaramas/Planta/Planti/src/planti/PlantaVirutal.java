/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planti;

/**
 *
 * @author David Vergara
 */
public class PlantaVirutal
{

    private String nombre;
    private int aguita;
    private int solesito;
    private float crecimiento;
    private int cantidadAbono;
    private int cantidadAccion;

    public PlantaVirutal(String nombre)
    {
        this.nombre = nombre;
        this.aguita = 50;
        this.solesito = 50;
        this.crecimiento = 0;
        this.cantidadAbono = 0;
        this.cantidadAccion = 0;
    }
    
    private String getEtapa()
    {
        if(this.crecimiento < 25) return "Germinacion";
        if(this.crecimiento < 50) return "Creciendo";
        if(this.crecimiento < 75) return "Floreciendo";
        return "Frutal";
    }

    public String getEstado()
    {
        String estado = "\n";
        if (!this.estaVivo())
        {
            estado += "\n---------------------";
            estado += "\nSe Murio Tu Planta";   
        }

        estado += "\n---------------------";
        estado += "\nNombre: " + getNombre();
        estado += "\nAgua: " + getAguita();
        estado += "\nSol: " + getSolesito();
        estado += "\nCremciento: " + getCrecimiento();
        estado += "\nDias: " + getDias();
        estado += "\nEtapa: " + getEtapa();
        estado += "\n---------------------";

        return estado;
    }

    private int getDias()
    {
        int dias = (this.cantidadAccion / 2);
        return dias;
    }

    public boolean estaVivo()
    {
        if (getAguita() > 100)
        {
            return false;
        }
        if (getAguita() < 20)
        {
            return false;
        }
        if (getSolesito() < 20)
        {
            return false;
        }
        if (getDias() == 30)
        {
            return false;
        }
        if (getCrecimiento() == 100)
        {
            return false;
        }
        return true;
    }

    public String regar(int por)
    {
        if (por == 1)
        {
            setAguita(getAguita() + 10);
            this.setCrecimiento((float) (this.getCrecimiento() + 0.11));
            this.cantidadAccion++;
        }
        if (por == 2)
        {
            setAguita(getAguita() + 25);
            this.setCrecimiento((float) (this.getCrecimiento() + 0.15));
            this.cantidadAccion++;
        }
        if (por == 3)
        {
            setAguita(getAguita() + 35);
            this.setCrecimiento((float) (this.getCrecimiento() + 0.20));
            this.cantidadAccion++;
        }
        return "*_* Aguita Rica :3";
    }

    public String tomandoSol(int sol)
    {
        if (sol == 1)
        {
            setAguita(getAguita() - 10);
            this.setCrecimiento((float) (this.getCrecimiento() + 2.0));
            this.cantidadAccion++;
        }
        if (sol == 2)
        {
            setAguita(getAguita() - 25);
            this.setCrecimiento((float) (this.getCrecimiento() + 3.0));
            this.cantidadAccion++;
        }
        if (sol == 3)
        {
            setAguita(getAguita() - 45);
            this.setCrecimiento((float) (this.getCrecimiento() + 4.0));
            this.cantidadAccion++;
        }
        return "U__U Uffff ";
    }

    private boolean FaltanRecursos()
    {
        if (getAguita() <= 30 || getSolesito() <= 30)
        {
            return true;
        }
        return false;
    }

    public String creciendo()
    {
        if (FaltanRecursos())
        {
            return "No me puedes abonar!!!!, necesito agua o sol!!";
        }
        this.cantidadAbono++;
        this.cantidadAccion++;
        this.setCrecimiento((float) (this.getCrecimiento() + 8.0));
        setAguita(getAguita() - 30);
        setSolesito(getSolesito() - 20);
        return "U__U Uffff ";
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the aguita
     */
    public int getAguita()
    {
        return aguita;
    }

    /**
     * @param aguita the aguita to set
     */
    public void setAguita(int aguita)
    {
        this.aguita = aguita;
    }

    /**
     * @return the solesito
     */
    public int getSolesito()
    {
        return solesito;
    }

    /**
     * @param solesito the solesito to set
     */
    public void setSolesito(int solesito)
    {
        this.solesito = solesito;
    }

    /**
     * @return the crecimiento
     */
    public float getCrecimiento()
    {
        return crecimiento;
    }

    /**
     * @param crecimiento the crecimiento to set
     */
    public void setCrecimiento(float crecimiento)
    {
        this.crecimiento = crecimiento;
    }

}

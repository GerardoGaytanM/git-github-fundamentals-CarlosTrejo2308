
public class Premio {
    public boolean seleccion = false;
    public boolean premio = false;
    public int numero;

    public Premio(boolean seleccion, boolean premio, int numero) {
        this.seleccion = seleccion;
        this.premio = premio;
        this.numero = numero;
    }

    public boolean isPremio() {
        return premio;
    }

    public void setPremio(boolean premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "cat [seleccion=" + seleccion + ", premio=" + premio + ", numero=" + numero + "]";
    }

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion) {
        this.seleccion = seleccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}

package grocery;

public class Cliente {
    int num;
    int Allegada;
    int Rllegada;
    int Aservicio;
    int Rservicio;
    int Sfila;
    int Rfinaliza;
    int Ssistema;
    int Sinactividad;
    
    /**
     * 
     * @param num: el número de cliente
     * @param Allegada: el tiempo entre llegada
     * @param Aservicio: el tiempo que tarda en el servicio 
     */
    public Cliente(int num, int Allegada, int Aservicio){
        this.num = num;
        this.Allegada = Allegada;
        this.Aservicio = Aservicio;
    }
    
    /**
     * calcula el tiempo de reloj de llegada de este cliente
     * @param llegadaAnt el tiempo de reloj de llegada del cliente anterior
     */
    public void Rllegada(int llegadaAnt){
        Rllegada = llegadaAnt+Allegada;
    }
    
    /**
     * calcula el tiempo de reloj en que esta en servicio el cliente
     * @param finalizaAnt el tiempo de reloj en que finalizó el servicio del cliente anterior
     */
    public void Rservicio(int finalizaAnt){
        Rservicio = Integer.max(Rllegada, finalizaAnt);
    }
    
    /**
     * calcula el tiempo que estuvo el cliente en la fila
     */
    public void Sfila(){
        Sfila = Rservicio-Rllegada;
    }
    
    /**
     * calcula el tiempo de reloj en que finalizó el servicio
     */
    public void Rfinaliza(){
        Rfinaliza = Rservicio+Aservicio;
    }
    
    /**
     * calcula el tiempo que el cliente estuvo dentro del sistema
     */
    public void Ssistema(){
        Ssistema = Rfinaliza-Rllegada;
    }
    
    /**
     * calcula el tiempo en que el servidor estuvo inactivo
     * @param finalizaAnt el tiempo de reloj en que finalizó el servicio del cliente anterior
     */
    public void Sinactividad(int finalizaAnt){
        Sinactividad = Rservicio-finalizaAnt;
    }
    
    @Override
    public String toString(){
        String res="\n"+num+
                "\t"+Allegada+
                "\t"+Rllegada+
                "\t"+Aservicio+
                "\t"+Rservicio+
                "\t"+Sfila+
                "\t"+Rfinaliza+
                "\t"+Ssistema+
                "\t"+Sinactividad;
        return res;
    }
}

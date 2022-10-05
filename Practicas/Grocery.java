package grocery;
import java.util.LinkedList;
import java.util.Random;
public class Grocery {
    static Random r = new Random();
    
    /**
     * 
     * @return un número entero entre 1 a 8, distribución discreta
     */
    public static int tllegada(){
        return r.nextInt(8)+1;
    }
    
    /**
     * 
     * @return un número entero entre 1 a 6, con probabilidades cargadas
     */
    public static int tservicio(){
        int[][] probserv = {{1, 10},{2, 20},{3, 30},{4,25},{5,10},{6,05}};
        int x = r.nextInt(100)+1;
        int sum=0;
        for (int i = 0; i < 6; i++) {
            sum+=probserv[i][1];
            if(x<=sum){
                return probserv[i][0];
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        r.setSeed(17503551);
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        clientes.add(new Cliente(1, tllegada(), tservicio()));
        clientes.get(0).Rllegada(0);
        clientes.get(0).Rservicio(0);
        clientes.get(0).Sfila();
        clientes.get(0).Rfinaliza();
        clientes.get(0).Ssistema();
        clientes.get(0).Sinactividad(0);
        for (int i = 1; i < 100; i++) {
            clientes.add(new Cliente((i+1), tllegada(), tservicio()));
            clientes.get(i).Rllegada(clientes.get(i-1).Rllegada);
            clientes.get(i).Rservicio(clientes.get(i-1).Rfinaliza);
            clientes.get(i).Sfila();
            clientes.get(i).Rfinaliza();
            clientes.get(i).Ssistema();
            clientes.get(i).Sinactividad(clientes.get(i-1).Rfinaliza);
        }
        System.out.println(clientes);
    }
    
}

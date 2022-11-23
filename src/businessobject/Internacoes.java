package businessobject;

import modelo.Cachorro;
import java.util.Objects;

public class Internacoes {
    private Cachorro[] cachorrosInternados = new Cachorro[3];


    public void internar(Cachorro cachorro){
        if (Objects.nonNull(cachorrosInternados[cachorrosInternados.length-1])){
            System.out.println("\nNão há mais vagas para internação." +
                    " As " + cachorrosInternados.length + " vagas estão ocupadas.");
        } else {

            for (int i = 0; i < cachorrosInternados.length; i++) {
                if (Objects.isNull(cachorrosInternados[i])) {
                    cachorrosInternados[i] = cachorro;
                    break;
                }
            }
        }
    }

    public void mostrarCachorrosInternados(){
        System.out.println("_____________ CACHORROS INTERNADOS _____________");
        for (Cachorro cachorro: cachorrosInternados) {
            if (Objects.nonNull(cachorro)) {
                System.out.println(cachorro);
            }
        }
    }
}

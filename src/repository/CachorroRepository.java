package repository;

import modelo.Cachorro;
import java.util.Objects;

public class CachorroRepository {
    private static Cachorro[] cachorrosCadastrados = new Cachorro[2];
    private static int count = 0;
    private static int sequence = 1;

    private void setId (Cachorro cachorro) {
        cachorro.setIdDog(sequence);
        cachorro.getDono().setIdDono(sequence);
        cachorro.getDono().getEndereco().setIdEnd(sequence);
        sequence ++;
    }

    private void redimensionarArray() {
        boolean temPosicaoLivre = false;

        for (int i = 0; i < cachorrosCadastrados.length; i++) {
            if (Objects.isNull(cachorrosCadastrados[i])){
                temPosicaoLivre = true;
            }
        }

        if (! temPosicaoLivre){
            Cachorro[] cachorrosCadastrados2 = new Cachorro[cachorrosCadastrados.length + 1];
            for (int i = 0; i < cachorrosCadastrados.length; i++) {
                cachorrosCadastrados2[i] = cachorrosCadastrados[i];
            }
            cachorrosCadastrados = cachorrosCadastrados2;
        }
    }

    public void cadastrar (Cachorro cachorro){
        setId(cachorro);
        redimensionarArray();

        if (Objects.nonNull(cachorro)) {
            cachorrosCadastrados[count] = cachorro;
            count++;
        } else {
            System.err.println("Cachorro sem Nome não pode ser cadastrado.");
        }
    }

    public void printCachorrosCadastrados(){
        System.out.println("_____________ CACHORROS CADASTRADOS _____________");
        boolean existeCaoCadastrado = false;

        for (Cachorro cachorro: cachorrosCadastrados) {
            if (Objects.nonNull(cachorro)){
                existeCaoCadastrado = true;
                System.out.println(cachorro);
            }
        }

        if (!existeCaoCadastrado){
            System.out.println("_____________ NÃO HÁ CACHORROS CADASTRADOS _____________");
        }
    }

    public void limparCadastro(){
        System.out.println("_____________ LIMPAR A LISTA DE CACHORROS CADASTRADOS _____________");
        this.cachorrosCadastrados = new Cachorro[2];
        this.count = 0;
    }

}

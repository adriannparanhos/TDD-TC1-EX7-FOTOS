package tc1.TDD.exercicio7;
import java.util.Scanner;

public class AlbumPhotos {


     public boolean podeColarFotos(int larguraPagina, int alturaPagina, int larguraFoto, int alturaFoto) {



         if (larguraPagina <= 0 || alturaPagina <= 0 || larguraFoto <= 0 || alturaFoto <= 0) {
             return false;
         }

        //Ambas normalm
        if ((larguraFoto * 2 <= larguraPagina && alturaFoto <= alturaPagina) ||
                (larguraFoto <= larguraPagina && alturaFoto * 2 <= alturaPagina)) {
            return true;
        }

        //Uma girada
        if ((larguraFoto + alturaFoto <= larguraPagina && Math.max(alturaFoto, larguraFoto) <= alturaPagina) ||
                (larguraFoto <= larguraPagina && alturaFoto + larguraFoto <= alturaPagina)) {
            return true;
        }

        //Ambas giradas
        if ((alturaFoto * 2 <= larguraPagina && larguraFoto <= alturaPagina) ||
                (alturaFoto <= larguraPagina && larguraFoto * 2 <= alturaPagina)) {
            return true;
        }

        //Girar uma e deixar a outra normal
        if ((larguraFoto <= larguraPagina && alturaFoto * 2 <= alturaPagina) ||
                (alturaFoto <= larguraPagina && larguraFoto * 2 <= alturaPagina)) {
            return true;
        }

        return false;
    }
}
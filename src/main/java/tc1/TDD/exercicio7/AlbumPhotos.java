package tc1.TDD.exercicio7;
import java.util.Scanner;

public class AlbumPhotos {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int larguraPagina = scanner.nextInt();
        int alturaPagina = scanner.nextInt();
        int larguraFoto = scanner.nextInt();
        int alturaFoto = scanner.nextInt();

        if (podeColarFotos(larguraPagina, alturaPagina, larguraFoto, alturaFoto)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        scanner.close();
    }

     public boolean podeColarFotos(int larguraPagina, int alturaPagina, int larguraFoto, int alturaFoto) {
        //Ambas normal
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
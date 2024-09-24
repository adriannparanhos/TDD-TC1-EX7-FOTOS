package tc1.TDD.exercicio7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TddExercicio7ApplicationTests {

	@Test
	@DisplayName("Should verify if two photos fit inside the album page for various dimensions")
	public void testFotosCabem() {
		AlbumPhotos albumPhotos = new AlbumPhotos();
		assertTrue(albumPhotos.podeColarFotos(7, 5, 3, 4));
		assertTrue(albumPhotos.podeColarFotos(12, 13, 6, 6));
		assertTrue(albumPhotos.podeColarFotos(10, 10, 5, 4));
		assertTrue(albumPhotos.podeColarFotos(6, 8, 3, 4));
	}

	@Test
	@DisplayName("Should verify if photos do not fit inside the album page for various dimensions")
	public void testFotosNaoCabem() {
		AlbumPhotos albumPhotos = new AlbumPhotos();
		assertFalse(albumPhotos.podeColarFotos(7, 5, 5, 5));
		assertFalse(albumPhotos.podeColarFotos(10, 10, 6, 7));
		assertFalse(albumPhotos.podeColarFotos(5, 5, 3, 4));
		assertFalse(albumPhotos.podeColarFotos(5, 5, 5, 5));
	}

	@Test
	@DisplayName("Should verify edge cases for minimum and maximum dimensions")
	public void testEdgeCases() {
		AlbumPhotos albumPhotos = new AlbumPhotos();
		assertFalse(albumPhotos.podeColarFotos(0, 0, 0, 0));
		assertTrue(albumPhotos.podeColarFotos(1000, 1000, 500, 500));
		assertFalse(albumPhotos.podeColarFotos(10, 10, 9, 10));
		assertTrue(albumPhotos.podeColarFotos(20, 15, 10, 7));
	}

}

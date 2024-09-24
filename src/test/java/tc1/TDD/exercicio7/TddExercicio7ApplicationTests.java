package tc1.TDD.exercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class TddExercicio7ApplicationTests {

	@Test
	public void testFotosCabem() {
		AlbumPhotos albumPhotos = new AlbumPhotos();
		assertTrue(albumPhotos.podeColarFotos(7, 5, 3, 4));
		assertTrue(albumPhotos.podeColarFotos(12, 13, 6, 6));
		assertTrue(albumPhotos.podeColarFotos(10, 10, 5, 4));
		assertTrue(albumPhotos.podeColarFotos(6, 8, 3, 4));
	}


}

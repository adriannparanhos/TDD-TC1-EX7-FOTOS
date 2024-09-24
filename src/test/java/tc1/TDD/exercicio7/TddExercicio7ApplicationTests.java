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

		boolean result1 = albumPhotos.podeColarFotos(7, 5, 3, 4);
		System.out.println(result1 ? "S" : "N");
		assertTrue(result1);

		boolean result2 = albumPhotos.podeColarFotos(12, 13, 6, 6);
		System.out.println(result2 ? "S" : "N");
		assertTrue(result2);

		boolean result3 = albumPhotos.podeColarFotos(10, 10, 5, 4);
		System.out.println(result3 ? "S" : "N");
		assertTrue(result3);

		boolean result4 = albumPhotos.podeColarFotos(6, 8, 3, 4);
		System.out.println(result4 ? "S" : "N");
		assertTrue(result4);
	}

	@Test
	@DisplayName("Should verify if photos do not fit inside the album page for various dimensions")
	public void testFotosNaoCabem() {
		AlbumPhotos albumPhotos = new AlbumPhotos();

		boolean result1 = albumPhotos.podeColarFotos(7, 5, 5, 5);
		System.out.println(result1 ? "S" : "N");
		assertFalse(result1);

		boolean result2 = albumPhotos.podeColarFotos(10, 10, 6, 7);
		System.out.println(result2 ? "S" : "N");
		assertFalse(result2);

		boolean result3 = albumPhotos.podeColarFotos(5, 5, 3, 4);
		System.out.println(result3 ? "S" : "N");
		assertFalse(result3);

		boolean result4 = albumPhotos.podeColarFotos(5, 5, 5, 5);
		System.out.println(result4 ? "S" : "N");
		assertFalse(result4);
	}

	@Test
	@DisplayName("Should verify edge cases for minimum and maximum dimensions")
	public void testEdgeCases() {
		AlbumPhotos albumPhotos = new AlbumPhotos();

		boolean result1 = albumPhotos.podeColarFotos(0, 0, 0, 0);
		System.out.println(result1 ? "S" : "N");
		assertFalse(result1);

		boolean result2 = albumPhotos.podeColarFotos(1000, 1000, 500, 500);
		System.out.println(result2 ? "S" : "N");
		assertTrue(result2);

		boolean result3 = albumPhotos.podeColarFotos(10, 10, 9, 10);
		System.out.println(result3 ? "S" : "N");
		assertFalse(result3);

		boolean result4 = albumPhotos.podeColarFotos(20, 15, 10, 7);
		System.out.println(result4 ? "S" : "N");
		assertTrue(result4);
	}

	@Test
	@DisplayName("Should verify if photos fit when rotated")
	public void testFotosCabemRotacionadas() {
		AlbumPhotos albumPhotos = new AlbumPhotos();

		boolean result1 = albumPhotos.podeColarFotos(10, 7, 7, 3);
		System.out.println(result1 ? "S" : "N");
		assertTrue(result1);

		boolean result2 = albumPhotos.podeColarFotos(12, 9, 6, 6);
		System.out.println(result2 ? "S" : "N");
		assertTrue(result2);

	}

	@Test
	@DisplayName("Should return false for non-positive dimensions")
	public void testeDimensoesComZero() {
		AlbumPhotos albumPhotos = new AlbumPhotos();

		boolean result1 = albumPhotos.podeColarFotos(0, 5, 3, 4);
		System.out.println(result1 ? "S" : "N");
		assertFalse(result1);

		boolean result2 = albumPhotos.podeColarFotos(5, 0, 3, 4);
		System.out.println(result2 ? "S" : "N");
		assertFalse(result2);

		boolean result3 = albumPhotos.podeColarFotos(5, 5, 0, 4);
		System.out.println(result3 ? "S" : "N");
		assertFalse(result3);

		boolean result4 = albumPhotos.podeColarFotos(5, 5, 3, 0);
		System.out.println(result4 ? "S" : "N");
		assertFalse(result4);

		boolean result5 = albumPhotos.podeColarFotos(5, 5, 3, -1);
		System.out.println(result5 ? "S" : "N");
		assertFalse(result5);
	}


}

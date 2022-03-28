package informatika;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MassaJenisTest {

	@Test
	@DisplayName("Menghitung Massa Jenis")
	public void testCalculate0() {
		MassaJenis massajenis = new MassaJenis();
		VolumeCubic volumecubic = new VolumeCubic();
		assertEquals(5, massajenis.hitung(40,volumecubic.hitungVol(2, 2, 2)));
	}
	
	@Test
	@DisplayName("Menghitung Volume")
	public void testCalculate1() {
		VolumeCubic volumecubic = new VolumeCubic();
		assertEquals(1000, volumecubic.hitungVol(10, 10, 10));
	}
	
	@Test
	@DisplayName("Menghitung Sisi Berbeda")
	public void testCalculate2() {
		VolumeCubic volumecubic = new VolumeCubic();
		assertEquals(0, volumecubic.hitungVol(1, 2, 3));
	}

}

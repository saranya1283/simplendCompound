import static org.junit.Assert.*;
import org.junit.Test;
public class SimpleNdCompoundTest {
	@Test
	public void testSimpleInt() {
		SimpleNdCompound sc = new SimpleNdCompound();
		assertEquals(50.4,sc.simpleInt(42,8,15),50.4-sc.simpleInt(42,8,15));
		assertEquals(250.5,sc.simpleInt(501,10,5),250.5-sc.simpleInt(501,10,5));
	}
	@Test
	public void testCompoundInt() {
		SimpleNdCompound sc = new SimpleNdCompound();
		assertEquals(1333.099243,sc.compoundInt(1200,2,5.4),1333.099243-sc.compoundInt(1200, 2, 5.4));
		assertEquals(16288.999,sc.compoundInt(10000, 5, 10.25),16288.999-sc.compoundInt(10000, 5, 10.25));
	}
}

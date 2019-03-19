/**
 * 
 * @author saranaya
 *
 */
public class SimpleNdCompound {
	/**
	 * 
	 * @param p
	 * @param t
	 * @param r
	 * @return double simple interest
	 */
	public double simpleInt(double p,double t,double r){
		double s = (p*t*r)/100;
		return s;
	}
	/**
	 * 
	 * @param p
	 * @param t
	 * @param r
	 * @return double compound interest
	 */
	public double compoundInt(double p,double t,double r){
		double c = 0;
		c = p*Math.pow((1 + (r / 100)), t);
		return c;
	}
}

public class TestComplexe {
	public static void main(String[] arg) {

		Complexe z1 = new Complexe(-1,-2,true);
		Complexe z2 = new Complexe(6,4, false);
		Complexe z3 = new Complexe(5,2, true);
                
        double x = z1.getRe();
        System.out.println(z1.sommeV2(z2));
        System.out.println((z1.sommeV2(z2)).equal(z3));
        System.out.println(z2);
        
	}
}

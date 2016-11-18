package kwadratowe;

public class kwadratowe {
	public static void main(String[] args) {
double a = 3;
double b = 2;
double c = -1;
double delta = (b * b) - (4 * a * c);
System.out.println ("delta =" + delta);
double pierwiastek = Math.sqrt(delta);
double x1 = (- b - pierwiastek) / (2 * a);
System.out.println ("x1 = " + x1);
double x2 = (- b + pierwiastek) / (2 * a);
System.out.println ("x2 = " + x2);
	}
}

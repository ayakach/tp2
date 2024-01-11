public class Point {
    private double abscisse;
    private double ordonnee;


    public Point() {
    }


    public Point(double abscisse, double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }


    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }


    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }


    public double norme() {
        return Math.sqrt(Math.pow(abscisse, 2) + Math.pow(ordonnee, 2));
    }

    public static void main(String[] args) {

        Point point1 = new Point();
        System.out.println("Point1 - Abscisse : " + point1.getAbscisse() + ", Ordonnee : " + point1.getOrdonnee());
        point1.setAbscisse(3.0);
        point1.setOrdonnee(4.0);
        System.out.println("Point1 après modification - Abscisse : " + point1.getAbscisse() + ", Ordonnee : " + point1.getOrdonnee());
        System.out.println("Norme de Point1 : " + point1.norme());
        Point point2 = new Point(1.0, 2.0);
        System.out.println("\nPoint2 - Abscisse : " + point2.getAbscisse() + ", Ordonnee : " + point2.getOrdonnee());
    }
}


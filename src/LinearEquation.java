public class LinearEquation {
    private int y1;
    private int y2;
    private int x1;
    private int x2;

    public LinearEquation(int y1, int y2, int x1, int x2){
        this.y1 = y1;
        this.y2 = y2;
        this.x1 = x1;
        this.x2 = x2;
    }
    public double Roundtohundred(double Rounded){
        return Math.round(Rounded * 100.0) / 100.0;
    }
    public double slope(){
        double y = y2 - y1;
        double x = x2 - x1;
        double Slope = y / x;
        return Roundtohundred(Slope);
    }
    public double Yintercept(){

        return y1 - (slope() * x1);
    }

}
    public double distance(){
        double x = Math.pow(Math.abs(x2-x1),2);
        double y = Math.pow(Math.abs(y2-y1),2);
        double distance1 = Math.sqrt(y + x);
        return Roundtohundred(distance1);
    }
    public String Equation() {
        int x = Math.abs(x2 - x1);
        int y = Math.abs(y2 - y1);
        String Fraction = y + "/" + x + "x";
        String b;
        String m;

        if (slope() == 1){
            m = "x";
        } else if (slope() == -1) {
            m = "-x";
        } else if (y % x != 0 & slope() > 0) {
            m = "-" + Fraction;
        } else if (y % x == 0 & slope() < 0) {
            m = "" + (int) slope() + "x";
        } else if (y % x == 0 & slope() > 0) {
            m = "" + (int) slope() + "x";
        } else {
            m = "";
        }

        if (Yintercept() < 0) {
            b = " - " + Math.abs(Yintercept());
        } else if (Yintercept() > 0) {
            b = " + " + Yintercept();
        } else {
            b = "";
        }

        if (slope() == 0) {
            b = "" + (int) Yintercept();
            return "y = " + b;
        } else {
            return "y = " + m + b;
        }
    }
    public String info() {
        return "The two points are: (" + x1 + ", " + y1 + ") and " + "(" + x2 + ", " + y2 + ")" + "\n" + "The new equation of the line between these points is: " + Equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of the line is: " + Yintercept() + "\n" + "The distance between the two points is: " + distance();
    }

    public String Xcoord(double x) {
        double y = (slope() * x) + Yintercept();
        return "The point on the line is: " + "(" + x + ", " + Roundtohundred(y) + ")";
    }
}
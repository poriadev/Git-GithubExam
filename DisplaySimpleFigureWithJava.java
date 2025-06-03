public class DisplaySimpleFigureWithJava {
    public static void main(String[] args) { 
        stars();
        System.out.println();
        stars();
        ninety();
        stars();  
        System.out.println();
        stars();
        fourStar();
        ninety();
        ninety();
        fourStar();
        fourStar();  
    }

    public static void ninety() {
        System.out.println("* | | | | | *");
    }

    public static void stars() {
        System.out.println("    *****    ");
        System.out.println("  *********  ");
        System.out.println("*************");
    }

    public static void fourStar() {
        System.out.println("    *****    ");
    }
}
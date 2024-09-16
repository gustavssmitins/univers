import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int summa = 0;
    double skaitli;

    System.out.print("Ievadi skaitli: ");

    for (int i = 0; i < 10; i++) {

    System.out.print("Ievadi skaitli: ");
    skaitli = sc.nextDouble();
    sc.close();
    
    if (skaitli > 0)
    summa += skaitli;
    }
    
    System.out.println("Summa pozitivākiem skaitliem: " + summa);
    

  }
}

    package test;

    import entities.Product;
    import java.util.Locale;
    import java.util.Scanner;


    public class Test {


        public static void main(String[] args) {

            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            sc.nextLine();

            Product[] vect = new Product[n];

            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                double price = sc.nextDouble();

                
                sc.nextLine();

                vect[i] = new Product(name, price);
            }

            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                sum+= vect[i].getPrice();
            }

            double avg = sum / n;

             System.out.printf("AVERAGE: %.2f%n" , avg);


            sc.close();


        }

    }

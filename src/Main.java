public class Main {
    public static void main(String[] args) {
        int n = 77;
        if ((n > 25) && (n < 100)) {
            System.out.println("Число" + n + " міститься в проміжку(25;100)");
        } else {
            System.out.println("Число" + n + " не міститься в проміжку(25;100)");
        }


        //Number2


        int h = 575;
        int m = h / 100;
        int k = ((h / 10) % 10);
        int d = ((h / 100) % 10);
        if (m >= k && m >= d) {
            System.out.println(m);
        } else if (k > m && k > d) {
            System.out.println(k);
        } else if (d > m && d > k) {
            System.out.println(d);
        }


        //Number 3
        String direction = "До низу";
        int a = 9;
        if (direction.equals("Догори")) {
            if (a == 2 || a == 3) System.out.println("Ви піднялись на 3 поверх");
            else if (a <= 9 && a > 0) System.out.println("Ви піднялись на %d поверх" +a);
            else System.out.println("Ви вказали неіснуючий поверх!");
        }
        if (direction.equals("До низу")) {
            if (a == 2 || a == 1) System.out.println("Ви спустились на 1 поверх");
            //else if (a <= 9 && a > 0) System.out.printf("Ви спустились на %d поверх", a);
            else System.out.println("Ви вказали неіснуючий поверх!");
        }
        System.out.println();
        //Number 4
        String option = "-";
        switch (option) {
            case "Так":
            case "ОК":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюcь!");
                break;
            default:
                System.out.println("Невірне значення");
        }
    }
}








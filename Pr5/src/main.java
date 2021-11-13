
class Main {

    public static int sumD(int n) {
        if (n > 9)
            return (n % 10 + sumD(n / 10));
        else
            return n;
    }

    public static int twoO(int O, int one) {
        if (O > one + 1) {
            return 0;
        }
        if (O == 0 || one == 0) {
            return 1;
        }
        return twoO(O, one - 1) + twoO(O - 1, one - 1);
    }

    public static void chislposl(int n) {
        if (n == 1)
            System.out.println(1);
        else {
            chislposl(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        System.out.println("Последовательность от 1 до 5:");
        chislposl(5);
        System.out.println("Сумма цифр числа: ");
        System.out.println(sumD(345));
        System.out.println("Количество последовательностей, в которых два нуля не стоят рядом:");
        System.out.println(twoO(1, 3 ));

    }
}
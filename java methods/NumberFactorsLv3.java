public class NumberFactorsLv3 {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    public static int sumFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static long productCubeFactors(int number) {
        int[] factors = findFactors(number);
        long product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println("Number: " + number);
        int[] factors = findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));
        System.out.println("Greatest Factor: " + greatestFactor(number));
        System.out.println("Sum of Factors: " + sumFactors(number));
        System.out.println("Product of Factors: " + productFactors(number));
        System.out.println("Product of Cubes of Factors: " + productCubeFactors(number));
    }
}


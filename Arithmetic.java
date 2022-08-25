public class Arithmetic {
    public int firstNmb;
    public int secondNmb;

    public Arithmetic(int firstNmb, int secondNmb) {
        this.firstNmb = firstNmb;
        this.secondNmb = secondNmb;
    }

    public int sum() {
        int sum = firstNmb + secondNmb;
        return sum;
    }

    public int product() {
        int product = firstNmb * secondNmb;
        return product;
    }

    public int maxNmb() {
        if(firstNmb > secondNmb) {
            return firstNmb;
        }
        return secondNmb;
    }

    public int minNmb() {
        if(firstNmb < secondNmb) {
            return firstNmb;
        }
        return secondNmb;
    }
}

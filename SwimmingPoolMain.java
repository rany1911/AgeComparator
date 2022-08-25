public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; // 30 litres per minute
        int devastationSpeed = 10; // 10 litres per minute
        int currentVolume = 0;
        int iterationCount = 0;
        while (currentVolume <= volume) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            iterationCount = iterationCount + 1;
        }
        System.out.println(iterationCount);
    }
}

public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
            if (katyaAge >= mishaAge) {
                middle = katyaAge;
                min = mishaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            } else {
                middle = mishaAge;
                min = katyaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            }
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
            if (vasyaAge >= mishaAge) {
                middle = vasyaAge;
                min = mishaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            } else {
                middle = mishaAge;
                min = vasyaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            }
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
            if (vasyaAge >= katyaAge) {
                middle = vasyaAge;
                min = katyaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            } else {
                middle = katyaAge;
                min = vasyaAge;
                System.out.println("Minimal age: " + min);
                System.out.println("Middle age: " + middle);
                System.out.println("Maximal age: " + max);
            }
        }
    }
}

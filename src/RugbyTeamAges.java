import java.util.Random;

public class RugbyTeamAges {

    public static void main(String[] args) {
        int teamSize = 25;
        int minAge = 18;
        int maxAge = 40;
        Random random = new Random();
        int[] teamAges1 = new int[teamSize];
        int[] teamAges2 = new int[teamSize];

        // Генеруємо вік для гравців першої команди
        for (int i = 0; i < teamSize; i++) {
            teamAges1[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }
        // Генеруємо вік для гравців другої команди
        for (int i = 0; i < teamSize; i++) {
            teamAges2[i] = random.nextInt(maxAge - minAge + 1) + minAge;
        }
        // Розраховуємо середній вік
        int sumAgeTeam1 = 0, sumAgeTeam2 = 0;

        for (int age : teamAges1) {
            sumAgeTeam1 += age;
        }
        for (int age : teamAges2) {
            sumAgeTeam2 += age;
        }
        double averageAge1 = (double) sumAgeTeam1 / teamAges1.length;
        double averageAge2 = (double) sumAgeTeam2 / teamAges2.length;

        // Виводимо вік гравців першої команди
        System.out.print("Вік гравців першої команди: ");
        for (int age : teamAges1) {
            System.out.print(age + " ");
        }
        System.out.println("Середній вік гравців першої команди: " + averageAge1);

        // Виводимо вік гравців другої команди
        System.out.print("Вік гравців другої команди: ");
        for (int age : teamAges2) {
            System.out.print(age + " ");
        }
        System.out.println("Середній вік гравців другої команди: " + averageAge2);

    }

}

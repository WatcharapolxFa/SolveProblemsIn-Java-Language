
public class PopulationProjection {
    public static void main(String[] args) {
        int day = 365;
        int sumBirth = (day * 24 * 60 * 60) / 7;
        int sumDeath = (day * 24 * 60 * 60) / 13;
        int sumNewImmigrant = (day * 24 * 60 * 60) / 45;
        int populations = 312032486;
        int sum;
        int f;

        for (f = 0; f <= 5; f++) {
            sum = populations + ((sumBirth - sumDeath + sumNewImmigrant) * f);
            System.out.println("Year to " + (f) + ":" + sum);
        }
    }

}

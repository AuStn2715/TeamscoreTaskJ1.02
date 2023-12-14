package Tasks.PracticalProblem1;

public class Diller extends Provider {
    long producerInn;
    double markup = 1.2; // пускай пока будет у всех диллеров одна, но можно легко поменять
    public Diller(long inn, String adress, String title, long producerInn) {
        this.inn = inn;
        this.adress = adress;
        this.title = title;
        this.producerInn = producerInn;
    }
}

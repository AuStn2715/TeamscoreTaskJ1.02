package Tasks.PracticalProblem1;

public class Diller extends Provider {
    Producer producer;
    public Diller(long inn, String adress, String title, Producer producer) {
        this.inn = inn;
        this.adress = adress;
        this.title = title;
        this.producer = producer; // с точки зрения безопасности лучше было сделать по ИНН, но это учебный проект
        //мне кажется логично использовать ссылку на объект-производителя как ссылку на производителя к которому прикреплен диллер
    }
}

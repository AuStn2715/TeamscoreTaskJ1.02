package Tasks.PracticalProblem1;
import java.util.Random;
public class FillUpManager {
    public static void fill (String[][] nomenclature) {
        var rnd = new Random(0);
        for (int i = 0; i<15; i++) {
            nomenclature[i][0] = Long.toString(10000_00000L + (long)i); // согласно условию тут 10-15цифр, правда числа по порядку
            nomenclature[i][2] = Integer.toString(rnd.nextInt(100) * 100);
        }
        nomenclature[1][1] = "Красный кирпич";
        nomenclature[2][1] = "Серый кирпич";
        nomenclature[3][1] = "Красивый кирпич";
        nomenclature[4][1] = "Мраморная плита";
        nomenclature[5][1] = "Трактор дт75";
        nomenclature[6][1] = "Агромаш-90ТГ";
        nomenclature[7][1] = "Бумага";
        nomenclature[8][1] = "Туалетная бумага";
        nomenclature[9][1] = "Резина летняя";
        nomenclature[10][1] = "Резина зимняя";
        nomenclature[11][1] = "Сталь 6";
        nomenclature[12][1] = "Сталь 7";
        nomenclature[13][1] = "Сталь 12";
        nomenclature[14][1] = "Сталь 15";
        nomenclature[15][1] = "Сталь 45";

        var producer1 = new Producer(100000000,"Ленина 17", "РОСКИРПИЧ");
        var producer2 = new Producer(100000001,"Масленникова 4", "ЗИМ");
        var producer3 = new Producer(100000002,"Московское шоссе 118", "СТЗ");
        var diller1 = new Diller(1000000003, "Ухабово 71", "Кубатура", producer1);
        var diller2 = new Diller(1000000004, "Сырово 4", "Сталь.ин", producer2);
    }
}

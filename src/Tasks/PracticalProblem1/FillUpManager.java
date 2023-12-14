package Tasks.PracticalProblem1;
import java.util.Random;
public class FillUpManager {
    public static void fill (String[][] nomenclature) {

        var rnd = new Random(0);
        for (int i = 1; i < nomenclature.length; i++) {
            nomenclature[i][0] = Long.toString(1000000000L + (long)i); // артикулы
            nomenclature[i][2] = Integer.toString(rnd.nextInt(1000) * 100); // цены в копейках
        }
        nomenclature[1][1] = "Красный кирпич"; // наименования товаров
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

        nomenclature[1][3] = "1000000000"; // ИНН поставщика
        nomenclature[2][3] = "1000000000";
        nomenclature[3][3] = "1000000003";
        nomenclature[4][3] = "1000000003";
        nomenclature[5][3] = "1000000002";
        nomenclature[6][3] = "1000000002";
        nomenclature[7][3] = "1000000001";
        nomenclature[8][3] = "1000000001";
        nomenclature[9][3] = "1000000002";
        nomenclature[10][3] = "1000000002";
        nomenclature[11][3] = "1000000004";
        nomenclature[12][3] = "1000000004";
        nomenclature[13][3] = "1000000004";
        nomenclature[14][3] = "1000000004";
        nomenclature[15][3] = "1000000004";


    }
}

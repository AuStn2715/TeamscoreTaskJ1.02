package Tasks.PracticalProblem1;
import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        int PROVIDERS_COUNT = 15;
        String[][] nomenclature = new String[PROVIDERS_COUNT+1][4];

        var producer1 = new Producer(1000000000,"Ленина 17", "РОСКИРПИЧ");
        var producer2 = new Producer(1000000001,"Масленникова 4", "ЗИМ");
        var producer3 = new Producer(1000000002,"Московское шоссе 118", "СТЗ");
        var diller1 = new Diller(1000000003, "Ухабово 71", "Кубатура", 1000000000);
        var diller2 = new Diller(1000000004, "Сырово 4", "Сталь.ин", 1000000001);
        Provider[] providers = {producer1, producer2, producer3, diller1, diller2};;
        FillUpManager.fill(nomenclature);

        var in = new Scanner(System.in);
        int ITEM_ARTICUL = 0;
        int ITEM_TITLE = 1;
        int ITEM_COST = 2;
        int ITEM_PROVIDER_INN = 3;
        int curItem;
        long curProviderInn;
        int curProviderIndex;
        boolean curProviderIsDiller;
        double curItemCost;
        int realProducerIndex;

        while (true){
            curItem = -1;
            String input = in.next();

            for (int i = 1; i < PROVIDERS_COUNT+1; i++) {
                if (nomenclature[i][ITEM_ARTICUL].equals(input)) {
                    curItem = i;
                    break;
                }
            }
            if (curItem == -1) {
                System.out.println("Товар не найден");
                continue;
            }

            System.out.println(nomenclature[curItem][ITEM_TITLE]);

            curProviderInn = Long.parseLong(nomenclature[curItem][ITEM_PROVIDER_INN]);
            curProviderIndex = Main.getProviderIndex(curProviderInn, providers);


            curProviderIsDiller = providers[curProviderIndex] instanceof Diller;
            if(curProviderIsDiller) {
                curItemCost = Double.parseDouble(nomenclature[curItem][ITEM_COST])
                        * ((Diller) providers[curProviderIndex]).markup;
            }
            else {
                curItemCost = Double.parseDouble(nomenclature[curItem][ITEM_COST]);
            }

            System.out.println("стоимость: " + curItemCost);
            System.out.println("поставщик: " + providers[curProviderIndex].title);
            System.out.println("по адресу: " + providers[curProviderIndex].adress);
            if (curProviderIsDiller) {
                curProviderInn = ((Diller) providers[curProviderIndex]).producerInn;
                realProducerIndex = getProviderIndex(curProviderInn, providers);

                System.out.println("(производитель: " + providers[realProducerIndex].title + ")");
            }
        }
    }

    private static int getProviderIndex (long curProviderInn, Provider[] providers) {
        for  (int i = 0; i < providers.length; i++) {
            if (providers[i].inn == curProviderInn) {
                return i;
            }
        }
        return -1;
    }
}

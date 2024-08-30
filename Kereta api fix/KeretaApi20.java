public class KeretaApi20 {

    public static void main(String[] args) {
        String train1, train2, train3, train4, train5, train6, train7, train8, train9, train10;
        String type1, type2, type3, type4, type5, type6, type7, type8, type9, type10;
        int capacity1, capacity2, capacity3, capacity4, capacity5, capacity6, capacity7, capacity8, capacity9, capacity10;

        train1 = "Argo Wilis";
        type1 = "Eksekutif";
        capacity1 = 200;

        train2 = "Taksaka";
        type2 = "Bisnis";
        capacity2 = 150;

        train3 = "Gajayana";
        type3 = "Ekonomi";
        capacity3 = 300;

        train4 = "Matarmaja";
        type4 = "Eksekutif";
        capacity4 = 180;

        train5 = "Sancaka";
        type5 = "Bisnis";
        capacity5 = 140;

        train6 = "Lodaya";
        type6 = "Ekonomi";
        capacity6 = 250;

        train7 = "Bangunkarta";
        type7 = "Eksekutif";
        capacity7 = 200;

        train8 = "Bima";
        type8 = "Bisnis";
        capacity8 = 160;

        train9 = "Jayabaya";
        type9 = "Ekonomi";
        capacity9 = 220;

        train10 = "Mutiara Selatan";
        type10 = "Eksekutif";
        capacity10 = 200;

        capacity1 = adjustCapacity(capacity1, 20);
        capacity2 = adjustCapacity(capacity2, -30);
        capacity3 = adjustCapacity(capacity3, 50);
        capacity4 = adjustCapacity(capacity4, -20);
        capacity5 = adjustCapacity(capacity5, 10);
        capacity6 = adjustCapacity(capacity6, 0);
        capacity7 = adjustCapacity(capacity7, -10);
        capacity8 = adjustCapacity(capacity8, 15);
        capacity9 = adjustCapacity(capacity9, -5);
        capacity10 = adjustCapacity(capacity10, 25);

        printTrainDetails(train1, type1, capacity1);
        printTrainDetails(train2, type2, capacity2);
        printTrainDetails(train3, type3, capacity3);
        printTrainDetails(train4, type4, capacity4);
        printTrainDetails(train5, type5, capacity5);
        printTrainDetails(train6, type6, capacity6);
        printTrainDetails(train7, type7, capacity7);
        printTrainDetails(train8, type8, capacity8);
        printTrainDetails(train9, type9, capacity9);
        printTrainDetails(train10, type10, capacity10);
    }

    public static int adjustCapacity(int capacity, int change) {
        return capacity + change;
    }
    public static void printTrainDetails(String trainName, String trainType, int capacity) {
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Type: " + trainType);
        System.out.println("Capacity: " + capacity + "\n");
    }
}
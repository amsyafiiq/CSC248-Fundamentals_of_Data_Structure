public class GoKartAppQ {
    public static void main(String[] args) {
        Queue GKQueue = new Queue();
        Queue tempQ = new Queue();

        GKQueue.enqueue(new GoKart("Yusof Hamid", "Couple", "150cc", 2, 3, false));
        GKQueue.enqueue(new GoKart("Juliana Ahmad", "Single", "200cc", 1, 2, true));
        GKQueue.enqueue(new GoKart("Rizal Roslan", "Single", "200cc", 2, 4, false));
        GKQueue.enqueue(new GoKart("Ahmad Khairuddin", "Couple", "150cc", 2, 2, true));
        GKQueue.enqueue(new GoKart("Siti Baizura", "Single", "200cc", 1, 3, true));

        System.out.println("All Customer Details :- ");
        while (!GKQueue.isEmpty()) {
            GoKart temp = GKQueue.dequeue();
            System.out.println(temp.toString());
            tempQ.enqueue(temp);
        }
        System.out.println();

        double total = 0, price = 0;
        while (!tempQ.isEmpty()) {
            GoKart temp = tempQ.dequeue();

            price = 30 * temp.getNumLaps();
            if (temp.getSafetySet())
                price = price + 20;
            total += price;

            GKQueue.enqueue(temp);
        }
        System.out.println("Total Price Received From All Customer: RM " + String.format("%.2f", total));
        System.out.println();

        Queue raceAdvQ = new Queue();
        Queue tempRaceQ = new Queue();
        while (!GKQueue.isEmpty()) {
            GoKart temp = GKQueue.dequeue();

            if (temp.getOption() == 2)
                raceAdvQ.enqueue(temp);

            tempQ.enqueue(temp);
        }

        System.out.println("Customer Details that Choose Race Adventure:- ");
        while (!raceAdvQ.isEmpty()) {
            GoKart temp = raceAdvQ.dequeue();
            System.out.println(temp.toString());
            tempRaceQ.enqueue(temp);
        }
    }
}
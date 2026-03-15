public class ExpenseSplit {

    public static void main(String[] args) {

        String[] names = { "Alice", "Bob", "Charlie" };

        double[] paid = { 30.0, 0.0, 15.0 };
        double totalKharcha = 0;
        for (double paise : paid) {
            totalKharcha += paise;
        }
        int log = names.length;
        double hissa = totalKharcha / log;
        System.out.println("Total Kharcha = " + totalKharcha);
        System.out.println("Har kisi ka hissa = " + hissa);
        double[] balance = new double[log];

        for (int i = 0; i < log; i++) {
            balance[i] = paid[i] - hissa;
        }
        for (int i = 0; i < log; i++) {
            if (balance[i] < 0) {
                for (int j = 0; j < log; j++) {
                    if (balance[j] > 0) {
                        double amount = Math.min(-balance[i], balance[j]);

                        System.out.println(names[i] + " ko " + names[j] + " ko " + amount + " rupaye dene hain.");
                        balance[i] += amount;
                        balance[j] -= amount;
                        if (balance[i] == 0) {
                            break;
                        }
                    }
                }
            }
        }
    }
}

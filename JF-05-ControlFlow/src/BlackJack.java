public class BlackJack {
    public static void main(String[] args) {

        String card = "king";
        int currentTotalValue = 15;

       int currentValue =  switch (card) {
            case "king", "queen", "jack" -> 10;
            case "ace" -> {
                if (currentTotalValue < 11) {
                    yield 11;
                } else {
                    yield 1;
                }
            }
           default -> Integer.parseInt(card);

        };
        System.out.println(currentValue);
        System.out.printf("Total value: %d%n", currentTotalValue + currentValue);
    }
}

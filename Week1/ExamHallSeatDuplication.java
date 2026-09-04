public class ExamHallSeatDuplication {
    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;
        for (int i = 0; i < seatNumbers.length; i++) {
            boolean printed = false;
            for (int j = 0; j < i; j++) {
                if (seatNumbers[i] == seatNumbers[j]) printed = true;
            }
            if (printed) continue;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true;
                    break;
                }
            }
        }
        if (!found) System.out.println("No Duplicate Seats Found");
    }

    public static void main(String[] args) {
        checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
    }
}

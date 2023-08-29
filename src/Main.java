public class Main {
    public static void main(String[] args) {

        // Example step data recordings
        Shagomer.recordingStepData("Июль 1 5100");
        Shagomer.recordingStepData("Июль 15 4800");
        Shagomer.recordingStepData("Август 3 5200");

        // Get and display step data for a specific month
        Shagomer.getDateMonth("Июль");
    }
}

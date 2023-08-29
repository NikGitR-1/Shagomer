public class Shagomer {
    private static int[][] steps = new int[12][];

    {
        steps[0] = new int[31];
        steps[1] = new int[28];
        steps[2] = new int[31];
        steps[3] = new int[30];
        steps[4] = new int[31];
        steps[5] = new int[30];
        steps[6] = new int[31];
        steps[7] = new int[31];
        steps[8] = new int[30];
        steps[9] = new int[31];
        steps[10] = new int[30];
        steps[11] = new int[31];
    }

    private static int purpose = 5000;


    public static void recordingStepData(String stepDate) {
        String[] data = stepDate.split(" ");
        int date = Integer.parseInt(data[1]);
        int step = Integer.parseInt(data[2]);
        steps[getNumberOfMonth(data[0])][date] = step;
        if (step >= purpose) {
            System.out.println("Вы превысили цель, поздравляем!");
        } else {
            System.out.println("Цель не была достигнута");
        }
    }

    public static void getDateMonth(String month){
       int monthIndex = getNumberOfMonth(month);
       int[] dateOfMonth = steps[monthIndex];
       for(int i = 0; i < dateOfMonth.length; i++){
           if(dateOfMonth[i] >= purpose){
               System.out.println(month + " " + (i + 1) + " = " + dateOfMonth[i] + "Вы превысили цель, поздравляем!");
           } else {
               System.out.println(month + " " + (i + 1) + " = " + dateOfMonth[i]);
           }
       }
    }

    //

    private static int getNumberOfMonth(String month) {
        switch (month) {
            case "Январь":
                return 0;
            case "Февраль":
                return 1;
            case "Март":
                return 2;
            case "Апрель":
                return 3;
            case "Май":
                return 4;
            case "Июнь":
                return 5;
            case "Июль":
                return 6;
            case "Август":
                return 7;
            case "Сентябрь":
                return 8;
            case "Октябрь":
                return 9;
            case "Ноябрь":
                return 10;
            case "Декабрь":
                return 11;
        }
        return 0;
    }


    public int[][] getSteps() {
        return steps;
    }

    public void setSteps(int[][] steps) {
        this.steps = steps;
    }

    public int getPurpose() {
        return purpose;
    }

    public void setPurpose(int purpose) {
        this.purpose = purpose;
    }
}

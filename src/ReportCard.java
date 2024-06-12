public class ReportCard {
    /**
     * Mетод convertGrades принимает один целочисленный аргумент
     * - результат теста и возвращает символ A, B, C or D в
     * зависимости от этого аргумента.
     */
    public char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public void switcher(char yourGrade){
        switch (yourGrade){
            case 'A':
                System.out.println("Perfect");
                break;
            case 'B':
                System.out.println("GOOD");
                break;
            case 'C':
                System.out.println("Bad");
                break;
            case 'D':
                System.out.println("Very bad");
                break;
        }
    }


    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        char yourGrade = rc.convertGrades(98);
        System.out.println("Ваша первая оценка " + yourGrade);
        rc.switcher(yourGrade);
        yourGrade = rc.convertGrades(89);
        System.out.println("Ваша вторая оценка " + yourGrade);
        rc.switcher(yourGrade);
        yourGrade = rc.convertGrades(79);
        System.out.println("Ваша вторая оценка " + yourGrade);
        rc.switcher(yourGrade);
        yourGrade = rc.convertGrades(69);
        System.out.println("Ваша вторая оценка " + yourGrade);
        rc.switcher(yourGrade);
    }
}

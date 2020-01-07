package lesson4.homework4;

public class StudentTest {
    public static void main(String[] args) {

        Student studentPetrov = new Student();
        Student studentIvanov = new Student();
        Student studentKosova = new Student();

        studentPetrov.numberOfStudentsTicket = 1;
        studentPetrov.yearOfStudy = 2018;
        studentPetrov.firstName = "Дмитрий";
        studentPetrov.lastName = "Петров";
        studentPetrov.averageMathScore = 7.6;
        studentPetrov.averageEconomicScore = 5.9;
        studentPetrov.averageRatingInForeignLanguage = 8.4;

        double resultAverage = (studentPetrov.averageMathScore + studentPetrov.averageEconomicScore
                                + studentPetrov.averageRatingInForeignLanguage) / 3;

//        System.out.println("Студент: " + studentPetrov.firstName + " "
//                            + studentPetrov.lastName + ", имеет среднюю оценку: " + resultAverage);

    }
}

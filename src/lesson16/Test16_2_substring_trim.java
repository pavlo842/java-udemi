package lesson16;

public class Test16_2_substring_trim {
    public static void main(String[] args) {

        String s3 = new String("Hello");
        // 6. substring(int beginIndex) -> String
        //    substring(int beginIndex, int endIndex) -> String
        // String s6 = s3.substring(3); // присвоить s6 substring от s3 НАЧИНАЯ С 3 ИНДЕКСА
        // System.out.println(s6);

        // String s6_1 = s3.substring(3, 7); // присвоить s6 substring от s3 НАЧИНАЯ С 3 ИНДЕКСА ПО 7 ИНДЕКС - 7 индекс не будет включен
        // System.out.println(s6_1);

        // String s6_2 = s3.substring(3, 11); // если не существует индекса следующего за последним то JAVA позволит вывести последний индекс
        // System.out.println(s6_2);

        // 7. trim() -> string
        // String s7 = s3.trim(); // trim уберает пробелы ПО БОКАМ
        // System.out.println(s7);

        // 8. replace(char oldChar, char newChar): -> String
        //    replace(String oldString, String newString): -> String
        // должны быть два стринга или два чара
        String s8 = s3.replace('H', 'P');
        System.out.println(s8);
        String s8_1 = s3.replace("He", "All");
        System.out.println(s8_1);

        // 9. concat(String str) -> String
        String s9 = " friend";
        System.out.println(s3.concat(s9));

    }
}

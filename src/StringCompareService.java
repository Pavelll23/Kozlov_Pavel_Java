public class StringCompareService {

    public String com (String a , String b) {
        String result;
        if (a.equals(b)) {
            result= "Строки идентичны";
        } else {
            result = "Строки неидентичны";
        }
        return result;
    }
}

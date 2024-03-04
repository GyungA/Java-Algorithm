import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date nowDate = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String strNowDate = simpleDateFormat.format(nowDate);
        System.out.println(strNowDate);
    }

}

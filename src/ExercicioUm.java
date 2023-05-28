import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ExercicioUm {
        public static String convertDate(String inputDate) {
            String[] possibleFormats = {
                    "dd/MM/yyyy",
                    "dd MM yyyy",
                    "ddMMyyyy",
                    "yyyy MM dd"
            };

            for (String format : possibleFormats) {
                try {
                    LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern(format));
                    return date.format(DateTimeFormatter.ofPattern("yyyy MM"));
                } catch (Exception e) {
                }
            }
            return "";
        }

        public static void main(String[] args) {
            String[] dates = {
                    "01/05/2018",
                    "01 05 2018",
                    "01052018",
                    "2018 05 01"
            };

            for (String date : dates) {
                String convertedDate = convertDate(date);
                System.out.println("Original Date: " + date);
                System.out.println("Converted Date: " + convertedDate);
                System.out.println();
            }
        }
    }
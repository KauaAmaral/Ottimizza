public class ExercicioDois {
        public static String concatenateStrings(String[] stringArray) {
            StringBuilder result = new StringBuilder();
            for (String str : stringArray) {
                result.append(str).append(" ");
            }
            return result.toString().trim();
        }

        public static void main(String[] args) {
            String[] array = {"CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"};
            String concatenatedString = concatenateStrings(array);
            System.out.println("Concatenated String: " + concatenatedString);
        }
    }
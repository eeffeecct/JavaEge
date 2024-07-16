public class Ege {
    public static void main(String[] args) {
        String s = "01234567";
        int count = 0;

        for (int x1 = 0; x1 < s.length(); x1++){
            for (int x2 = 0; x2 < s.length(); x2++){
                for (int x3 = 0; x3 < s.length(); x3++){
                    for (int x4 = 0; x4 < s.length(); x4++){
                        for (int x5 = 0; x5 < s.length(); x5++){
                            String number = "" + x1 + x2 + x3 + x4 + x5;
                            String regex1 = "^[02468].*";
                            String regex2 = "^(?!.*[26]$).*";
                            String regex3 = "^(?:[^7]*7[^7]*){0,2}[^7]*$";
                            if (number.matches(regex1) && number.matches(regex2) && number.matches(regex3) && Integer.parseInt(number) >= 10000)
                                count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}


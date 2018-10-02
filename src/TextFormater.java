public class TextFormater {

    public static boolean polindrom (String str){
        String line;
        boolean flag = false;
        String [] mas = str.split("\\s*(\\s|,)\\s*");
        for (int i = 0; i < mas.length; i++){
            if (mas[i].length() > 1){
                line = mas[i].toLowerCase();
                StringBuffer stringBuffer = new StringBuffer(line);
                stringBuffer.reverse();
                if (line.contentEquals(stringBuffer)){
                    flag = true;
                    break;
                }
            }
        }
        if (flag){
            return true;
        }
        return false;
    }

    public static int count (String str){
        String [] mas = str.split("\\s*(\\s|,)\\s*");
        return mas.length ;
    }

}


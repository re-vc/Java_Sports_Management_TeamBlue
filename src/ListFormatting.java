public class ListFormatting {



    /**
     * method formatMyString makes the string for given length for your lists
     * if the string is shorter than the length in the argument, than some empty char will be added
     * if it is shorter, the end of string will be cut away
     * @param length
     * @param myString
     * @return
     */
    public static String formatMyString(int length,String myString){
        String x="";
        for (int n=0;n<length;n++){
            x=x+" ";
        }
        String formattedString=myString+x; //field to help formatting name  20 char long in the list
        formattedString=formattedString.substring(0,length-1);

        return formattedString;
    }

    /**
     * formatMyDouble method makes the number right aligned and gives back a String for the list
     * in the given length, if the number is longer than the given length, a longer string will be
     * returned, because this method, do not gives back wrong values.
     *
     * @param length
     * @param number
     * @return
     */
    public static String formatMyDouble(int length,Double number){
        String x="";
        for (int n=0;n<length;n++){
            x=x+" ";
        }
        String niceDouble = String.valueOf(number); //field to format and right aline the given number

        if (niceDouble.length()<length) {
            int y=niceDouble.length()+length;
            niceDouble = (x+niceDouble).substring(y-length,y);  //right align the number
        }

        return niceDouble;
    }



}

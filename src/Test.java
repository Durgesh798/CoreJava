class Test{
    public static void main(String[] args) {
        String s = "world hel2o";
        String[] c=s.split(" ");
        for(int i=c.length-1;i>=0;i--){
            String d=c[i].toString();
            //System.out.println(d);
            for(char ch: d.toCharArray()){
                if(Character.isDigit(ch))
                {
                    int count= Character.getNumericValue(ch);
                    continue;
                }
                System.out.print(ch);
            }
        }
    }
}
public class olleHdlroW {
    public static void main(String[] args) {
    // TODO Auto-generated method stub

    String string1 = "college";

    String[] string2 = string1.split(" ");
    String result ="";

    for(int i=0;i<string2.length;i++)
    {
        StringBuilder stringBuilder = new StringBuilder(string2[i]);

        result = (i==0)?(result+ stringBuilder.reverse().toString()):(result +" "+stringBuilder.reverse().toString());
    }

    System.out.println("Result line:"+result);
}

}
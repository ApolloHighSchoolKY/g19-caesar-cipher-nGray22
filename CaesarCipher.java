/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] shifted={'z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y'};
	private int shift;

    public CaesarCipher() {
        alphabet[4]='e';
        shifted[4]='d';
        shift=1;


    }

    public CaesarCipher(int num){

        shift = num;
    }

    public String encrypt(String message){
        String x="";
        for(int p=0; p<message.length(); p++)
        for(int i=0; i<alphabet.length; i++)
            if(alphabet[i]==indexOf(message.substring(p,p+1)))
            x += shifter() + "";
            else
            x += message.substring(p,p+1);

        return x + "";
    }

    public String decrypt(String message){
        for(int p=0; p<message.length(); p++)
        for(int i=0; i<shifted.length; i++)
            if(shifted[i]==indexOf(message.substring(p,p+1)))
            x += shifter() + "";
            else
            x += message.substring(p,p+1);
        
        return "";
    }

    public void shifter(int num){
        //position+num%26
        
        for(int i=0; i<alphabet.length-num; i++)
         if(i+num<alphabet.length)
          shifted[i+num]=alphabet[i];
         else if(i+num>=alphabet.length)
            shifted[(i+num)%26]= alphabet[i];
    }


}
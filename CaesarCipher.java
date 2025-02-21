/**
 * @(#)CaesarCipher.java
 *
 *
 * @author
 * @version 1.00 2025/2/20
 */


public class CaesarCipher {

	private char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] shifted;
	private int shift;

    public CaesarCipher() {
        shifted = new char[26];
        shifter(shift);
        shift=1;


    }

    public CaesarCipher(int num){
        shifted = new char[26];
        shift = num;
        shifter(shift);
    }

    public String encrypt(String message){
        String x="";
        boolean find=false;
        for(int p=0; p<message.length(); p++)
        {find=false;
        for(int i=0; i<alphabet.length; i++)
        {
            
            if(message.charAt(p) == alphabet[i]){
                find=true;
            x += shifted[i];}
           
           
       
        }
            if(find==false)
            x+=message.charAt(p);
        
    }
   return x + ""; 
}

    public String decrypt(String message){
        String x="";
        boolean find=false;
        for(int p=0; p<message.length(); p++)
        {find=false;
        for(int i=0; i<alphabet.length; i++)
        {
            
            if(message.charAt(p) == shifted[i]){
                find=true;
            x += alphabet[i];}
           
        
       
        }
            if(find==false)
            x+=message.charAt(p);
        
    }
        return x+"";
    }

    public void shifter(int num){
        //position+num%26
        
        for(int i=0; i<alphabet.length; i++)
          
            shifted[(i+num)%26]= alphabet[i];
    }


}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class SHA
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader inputstring = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter string:");
        String input = inputstring.readLine();
        try
        {
            System.out.println("SHA hash of string: " +SHA(input));
        }
        catch (NoSuchAlgorithmException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
   public static String SHA(String inputstr)
    throws NoSuchAlgorithmException, UnsupportedEncodingException
    {
        MessageDigest sh;
        sh = MessageDigest.getInstance("SHA");
        byte[] byteData = new byte[20];
        sh.update(inputstr.getBytes("iso-8859-1"), 0, inputstr.length());
        byteData = sh.digest();
        
        //convertToHex
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
         str.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        return str.toString();
    } 
    
    
}
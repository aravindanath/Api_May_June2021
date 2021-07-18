package BasicAuth;

import java.util.Base64;

public class Base64EncodingProgram {


    public static void main(String[] args) {

        String auth = "admin:admin";

        System.out.println("Simple String: \n"+auth);

        String basicBase64Format = Base64.getEncoder().encodeToString(auth.getBytes());

        System.out.println("Encoded String: \n"+ basicBase64Format);

        byte[] actualByte =Base64.getDecoder().decode(basicBase64Format);

        String actualString = new String(actualByte);

        System.out.println("Actual String: \n"+ actualString);
//YWRtaW46YWRtaW4=

    }
}

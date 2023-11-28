package hw10;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DecodeString {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String secret1 = "톁⃐뷐뻐닑诐밠킳킾킴킾킼Ⱐ킶킵킻킰톎";
        String secret2 = " Ñ\u0083Ñ\u0081Ð¿ÐµÑ\u0085Ð¾Ð² Ð² Ð¸Ð·Ñ\u0083Ñ\u0087ÐµÐ½Ð¸Ð¸ Ð´Ð¶Ð°Ð²Ð°!";
        decoder(secret1);
        decoder(secret2);
    }


    public static void decoder(String s) throws UnsupportedEncodingException {
        Charset[] charsets = {StandardCharsets.ISO_8859_1, StandardCharsets.UTF_8, StandardCharsets.US_ASCII,
                StandardCharsets.UTF_16BE, StandardCharsets.UTF_16, StandardCharsets.UTF_16LE};
        for (Charset i: charsets){
            byte[] str = s.getBytes(i);
            for (Charset j: charsets) {
                String last = new String(str, j);
                System.out.println(last);
            }
        }
    }
}

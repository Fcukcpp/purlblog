package com.github.fuckcpp.purlblog.Utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Location {
    /**
     * 字符串转md5
     * @param pInput
     * @return
     */
    public static String getMd5(String pInput) {
        try {

            MessageDigest lDigest = MessageDigest.getInstance("MD5");
            lDigest.update(pInput.getBytes());
            BigInteger lHashInt = new BigInteger(1, lDigest.digest());
            return String.format("%1$032X", lHashInt).toLowerCase();
        } catch (NoSuchAlgorithmException lException) {
            throw new RuntimeException(lException);
        }
    }

    public  static  String GetURLcode(String input) throws UnsupportedEncodingException {
      return   java.net.URLEncoder.encode(input, "UTF-8");
    }

}
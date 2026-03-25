package com.engagelab.privates.common.utils;

import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.exoplayer2.C;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class AESUtil {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] aes_cbc(byte[] bArr, String str, String str2, int i) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateKeyBytes(str, MTCommonConstants.UTF_8), BouncyCastleKeyManagementRepository.AES);
        IvParameterSpec ivParameterSpecReflectGetIv = reflectGetIv(str2.getBytes(MTCommonConstants.UTF_8));
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        cipher.init(i, secretKeySpec, ivParameterSpecReflectGetIv);
        return cipher.doFinal(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] aes_ecb(byte[] bArr, String str, int i) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(generateKeyBytes(str, MTCommonConstants.UTF_8), BouncyCastleKeyManagementRepository.AES);
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
        cipher.init(i, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] decryptBytes(byte[] bArr, String str) throws Exception {
        return aes_ecb(bArr, str, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] encryptBytes(byte[] bArr, String str) throws Exception {
        return aes_ecb(bArr, str, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static byte[] generateKeyBytes(String str, String str2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[str.length()];
        byte[] bytes = str.substring(0, str.length() / 2).getBytes(str2);
        byte[] bytes2 = str.substring(str.length() / 2).getBytes(str2);
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        System.arraycopy(bytes2, 0, bArr, bytes.length, bytes2.length);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int generateSeed() {
        return Math.abs(new SecureRandom().nextInt()) & 16777215;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String get16Md5AesKey(long j) {
        long j2;
        long j3;
        switch ((int) (j % 10)) {
            case 1:
                j2 = 5 * j;
                j3 = j % 88;
                break;
            case 2:
                j2 = 23 * j;
                j3 = j % 15;
                break;
            case 3:
                j2 = 3 * j;
                j3 = j % 73;
                break;
            case 4:
                j2 = 13 * j;
                j3 = j % 96;
                break;
            case 5:
                j2 = 17 * j;
                j3 = j % 49;
                break;
            case 6:
                j2 = 7 * j;
                j3 = j % 68;
                break;
            case 7:
                j2 = 31 * j;
                j3 = j % 39;
                break;
            case 8:
                j2 = 29 * j;
                j3 = j % 41;
                break;
            case 9:
                j2 = 37 * j;
                j3 = j % 91;
                break;
            default:
                j2 = 8 * j;
                j3 = j % 74;
                break;
        }
        return StringUtil.get16MD5String("JCKP" + (j2 + j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getIv(String str, char c) {
        byte[] bytes = str.getBytes(Charset.forName(C.UTF8_NAME));
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ c);
        }
        return new String(bytes, 0, bytes.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getMd5AesKey(long j) {
        long j2;
        long j3;
        switch ((int) (j % 10)) {
            case 1:
                j2 = 5 * j;
                j3 = j % 88;
                break;
            case 2:
                j2 = 23 * j;
                j3 = j % 15;
                break;
            case 3:
                j2 = 3 * j;
                j3 = j % 73;
                break;
            case 4:
                j2 = 13 * j;
                j3 = j % 96;
                break;
            case 5:
                j2 = 17 * j;
                j3 = j % 49;
                break;
            case 6:
                j2 = 7 * j;
                j3 = j % 68;
                break;
            case 7:
                j2 = 31 * j;
                j3 = j % 39;
                break;
            case 8:
                j2 = 29 * j;
                j3 = j % 41;
                break;
            case 9:
                j2 = 37 * j;
                j3 = j % 91;
                break;
            default:
                j2 = 8 * j;
                j3 = j % 74;
                break;
        }
        return StringUtil.get32MD5String("JCKP" + (j2 + j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static byte[] decryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return aes_cbc(bArr, str, str2, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static byte[] encryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return aes_cbc(bArr, str, str2, 1);
    }

    private static IvParameterSpec reflectGetIv(byte[] bArr) throws Exception {
        return (IvParameterSpec) ReflectUtil.invokeConstructor(IvParameterSpec.class, new Object[]{bArr}, new Class[]{byte[].class});
    }
}

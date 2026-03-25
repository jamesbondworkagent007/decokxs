package com.geetest.captcha;

import android.util.Base64;
import androidx.core.view.InputDeviceCompat;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes17.dex */
public final class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(byte[] bArr) throws Exception {
        byte[] bytes = "VedaT=ZbPq0Zv7Do".getBytes("utf-8");
        Object objNewInstance = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(a());
        Object objNewInstance2 = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes, BouncyCastleKeyManagementRepository.AES);
        Class<?> cls = Class.forName(a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 2, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] b(String str) throws Exception {
        String str2 = new String(a());
        byte[] bytes = str.getBytes("utf-8");
        byte[] bytes2 = "VedaT=ZbPq0Zv7Do".getBytes("utf-8");
        Object objNewInstance = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(str2.getBytes("utf-8"));
        Object objNewInstance2 = Class.forName(a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes2, BouncyCastleKeyManagementRepository.AES);
        Class<?> cls = Class.forName(a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 1, objNewInstance2, objNewInstance);
        return (byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bytes);
    }

    public static byte[] a() {
        char[] charArray = new String(Base64.decode("MzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzAzMDMwMzA=", 0)).toCharArray();
        int length = charArray.length / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(charArray[i2 + 1], 16) | (Character.digit(charArray[i2], 16) << 4);
            if (iDigit > 127) {
                iDigit += InputDeviceCompat.SOURCE_ANY;
            }
            bArr[i] = (byte) iDigit;
        }
        return bArr;
    }

    public static String a(String str) {
        return new String(Base64.decode(str, 0));
    }
}

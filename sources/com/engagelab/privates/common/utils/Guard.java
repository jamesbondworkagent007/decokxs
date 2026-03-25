package com.engagelab.privates.common.utils;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class Guard {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String string(byte[] bArr) {
        return new String(guard(bArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void test(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] bArrGuard = guard(str.getBytes());
            Arrays.toString(bArrGuard);
            new String(guard(bArrGuard));
        } catch (Throwable th) {
            th.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static byte[] guard(byte[] bArr) {
        try {
            byte[] bArr2 = {32, Ascii.EM, 8, Ascii.SYN, 17, 48};
            byte[] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[(bArr.length + i) % 6]);
            }
            return bArr3;
        } catch (Throwable unused) {
            return new byte[0];
        }
    }
}

package com.geetest.mobinfo;

import android.content.Context;
import android.content.pm.Signature;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes21.dex */
public class PackageSign {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}

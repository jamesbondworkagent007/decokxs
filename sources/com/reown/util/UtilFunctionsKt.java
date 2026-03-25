package com.reown.util;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import o.AbstractC56415yEn;
import o.C56529yIt;
import o.C56548yJl;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class UtilFunctionsKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ String getEmpty(C56529yIt c56529yIt) {
        Intrinsics.checkNotNullParameter(c56529yIt, "");
        return "";
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: r0v0, r2v1 */
    public static final long generateId() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iEZpvd = C56548yJl.EZpvd(new IntRange(100, 999), Random.Default);
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append(iEZpvd);
        return Long.parseLong(sb.toString());
    }

    public static final long generateClientToServerId() {
        return (long) ((System.currentTimeMillis() * Math.pow(10.0d, 6.0d)) + ((double) C56548yJl.EZpvd(new IntRange(100000, 999999), Random.Default)));
    }

    public static final byte[] randomBytes(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static final String bytesToHex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        Iterator<Integer> it = yDV.isConnected(bArr).iterator();
        while (it.hasNext()) {
            String hexString = Integer.toHexString(bArr[((AbstractC56415yEn) it).nextInt()] & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final int bytesToInt(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length > 4) {
            throw new IllegalArgumentException("Byte array size must be less than 5".toString());
        }
        int i2 = 0;
        Iterator<Integer> it = C56548yJl.AhwBna(0, i).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC56415yEn) it).nextInt();
            i2 |= bArr[iNextInt] << (((i - 1) - iNextInt) * 8);
        }
        return i2;
    }

    public static final byte[] hexToBytes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static final /* synthetic */ String addUserAgent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return str + "&ua=wc-2/kotlin-" + str2;
    }
}

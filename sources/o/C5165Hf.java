package o;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5165Hf {
    public static final char[] EZpvd;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        EZpvd = charArray;
    }

    public static final java.lang.String OLrzqt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            char[] cArr = EZpvd;
            sb.append(cArr[(b & UnsignedBytes.MAX_VALUE) >> 4]);
            sb.append(cArr[b & Ascii.SI]);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final java.lang.String AEQbTJ(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return OLrzqt(bArr);
    }
}

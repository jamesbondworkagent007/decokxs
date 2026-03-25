package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C33496mxZ {
    public static final C33496mxZ AEQbTJ = new C33496mxZ();

    private C33496mxZ() {
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArrOLrzqt = new C58167ywF(new C58170ywI("HmacSHA256", com.google.android.exoplayer2.C.UTF8_NAME, KWHzl(str2), 2000)).OLrzqt(str, 16);
        Intrinsics.copydefault(bArrOLrzqt);
        return KWHzl(bArrOLrzqt);
    }

    public final byte[] KWHzl(java.lang.String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            java.lang.String strSubstring = str.substring(i2, i2 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            bArr[i] = (byte) java.lang.Integer.parseInt(strSubstring, 16);
        }
        return bArr;
    }

    public final java.lang.String KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.String string = new java.math.BigInteger(1, bArr).toString(16);
        int length = (bArr.length * 2) - string.length();
        if (length > 0) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%0" + length + com.ibm.icu.text.DateFormat.DAY, java.util.Arrays.copyOf(new java.lang.Object[]{0}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str + string;
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }
}

package o;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tkP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47137tkP {
    public static final C47137tkP KWHzl = new C47137tkP();

    private C47137tkP() {
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.copydefault(bArrDigest);
        java.lang.String str2 = "";
        for (byte b : bArrDigest) {
            java.lang.String str3 = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            str2 = str2 + str3;
        }
        return str2;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.copydefault(bArrDigest);
        java.lang.String str2 = "";
        for (byte b : bArrDigest) {
            java.lang.String str3 = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            str2 = str2 + str3;
        }
        return str2;
    }
}

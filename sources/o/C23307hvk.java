package o;

import android.os.Build;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23307hvk {
    public static final java.lang.String KWHzl() {
        try {
            return "型号:" + android.os.Build.MODEL + "厂商:" + android.os.Build.BRAND + "版本号:" + Build.VERSION.RELEASE;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String string = new java.math.BigInteger(1, messageDigest.digest(bytes)).toString(16);
        while (string.length() < 32) {
            string = "0" + string;
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }
}

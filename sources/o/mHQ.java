package o;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mHQ {
    public static final mHQ KWHzl = new mHQ();

    private mHQ() {
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            java.lang.String strEncodeToString = android.util.Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(bytes), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("CryptographicUtils", "Failed to hash string.", th);
            return "";
        }
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import o.C56929yXo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56777yRy {
    public static final C56933yXs AEQbTJ;
    public static final C56929yXo EZpvd;
    public static final C56929yXo KWHzl;
    public static final C56929yXo OLrzqt;
    public static final C56777yRy copydefault = new C56777yRy();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56929yXo AEQbTJ() {
        return KWHzl;
    }

    private C56777yRy() {
    }

    static {
        C56933yXs c56933yXs = new C56933yXs("kotlin.jvm.JvmField");
        AEQbTJ = c56933yXs;
        C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
        EZpvd = actionBar.KWHzl(c56933yXs);
        OLrzqt = actionBar.KWHzl(new C56933yXs("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        KWHzl = C56929yXo.ActionBar.fromString$default(actionBar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "get", false, 2, null) || C59449zhJ.startsWith$default(str, "is", false, 2, null);
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "set", false, 2, null);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (KWHzl(str)) {
            return str;
        }
        return "get" + C59428zgp.EZpvd(str);
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("set");
        if (KWHzl(str)) {
            strEZpvd = str.substring(2);
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
        } else {
            strEZpvd = C59428zgp.EZpvd(str);
        }
        sb.append(strEZpvd);
        return sb.toString();
    }

    public static final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return Intrinsics.copydefault(97, (int) cCharAt) > 0 || Intrinsics.copydefault((int) cCharAt, 122) > 0;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class hVP {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=6] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final AbstractC22038hVp copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return hVT.Companion.EZpvd(str2);
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return C22042hVt.Companion.OLrzqt(str2);
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return hVN.Companion.copydefault(str2);
                }
                break;
            case 52:
                if (str.equals("4")) {
                    return hVC.Companion.EZpvd(str2);
                }
                break;
            case 53:
                if (str.equals("5")) {
                    return hVG.Companion.OLrzqt(str2);
                }
                break;
            case 55:
                if (str.equals("7")) {
                    return hVI.Companion.EZpvd(str2);
                }
                break;
        }
        return hVF.Companion.KWHzl(str2);
    }
}

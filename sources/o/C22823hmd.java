package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22823hmd {
    public java.lang.Object AEQbTJ;
    public final java.lang.String OLrzqt;
    public final AbstractC23101hrq copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return "1";
    }

    public C22823hmd(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.OLrzqt = str;
        this.copydefault = abstractC23101hrq;
        this.AEQbTJ = new java.lang.Object();
    }

    public final java.lang.String KWHzl() {
        java.lang.String strOLrzqt = OLrzqt();
        return Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "0") ? "slow" : Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "2") ? "fast" : "average";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case 48:
                if (!str.equals("0")) {
                }
                break;
            case 49:
                if (!str.equals("1")) {
                }
                break;
            case 50:
                if (!str.equals("2")) {
                }
                break;
        }
        return "";
    }
}

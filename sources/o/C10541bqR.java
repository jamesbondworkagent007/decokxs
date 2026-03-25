package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10541bqR {
    public static final C10541bqR OLrzqt = new C10541bqR();

    private C10541bqR() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (!C33129mqd.valueOf(str2, str3)) {
            str2 = str3;
        }
        return C56390yDp.OLrzqt(java.lang.String.valueOf(((gKN) C43251rlk.copydefault(gKN.class)).EZpvd(java.lang.Float.parseFloat(str4), java.lang.Float.parseFloat(str5), java.lang.Float.parseFloat(str2))), java.lang.String.valueOf(((gKN) C43251rlk.copydefault(gKN.class)).EZpvd(java.lang.Float.parseFloat(str4), java.lang.Float.parseFloat(str5))));
    }
}

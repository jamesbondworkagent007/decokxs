package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yXv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56936yXv {
    public static final C56936yXv OLrzqt = new C56936yXv();
    public static final Regex AEQbTJ = new Regex("[^\\p{L}\\p{Digit}]");
    public static final java.lang.String EZpvd = "$context_receiver";

    private C56936yXv() {
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ.replace(str, "_");
    }

    public static final C56935yXu KWHzl(int i) {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(EZpvd + '_' + i);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return c56935yXuAEQbTJ;
    }
}

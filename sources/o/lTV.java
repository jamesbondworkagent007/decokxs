package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lTV {
    public static final lTV copydefault = new lTV();

    private lTV() {
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.OLrzqt(str, str2, java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C33129mqd.gEmmrt(str, str2, java.lang.Integer.valueOf(i), java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }
}

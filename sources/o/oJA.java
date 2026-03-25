package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oJA {
    public static boolean AEQbTJ;
    public static final oJA KWHzl = new oJA();
    public static double OLrzqt = 1.0d;
    public static java.lang.String copydefault = "FastSmoothScroll";
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double OLrzqt() {
        return OLrzqt;
    }

    private oJA() {
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (AEQbTJ) {
            pUU.EZpvd(copydefault, str);
        }
    }
}

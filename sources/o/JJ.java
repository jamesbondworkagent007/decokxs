package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JJ {
    public static final JJ copydefault = new JJ();
    public static final InterfaceC5243Kf KWHzl = new JI();
    public static final MM OLrzqt = new MB();
    public static final InterfaceC5243Kf EZpvd = new JG();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5243Kf AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC5243Kf EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return "identity";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MM OLrzqt() {
        return OLrzqt;
    }

    private JJ() {
    }

    public final java.io.File OLrzqt(@NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5216Je, "");
        return new java.io.File(c5216Je.zsXlph(), "events");
    }

    public final java.io.File copydefault(@NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5216Je, "");
        return new java.io.File(c5216Je.zsXlph(), "identify-intercept");
    }

    public final java.io.File AEQbTJ(@NotNull C5216Je c5216Je) {
        Intrinsics.checkNotNullParameter(c5216Je, "");
        return c5216Je.zsXlph();
    }
}

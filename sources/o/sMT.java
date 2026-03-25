package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMT {
    public static C44373sNk EZpvd;
    public static final sMT OLrzqt = new sMT();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull C44373sNk c44373sNk) {
        Intrinsics.checkNotNullParameter(c44373sNk, "");
        EZpvd = c44373sNk;
    }

    private sMT() {
    }

    public final C44373sNk copydefault() {
        C44373sNk c44373sNk = EZpvd;
        if (c44373sNk != null) {
            return c44373sNk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void OLrzqt(@NotNull C44373sNk c44373sNk) {
        Intrinsics.checkNotNullParameter(c44373sNk, "");
        EZpvd(c44373sNk);
    }

    public final void OLrzqt() {
        pUU.KWHzl("WSPushNotificationListener", "on attach listener");
        sDZ.AEQbTJ.isConnected().OLrzqt(copydefault());
    }

    public final void AEQbTJ() {
        pUU.KWHzl("WSPushNotificationListener", "on detach listener");
        sDZ.AEQbTJ.isConnected().AEQbTJ(copydefault());
    }
}

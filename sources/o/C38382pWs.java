package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pWs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38382pWs {
    public static final C38382pWs copydefault = new C38382pWs();

    private C38382pWs() {
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode == 2552066) {
            str.equals("SPOT");
        } else if (iHashCode != 2558355) {
            if (iHashCode == 214415088 && str.equals("FUTURES")) {
                return "2";
            }
        } else if (str.equals("SWAP")) {
            return "3";
        }
        return "1";
    }
}

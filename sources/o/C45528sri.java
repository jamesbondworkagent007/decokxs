package o;

import com.okinc.p2p.api.OtcRouteConst;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sri, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45528sri {
    public static final C45529srj EZpvd() {
        return new C45529srj();
    }

    public static final void OLrzqt(@NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        interfaceC43237rlW.copydefault(new C45527srh("recent_activities"), C56392yDr.copydefault(new Function0() { // from class: o.srl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45528sri.EZpvd();
            }
        }));
    }

    public static final int EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -940242166) {
            if (iHashCode != 109294) {
                if (iHashCode == 1554454174) {
                    str.equals("deposit");
                }
            } else if (str.equals(OtcRouteConst.P2P)) {
                return 2;
            }
        } else if (str.equals("withdraw")) {
            return 1;
        }
        return 0;
    }
}

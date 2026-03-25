package o;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54586xNw implements InterfaceC54580xNq {
    public static final int AEQbTJ;
    public static final C54586xNw OLrzqt = new C54586xNw();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.xNu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54586xNw.AEQbTJ();
        }
    });
    public static final AtomicLong KWHzl = new AtomicLong(0);
    public static final long copydefault = 5000;

    private C54586xNw() {
    }

    static {
        pUU.copydefault("TradeCeDefiManager", "TradeCeDefiManager init");
        AEQbTJ = 8;
    }

    public static final xND AEQbTJ() {
        return (xND) C43251rlk.copydefault(xND.class);
    }

    public final xND OLrzqt() {
        return (xND) EZpvd.getValue();
    }

    public boolean EZpvd() {
        C55697xoo c55697xoo = C55697xoo.OLrzqt;
        if (!c55697xoo.isConnected()) {
            return true;
        }
        boolean zDjBIcL = OLrzqt().djBIcL();
        boolean zEZpvd = Intrinsics.EZpvd(OLrzqt().OLrzqt(), java.lang.Boolean.TRUE);
        boolean zValues = c55697xoo.values();
        boolean z = !c55697xoo.AkhnZx();
        pUU.KWHzl("TradeCeDefiManager", "isShowDexTrade - isSupportDex: " + zDjBIcL + ", isPro: " + zEZpvd + ", isMainAccount: " + zValues + ", notDemoTrading: " + z);
        boolean z2 = zDjBIcL && zEZpvd && zValues && z;
        pUU.KWHzl("TradeCeDefiManager", "isShowDexTrade - final result: " + z2);
        return z2;
    }
}

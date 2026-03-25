package o;

import com.okinc.trade.manager.common.position.TradePositionManager;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uwQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49853uwQ {

    /* JADX INFO: renamed from: o.uwQ$ActionBar */
    /* JADX INFO: loaded from: classes24.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradePositionManager.MarginModeType.values().length];
            try {
                iArr[TradePositionManager.MarginModeType.CROSSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradePositionManager.MarginModeType.ISOLATED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String AEQbTJ(@NotNull TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        int i = ActionBar.KWHzl[marginModeType.ordinal()];
        if (i != 1) {
            return i != 2 ? "cash" : C33070mpX.AYXKKw(C55688xof.Application.pauseLocationServices);
        }
        return C33070mpX.AYXKKw(C55688xof.Application.gBtXYZ);
    }

    public static final java.lang.String EZpvd(@NotNull TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        int i = ActionBar.KWHzl[marginModeType.ordinal()];
        return i != 1 ? i != 2 ? "cash" : "isolated" : "cross";
    }
}

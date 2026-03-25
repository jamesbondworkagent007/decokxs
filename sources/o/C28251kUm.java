package o;

import com.okinc.business.dex.api.bean.TradeParam;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28251kUm {
    public final java.lang.String AEQbTJ;
    public final android.os.Bundle KWHzl;
    public final TradeParam OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28251kUm copy$default(C28251kUm c28251kUm, java.lang.String str, android.os.Bundle bundle, TradeParam tradeParam, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c28251kUm.AEQbTJ;
        }
        if ((i & 2) != 0) {
            bundle = c28251kUm.KWHzl;
        }
        if ((i & 4) != 0) {
            tradeParam = c28251kUm.OLrzqt;
        }
        return c28251kUm.copydefault(str, bundle, tradeParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.os.Bundle AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28251kUm copydefault(@NotNull java.lang.String str, android.os.Bundle bundle, TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C28251kUm(str, bundle, tradeParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28251kUm)) {
            return false;
        }
        C28251kUm c28251kUm = (C28251kUm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c28251kUm.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c28251kUm.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c28251kUm.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        android.os.Bundle bundle = this.KWHzl;
        int iHashCode2 = bundle == null ? 0 : bundle.hashCode();
        TradeParam tradeParam = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tradeParam != null ? tradeParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingModeParam(sourceType=" + this.AEQbTJ + ", bundle=" + this.KWHzl + ", tradeParam=" + this.OLrzqt + ")";
    }

    public C28251kUm(@NotNull java.lang.String str, android.os.Bundle bundle, TradeParam tradeParam) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl = bundle;
        this.OLrzqt = tradeParam;
    }
}

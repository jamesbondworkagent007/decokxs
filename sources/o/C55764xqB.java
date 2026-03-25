package o;

import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55764xqB {
    public final java.util.List<TradePositionData> EZpvd;
    public final java.util.List<TradeUserPositionInfo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xqB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C55764xqB copy$default(C55764xqB c55764xqB, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c55764xqB.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = c55764xqB.copydefault;
        }
        return c55764xqB.OLrzqt(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TradePositionData> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55764xqB OLrzqt(@NotNull java.util.List<TradePositionData> list, @NotNull java.util.List<TradeUserPositionInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C55764xqB(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TradeUserPositionInfo> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55764xqB)) {
            return false;
        }
        C55764xqB c55764xqB = (C55764xqB) obj;
        return Intrinsics.EZpvd(this.EZpvd, c55764xqB.EZpvd) && Intrinsics.EZpvd(this.copydefault, c55764xqB.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradePosAccInfo(list=" + this.EZpvd + ", accList=" + this.copydefault + ")";
    }

    public C55764xqB(@NotNull java.util.List<TradePositionData> list, @NotNull java.util.List<TradeUserPositionInfo> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.copydefault = list2;
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.BuySellTradeType;

/* JADX INFO: renamed from: o.Ary, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3760Ary {
    public static final int $stable = 8;
    public java.lang.String EZpvd;
    public C3679AqW KWHzl;
    public BuySellTradeType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3760Ary copy$default(C3760Ary c3760Ary, C3679AqW c3679AqW, java.lang.String str, BuySellTradeType buySellTradeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3679AqW = c3760Ary.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c3760Ary.EZpvd;
        }
        if ((i & 4) != 0) {
            buySellTradeType = c3760Ary.copydefault;
        }
        return c3760Ary.AEQbTJ(c3679AqW, str, buySellTradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3760Ary AEQbTJ(@NotNull C3679AqW c3679AqW, @NotNull java.lang.String str, BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(c3679AqW, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3760Ary(c3679AqW, str, buySellTradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3679AqW KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellTradeType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3760Ary)) {
            return false;
        }
        C3760Ary c3760Ary = (C3760Ary) obj;
        return Intrinsics.EZpvd(this.KWHzl, c3760Ary.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c3760Ary.EZpvd) && this.copydefault == c3760Ary.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        BuySellTradeType buySellTradeType = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (buySellTradeType == null ? 0 : buySellTradeType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellOrderDetailState(content=" + this.KWHzl + ", orderId=" + this.EZpvd + ", tradeType=" + this.copydefault + ")";
    }

    public C3760Ary(@NotNull C3679AqW c3679AqW, @NotNull java.lang.String str, BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(c3679AqW, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = c3679AqW;
        this.EZpvd = str;
        this.copydefault = buySellTradeType;
    }
}

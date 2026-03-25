package o;

import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.trader.domain.model.Traders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.him, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22620him implements InterfaceC22618hik {
    public final Traders EZpvd;
    public final int KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22620him copy$default(C22620him c22620him, int i, int i2, Traders traders, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c22620him.KWHzl;
        }
        if ((i3 & 2) != 0) {
            i2 = c22620him.copydefault;
        }
        if ((i3 & 4) != 0) {
            traders = c22620him.EZpvd;
        }
        return c22620him.copydefault(i, i2, traders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Traders EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC22618hik
    public int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22620him copydefault(int i, int i2, @NotNull Traders traders) {
        Intrinsics.checkNotNullParameter(traders, "");
        return new C22620him(i, i2, traders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22620him)) {
            return false;
        }
        C22620him c22620him = (C22620him) obj;
        return this.KWHzl == c22620him.KWHzl && this.copydefault == c22620him.copydefault && Intrinsics.EZpvd(this.EZpvd, c22620him.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NavigateEventTraderDetail(primaryTab=" + this.KWHzl + ", secondaryTab=" + this.copydefault + ", traders=" + this.EZpvd + ")";
    }

    public C22620him(int i, int i2, @NotNull Traders traders) {
        Intrinsics.checkNotNullParameter(traders, "");
        this.KWHzl = i;
        this.copydefault = i2;
        this.EZpvd = traders;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 int)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE 
  (wrap:com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType:0x0004: SGET  A[WRAPPED] (LINE:117) com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment.Companion.SubChartTabType.TRADER com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment$Companion$SubChartTabType)
 VIRTUAL call: java.lang.Enum.ordinal():int A[MD:():int (c), WRAPPED] (LINE:117)) : (r2v0 int))
  (r3v0 com.okinc.business.market.features.trader.domain.model.Traders)
 A[MD:(int, int, com.okinc.business.market.features.trader.domain.model.Traders):void (m)] (LINE:115) call: o.him.<init>(int, int, com.okinc.business.market.features.trader.domain.model.Traders):void type: THIS */
    public /* synthetic */ C22620him(int i, int i2, Traders traders, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? ChartDetailFragment.Companion.SubChartTabType.TRADER.ordinal() : i2, traders);
    }
}

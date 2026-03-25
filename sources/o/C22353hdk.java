package o;

import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22353hdk {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final TradingType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C22353hdk copy$default(C22353hdk c22353hdk, TradingType tradingType, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradingType = c22353hdk.OLrzqt;
        }
        if ((i & 2) != 0) {
            z = c22353hdk.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z2 = c22353hdk.EZpvd;
        }
        return c22353hdk.AEQbTJ(tradingType, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22353hdk AEQbTJ(@NotNull TradingType tradingType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        return new C22353hdk(tradingType, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingType KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22353hdk)) {
            return false;
        }
        C22353hdk c22353hdk = (C22353hdk) obj;
        return this.OLrzqt == c22353hdk.OLrzqt && this.AEQbTJ == c22353hdk.AEQbTJ && this.EZpvd == c22353hdk.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingModeItemData(tradingType=" + this.OLrzqt + ", isEnable=" + this.AEQbTJ + ", clickable=" + this.EZpvd + ")";
    }

    public C22353hdk(@NotNull TradingType tradingType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(tradingType, "");
        this.OLrzqt = tradingType;
        this.AEQbTJ = z;
        this.EZpvd = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.business.trade.features.home.domain.model.TradingType)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
 A[MD:(com.okinc.business.trade.features.home.domain.model.TradingType, boolean, boolean):void (m)] (LINE:5) call: o.hdk.<init>(com.okinc.business.trade.features.home.domain.model.TradingType, boolean, boolean):void type: THIS */
    public /* synthetic */ C22353hdk(TradingType tradingType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradingType, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
    }
}

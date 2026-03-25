package o;

import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41468qrQ {
    public final InterfaceC41640qud EZpvd;
    public final RawInstrumentIsolatedStrategy KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41468qrQ copy$default(C41468qrQ c41468qrQ, InterfaceC41640qud interfaceC41640qud, boolean z, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC41640qud = c41468qrQ.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c41468qrQ.copydefault;
        }
        if ((i & 4) != 0) {
            rawInstrumentIsolatedStrategy = c41468qrQ.KWHzl;
        }
        return c41468qrQ.OLrzqt(interfaceC41640qud, z, rawInstrumentIsolatedStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC41640qud AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawInstrumentIsolatedStrategy EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41468qrQ OLrzqt(@NotNull InterfaceC41640qud interfaceC41640qud, boolean z, @NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy) {
        Intrinsics.checkNotNullParameter(interfaceC41640qud, "");
        Intrinsics.checkNotNullParameter(rawInstrumentIsolatedStrategy, "");
        return new C41468qrQ(interfaceC41640qud, z, rawInstrumentIsolatedStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41468qrQ)) {
            return false;
        }
        C41468qrQ c41468qrQ = (C41468qrQ) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41468qrQ.EZpvd) && this.copydefault == c41468qrQ.copydefault && this.KWHzl == c41468qrQ.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + this.KWHzl.hashCode();
    }

    public C41468qrQ(@NotNull InterfaceC41640qud interfaceC41640qud, boolean z, @NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy) {
        Intrinsics.checkNotNullParameter(interfaceC41640qud, "");
        Intrinsics.checkNotNullParameter(rawInstrumentIsolatedStrategy, "");
        this.EZpvd = interfaceC41640qud;
        this.copydefault = z;
        this.KWHzl = rawInstrumentIsolatedStrategy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.qud)
  (r2v0 boolean)
  (wrap:com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy:0x0004: SGET  A[WRAPPED] (LINE:31) com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy) : (r3v0 com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy))
 A[MD:(o.qud, boolean, com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy):void (m)] (LINE:28) call: o.qrQ.<init>(o.qud, boolean, com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy):void type: THIS */
    public /* synthetic */ C41468qrQ(InterfaceC41640qud interfaceC41640qud, boolean z, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41640qud, z, (i & 4) != 0 ? RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING : rawInstrumentIsolatedStrategy);
    }

    public java.lang.String toString() {
        return "GetAllFuturesVosPayload(isHotRankCategoryEnable=" + this.copydefault + ", isolatedStrategy=" + this.KWHzl + ")";
    }
}

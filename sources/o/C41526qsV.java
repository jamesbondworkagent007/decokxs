package o;

import com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41526qsV {
    public final RawInstrumentIsolatedStrategy AEQbTJ;
    public final InterfaceC41651quo EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C41526qsV copy$default(C41526qsV c41526qsV, InterfaceC41651quo interfaceC41651quo, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC41651quo = c41526qsV.EZpvd;
        }
        if ((i & 2) != 0) {
            rawInstrumentIsolatedStrategy = c41526qsV.AEQbTJ;
        }
        return c41526qsV.EZpvd(interfaceC41651quo, rawInstrumentIsolatedStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawInstrumentIsolatedStrategy AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41526qsV EZpvd(@NotNull InterfaceC41651quo interfaceC41651quo, @NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy) {
        Intrinsics.checkNotNullParameter(interfaceC41651quo, "");
        Intrinsics.checkNotNullParameter(rawInstrumentIsolatedStrategy, "");
        return new C41526qsV(interfaceC41651quo, rawInstrumentIsolatedStrategy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RawInstrumentIsolatedStrategy KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC41651quo copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41526qsV)) {
            return false;
        }
        C41526qsV c41526qsV = (C41526qsV) obj;
        return Intrinsics.EZpvd(this.EZpvd, c41526qsV.EZpvd) && this.AEQbTJ == c41526qsV.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetAllSpotVosPayload(voFactory=" + this.EZpvd + ", isolatedStrategy=" + this.AEQbTJ + ")";
    }

    public C41526qsV(@NotNull InterfaceC41651quo interfaceC41651quo, @NotNull RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy) {
        Intrinsics.checkNotNullParameter(interfaceC41651quo, "");
        Intrinsics.checkNotNullParameter(rawInstrumentIsolatedStrategy, "");
        this.EZpvd = interfaceC41651quo;
        this.AEQbTJ = rawInstrumentIsolatedStrategy;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.quo)
  (wrap:com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy:0x0004: SGET  A[WRAPPED] (LINE:29) com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy) : (r2v0 com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy))
 A[MD:(o.quo, com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy):void (m)] (LINE:27) call: o.qsV.<init>(o.quo, com.okinc.market.quotation.domain.util.RawInstrumentIsolatedStrategy):void type: THIS */
    public /* synthetic */ C41526qsV(InterfaceC41651quo interfaceC41651quo, RawInstrumentIsolatedStrategy rawInstrumentIsolatedStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC41651quo, (i & 2) != 0 ? RawInstrumentIsolatedStrategy.DEFAULT_DISPLAYING : rawInstrumentIsolatedStrategy);
    }
}

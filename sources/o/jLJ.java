package o;

import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.market.common.bean.PayloadPeriod;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jLJ extends AbstractC49408unw<jLJ> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public jLI AEQbTJ;
    public java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> EZpvd;
    public PayloadPeriod KWHzl;
    public ValuationCurrency copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jLJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jLJ copy$default(jLJ jlj, java.util.HashMap map, jLI jli, ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = jlj.EZpvd;
        }
        if ((i & 2) != 0) {
            jli = jlj.AEQbTJ;
        }
        if ((i & 4) != 0) {
            valuationCurrency = jlj.copydefault;
        }
        if ((i & 8) != 0) {
            payloadPeriod = jlj.KWHzl;
        }
        return jlj.OLrzqt(map, jli, valuationCurrency, payloadPeriod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jLI AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.EZpvd = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull jLI jli) {
        Intrinsics.checkNotNullParameter(jli, "");
        this.AEQbTJ = jli;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ValuationCurrency valuationCurrency) {
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        this.copydefault = valuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValuationCurrency OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jLJ OLrzqt(@NotNull java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> map, @NotNull jLI jli, @NotNull ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jli, "");
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        return new jLJ(map, jli, valuationCurrency, payloadPeriod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jLJ)) {
            return false;
        }
        jLJ jlj = (jLJ) obj;
        return Intrinsics.EZpvd(this.EZpvd, jlj.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, jlj.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, jlj.copydefault) && this.KWHzl == jlj.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        PayloadPeriod payloadPeriod = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (payloadPeriod == null ? 0 : payloadPeriod.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SpotAnalysisUiState(componentStateMap=" + this.EZpvd + ", accountState=" + this.AEQbTJ + ", valuationCurrency=" + this.copydefault + ", timePeriod=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.util.HashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.HashMap:0x0006: INVOKE (wrap:o.jLJ$TaskDescription:0x0004: SGET  A[WRAPPED] o.jLJ.Companion o.jLJ$TaskDescription) VIRTUAL call: o.jLJ.TaskDescription.AEQbTJ():java.util.HashMap A[MD:():java.util.HashMap<java.lang.Integer, o.unL<kotlin.Unit>> (m), WRAPPED] (LINE:19)) : (r2v0 java.util.HashMap))
  (wrap:o.jLI:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.jLI:0x0012: CONSTRUCTOR (null java.util.List), (null java.lang.String), (3 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: o.jLI.<init>(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 o.jLI))
  (r4v0 com.okinc.assets.api.model.ValuationCurrency)
  (wrap:com.okinc.market.common.bean.PayloadPeriod:?: TERNARY null = ((wrap:int:0x0015: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.market.common.bean.PayloadPeriod) : (r5v0 com.okinc.market.common.bean.PayloadPeriod))
 A[MD:(java.util.HashMap<java.lang.Integer, o.unL<kotlin.Unit>>, o.jLI, com.okinc.assets.api.model.ValuationCurrency, com.okinc.market.common.bean.PayloadPeriod):void (m)] (LINE:18) call: o.jLJ.<init>(java.util.HashMap, o.jLI, com.okinc.assets.api.model.ValuationCurrency, com.okinc.market.common.bean.PayloadPeriod):void type: THIS */
    public /* synthetic */ jLJ(java.util.HashMap map, jLI jli, ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Companion.AEQbTJ() : map, (i & 2) != 0 ? new jLI(null, null, 3, null) : jli, valuationCurrency, (i & 8) != 0 ? null : payloadPeriod);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jLJ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> AEQbTJ() {
            Unit unit = Unit.INSTANCE;
            return C56424yEw.AYXKKw(C56390yDp.OLrzqt(0, new InterfaceC49371unL.ActionBar(unit)), C56390yDp.OLrzqt(1, new InterfaceC49371unL.ActionBar(unit)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jLJ(@NotNull java.util.HashMap<java.lang.Integer, InterfaceC49371unL<Unit>> map, @NotNull jLI jli, @NotNull ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod) {
        super(new Function1() { // from class: o.jLN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jLJ.AEQbTJ((jLJ) obj);
            }
        });
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jli, "");
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        this.EZpvd = map;
        this.AEQbTJ = jli;
        this.copydefault = valuationCurrency;
        this.KWHzl = payloadPeriod;
        this.EZpvd = Companion.AEQbTJ();
    }

    public static final jLJ AEQbTJ(jLJ jlj) {
        Intrinsics.checkNotNullParameter(jlj, "");
        return copy$default(jlj, null, null, null, null, 15, null);
    }
}

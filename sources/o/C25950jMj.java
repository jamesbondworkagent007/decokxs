package o;

import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25950jMj extends AbstractC49408unw<C25950jMj> {
    public boolean AEQbTJ;
    public ValuationCurrency EZpvd;
    public java.lang.String KWHzl;
    public InterfaceC49371unL<Unit> OLrzqt;
    public InterfaceC49371unL<CumulativePnlPo> copydefault;
    public AnalysisOverviewPeriod gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.jMj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25950jMj copy$default(C25950jMj c25950jMj, boolean z, java.lang.String str, ValuationCurrency valuationCurrency, AnalysisOverviewPeriod analysisOverviewPeriod, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25950jMj.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c25950jMj.KWHzl;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            valuationCurrency = c25950jMj.EZpvd;
        }
        ValuationCurrency valuationCurrency2 = valuationCurrency;
        if ((i & 8) != 0) {
            analysisOverviewPeriod = c25950jMj.gEmmrt;
        }
        AnalysisOverviewPeriod analysisOverviewPeriod2 = analysisOverviewPeriod;
        if ((i & 16) != 0) {
            interfaceC49371unL = c25950jMj.copydefault;
        }
        InterfaceC49371unL interfaceC49371unL3 = interfaceC49371unL;
        if ((i & 32) != 0) {
            interfaceC49371unL2 = c25950jMj.OLrzqt;
        }
        return c25950jMj.copydefault(z, str2, valuationCurrency2, analysisOverviewPeriod2, interfaceC49371unL3, interfaceC49371unL2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<Unit> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AnalysisOverviewPeriod analysisOverviewPeriod) {
        Intrinsics.checkNotNullParameter(analysisOverviewPeriod, "");
        this.gEmmrt = analysisOverviewPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.copydefault = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnalysisOverviewPeriod EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValuationCurrency KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ValuationCurrency valuationCurrency) {
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        this.EZpvd = valuationCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25950jMj copydefault(boolean z, java.lang.String str, @NotNull ValuationCurrency valuationCurrency, @NotNull AnalysisOverviewPeriod analysisOverviewPeriod, @NotNull InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL2) {
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        Intrinsics.checkNotNullParameter(analysisOverviewPeriod, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        return new C25950jMj(z, str, valuationCurrency, analysisOverviewPeriod, interfaceC49371unL, interfaceC49371unL2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<CumulativePnlPo> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.OLrzqt = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25950jMj)) {
            return false;
        }
        C25950jMj c25950jMj = (C25950jMj) obj;
        return this.AEQbTJ == c25950jMj.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c25950jMj.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c25950jMj.EZpvd) && this.gEmmrt == c25950jMj.gEmmrt && Intrinsics.EZpvd(this.copydefault, c25950jMj.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c25950jMj.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.KWHzl;
        return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SpotAnalysisCumulativePnlUiState(isShowPnlIcon=" + this.AEQbTJ + ", uid=" + this.KWHzl + ", valuationCurrency=" + this.EZpvd + ", valuationPeriod=" + this.gEmmrt + ", cumulativePnlPo=" + this.copydefault + ", pageState=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (r12v0 com.okinc.assets.api.model.ValuationCurrency)
  (wrap:com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0016: SGET  A[WRAPPED] (LINE:13) com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod.PERIOD_30D com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod) : (r13v0 com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0019: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: o.unL.ActionBar.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r14v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0025: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: CONSTRUCTOR (wrap:kotlin.Unit:0x002b: SGET  A[WRAPPED] kotlin.Unit.INSTANCE kotlin.Unit) A[MD:(T):void (m), WRAPPED] (LINE:15) call: o.unL.ActionBar.<init>(java.lang.Object):void type: CONSTRUCTOR) : (r15v0 o.unL))
 A[MD:(boolean, java.lang.String, com.okinc.assets.api.model.ValuationCurrency, com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod, o.unL<com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo>, o.unL<kotlin.Unit>):void (m)] (LINE:9) call: o.jMj.<init>(boolean, java.lang.String, com.okinc.assets.api.model.ValuationCurrency, com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod, o.unL, o.unL):void type: THIS */
    public /* synthetic */ C25950jMj(boolean z, java.lang.String str, ValuationCurrency valuationCurrency, AnalysisOverviewPeriod analysisOverviewPeriod, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : str, valuationCurrency, (i & 8) != 0 ? AnalysisOverviewPeriod.PERIOD_30D : analysisOverviewPeriod, (i & 16) != 0 ? new InterfaceC49371unL.ActionBar(null, 1, null) : interfaceC49371unL, (i & 32) != 0 ? new InterfaceC49371unL.ActionBar(Unit.INSTANCE) : interfaceC49371unL2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25950jMj(boolean z, java.lang.String str, @NotNull ValuationCurrency valuationCurrency, @NotNull AnalysisOverviewPeriod analysisOverviewPeriod, @NotNull InterfaceC49371unL<CumulativePnlPo> interfaceC49371unL, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL2) {
        super(new Function1() { // from class: o.jMk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25950jMj.OLrzqt((C25950jMj) obj);
            }
        });
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        Intrinsics.checkNotNullParameter(analysisOverviewPeriod, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        this.AEQbTJ = z;
        this.KWHzl = str;
        this.EZpvd = valuationCurrency;
        this.gEmmrt = analysisOverviewPeriod;
        this.copydefault = interfaceC49371unL;
        this.OLrzqt = interfaceC49371unL2;
    }

    public static final C25950jMj OLrzqt(C25950jMj c25950jMj) {
        Intrinsics.checkNotNullParameter(c25950jMj, "");
        return copy$default(c25950jMj, false, null, null, null, null, null, 63, null);
    }
}

package o;

import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType;
import com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo;
import com.okinc.core.util.SPUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25973jNf extends AbstractC49408unw<C25973jNf> {
    public ValuationCurrency AYXKKw;
    public PnlDetailPageType AhwBna;
    public InterfaceC49371unL<PnlDetailVo> EZpvd;
    public InterfaceC49371unL<Unit> KWHzl;
    public boolean OLrzqt;
    public InterfaceC49371unL<PnlDetailVo> copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.jNf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25973jNf copy$default(C25973jNf c25973jNf, boolean z, PnlDetailPageType pnlDetailPageType, ValuationCurrency valuationCurrency, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25973jNf.OLrzqt;
        }
        if ((i & 2) != 0) {
            pnlDetailPageType = c25973jNf.AhwBna;
        }
        PnlDetailPageType pnlDetailPageType2 = pnlDetailPageType;
        if ((i & 4) != 0) {
            valuationCurrency = c25973jNf.AYXKKw;
        }
        ValuationCurrency valuationCurrency2 = valuationCurrency;
        if ((i & 8) != 0) {
            interfaceC49371unL = c25973jNf.EZpvd;
        }
        InterfaceC49371unL interfaceC49371unL4 = interfaceC49371unL;
        if ((i & 16) != 0) {
            interfaceC49371unL2 = c25973jNf.copydefault;
        }
        InterfaceC49371unL interfaceC49371unL5 = interfaceC49371unL2;
        if ((i & 32) != 0) {
            interfaceC49371unL3 = c25973jNf.KWHzl;
        }
        return c25973jNf.copydefault(z, pnlDetailPageType2, valuationCurrency2, interfaceC49371unL4, interfaceC49371unL5, interfaceC49371unL3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<PnlDetailVo> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.copydefault = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<PnlDetailVo> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull InterfaceC49371unL<Unit> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.KWHzl = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull PnlDetailPageType pnlDetailPageType) {
        Intrinsics.checkNotNullParameter(pnlDetailPageType, "");
        this.AhwBna = pnlDetailPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC49371unL<Unit> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL) {
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        this.EZpvd = interfaceC49371unL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnlDetailPageType copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25973jNf copydefault(boolean z, @NotNull PnlDetailPageType pnlDetailPageType, @NotNull ValuationCurrency valuationCurrency, @NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL, @NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL2, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL3) {
        Intrinsics.checkNotNullParameter(pnlDetailPageType, "");
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
        return new C25973jNf(z, pnlDetailPageType, valuationCurrency, interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25973jNf)) {
            return false;
        }
        C25973jNf c25973jNf = (C25973jNf) obj;
        return this.OLrzqt == c25973jNf.OLrzqt && this.AhwBna == c25973jNf.AhwBna && Intrinsics.EZpvd(this.AYXKKw, c25973jNf.AYXKKw) && Intrinsics.EZpvd(this.EZpvd, c25973jNf.EZpvd) && Intrinsics.EZpvd(this.copydefault, c25973jNf.copydefault) && Intrinsics.EZpvd(this.KWHzl, c25973jNf.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SpotAnalysisPnlDetailUiState(isSelectedHideSmallAssetsCheckBox=" + this.OLrzqt + ", pnlDetailPageType=" + this.AhwBna + ", valuationCurrency=" + this.AYXKKw + ", currentHoldingsPnlDetail=" + this.EZpvd + ", allTimePnlDetail=" + this.copydefault + ", pageState=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType:0x000a: SGET  A[WRAPPED] (LINE:11) com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType.CURRENT_HOLDINGS com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType) : (r9v0 com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType))
  (r10v0 com.okinc.assets.api.model.ValuationCurrency)
  (wrap:o.unL:0x0018: TERNARY null = ((wrap:int:0x000d: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0015: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 o.unL))
  (wrap:o.unL:0x0022: TERNARY null = ((wrap:int:0x0019: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x001f: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x002b: CONSTRUCTOR (wrap:kotlin.Unit:0x0029: SGET  A[WRAPPED] kotlin.Unit.INSTANCE kotlin.Unit) A[MD:(T):void (m), WRAPPED] (LINE:15) call: o.unL.ActionBar.<init>(java.lang.Object):void type: CONSTRUCTOR) : (r13v0 o.unL))
 A[MD:(boolean, com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType, com.okinc.assets.api.model.ValuationCurrency, o.unL<com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo>, o.unL<com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailVo>, o.unL<kotlin.Unit>):void (m)] (LINE:9) call: o.jNf.<init>(boolean, com.okinc.business.market.features.analysis.spot.sub.pnl_detail.ui.model.PnlDetailPageType, com.okinc.assets.api.model.ValuationCurrency, o.unL, o.unL, o.unL):void type: THIS */
    public /* synthetic */ C25973jNf(boolean z, PnlDetailPageType pnlDetailPageType, ValuationCurrency valuationCurrency, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? PnlDetailPageType.CURRENT_HOLDINGS : pnlDetailPageType, valuationCurrency, (i & 8) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 16) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 32) != 0 ? new InterfaceC49371unL.ActionBar(Unit.INSTANCE) : interfaceC49371unL3);
    }

    /* JADX INFO: renamed from: o.jNf$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jNf.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25973jNf(boolean z, @NotNull PnlDetailPageType pnlDetailPageType, @NotNull ValuationCurrency valuationCurrency, @NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL, @NotNull InterfaceC49371unL<PnlDetailVo> interfaceC49371unL2, @NotNull InterfaceC49371unL<Unit> interfaceC49371unL3) {
        super(new Function1() { // from class: o.jNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25973jNf.AEQbTJ((C25973jNf) obj);
            }
        });
        Intrinsics.checkNotNullParameter(pnlDetailPageType, "");
        Intrinsics.checkNotNullParameter(valuationCurrency, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
        Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
        this.OLrzqt = z;
        this.AhwBna = pnlDetailPageType;
        this.AYXKKw = valuationCurrency;
        this.EZpvd = interfaceC49371unL;
        this.copydefault = interfaceC49371unL2;
        this.KWHzl = interfaceC49371unL3;
        this.OLrzqt = KWHzl();
    }

    public static final C25973jNf AEQbTJ(C25973jNf c25973jNf) {
        Intrinsics.checkNotNullParameter(c25973jNf, "");
        return copy$default(c25973jNf, false, null, null, null, null, null, 63, null);
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("MARKET_IS_SELECTED_HIDE_SMALL_ASSETS", false);
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("MARKET_IS_SELECTED_HIDE_SMALL_ASSETS", java.lang.Boolean.valueOf(z));
    }
}

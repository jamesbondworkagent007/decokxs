package com.okinc.business.market.features.analysis.futures.root.viewmodel;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ViewModelKt;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.common.ui.model.AnalysisOverviewPeriod;
import com.okinc.business.market.features.analysis.futures.root.FundingFeeType;
import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import com.okinc.market.common.bean.PayloadPeriod;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C25844jIl;
import o.C25876jJq;
import o.C25915jLb;
import o.C25922jLi;
import o.C25937jLx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47278tmy;
import o.InterfaceC49371unL;
import o.InterfaceC8218ayb;
import o.InterfaceC8222ayf;
import o.InterfaceC8225ayi;
import o.jHT;
import o.jHV;
import o.jIU;
import o.jKM;
import o.jLI;
import o.jLS;
import o.jLU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisViewModel extends AbstractC49411unz<StateListAnimator> {
    public final jLS AYXKKw;
    public FuturesAnalysisRankingPnlType AhwBna;
    public final C25922jLi AkhnZx;
    public FundingFeeType DbNXlk;
    public AnalysisOverviewPeriod EZpvd;
    public final InterfaceC8225ayi KWHzl;
    public Date OLrzqt;
    public final InterfaceC8218ayb copydefault;
    public final jIU djBIcL;
    public final InterfaceC47278tmy fJNWhG;
    public final List<FundingFeeType> fetchVPNInfo;
    public FuturesAnalysisRankingPeriod gEmmrt;
    public final jKM isConnected;
    public final jLU valueOf;
    public final jHV values;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8218ayb AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull FundingFeeType fundingFeeType) {
        Intrinsics.checkNotNullParameter(fundingFeeType, "");
        this.DbNXlk = fundingFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingFeeType> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeeType AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8225ayi KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnalysisOverviewPeriod OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesAnalysisRankingPeriod copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesAnalysisRankingPnlType valueOf() {
        return this.AhwBna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public FuturesAnalysisViewModel(@NotNull jKM jkm, @NotNull jIU jiu, @NotNull C25922jLi c25922jLi, @NotNull jHV jhv, @NotNull jLS jls, @NotNull jLU jlu, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull InterfaceC8225ayi interfaceC8225ayi, @NotNull InterfaceC8218ayb interfaceC8218ayb) {
        super(new StateListAnimator(0L, 0L, null, null, null, null, interfaceC8218ayb.OLrzqt().getValue(), null, false, 447, null));
        Intrinsics.checkNotNullParameter(jkm, "");
        Intrinsics.checkNotNullParameter(jiu, "");
        Intrinsics.checkNotNullParameter(c25922jLi, "");
        Intrinsics.checkNotNullParameter(jhv, "");
        Intrinsics.checkNotNullParameter(jls, "");
        Intrinsics.checkNotNullParameter(jlu, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(interfaceC8225ayi, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        this.isConnected = jkm;
        this.djBIcL = jiu;
        this.AkhnZx = c25922jLi;
        this.values = jhv;
        this.AYXKKw = jls;
        this.valueOf = jlu;
        this.fJNWhG = interfaceC47278tmy;
        this.KWHzl = interfaceC8225ayi;
        this.copydefault = interfaceC8218ayb;
        this.EZpvd = AnalysisOverviewPeriod.PERIOD_30D;
        this.OLrzqt = new Date();
        this.AhwBna = FuturesAnalysisRankingPnlType.NET_PNL;
        this.gEmmrt = FuturesAnalysisRankingPeriod.PERIOD_30D;
        FundingFeeType fundingFeeType = FundingFeeType.FundingFee;
        this.DbNXlk = fundingFeeType;
        this.fetchVPNInfo = yDY.gEmmrt(FundingFeeType.FundingRanking, fundingFeeType);
        djBIcL();
    }

    public static final class StateListAnimator extends AbstractC49408unw<StateListAnimator> {
        public jLI AEQbTJ;
        public PayloadPeriod AhwBna;
        public long EZpvd;
        public InterfaceC49371unL<? extends List<C25937jLx>> KWHzl;
        public InterfaceC49371unL<C25915jLb> OLrzqt;
        public InterfaceC49371unL<C25876jJq> copydefault;
        public boolean djBIcL;
        public ValuationCurrency gEmmrt;
        public long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, long j, long j2, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, jLI jli, ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, boolean z, int i, Object obj) {
            return stateListAnimator.AEQbTJ((i & 1) != 0 ? stateListAnimator.valueOf : j, (i & 2) != 0 ? stateListAnimator.EZpvd : j2, (i & 4) != 0 ? stateListAnimator.OLrzqt : interfaceC49371unL, (i & 8) != 0 ? stateListAnimator.copydefault : interfaceC49371unL2, (i & 16) != 0 ? stateListAnimator.KWHzl : interfaceC49371unL3, (i & 32) != 0 ? stateListAnimator.AEQbTJ : jli, (i & 64) != 0 ? stateListAnimator.gEmmrt : valuationCurrency, (i & 128) != 0 ? stateListAnimator.AhwBna : payloadPeriod, (i & 256) != 0 ? stateListAnimator.djBIcL : z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(long j, long j2, @NotNull InterfaceC49371unL<C25915jLb> interfaceC49371unL, @NotNull InterfaceC49371unL<C25876jJq> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL3, @NotNull jLI jli, @NotNull ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, boolean z) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(jli, "");
            Intrinsics.checkNotNullParameter(valuationCurrency, "");
            return new StateListAnimator(j, j2, interfaceC49371unL, interfaceC49371unL2, interfaceC49371unL3, jli, valuationCurrency, payloadPeriod, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final jLI AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(long j) {
            this.valueOf = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(PayloadPeriod payloadPeriod) {
            this.AhwBna = payloadPeriod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadPeriod AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<C25915jLb> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(long j) {
            this.EZpvd = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull jLI jli) {
            Intrinsics.checkNotNullParameter(jli, "");
            this.AEQbTJ = jli;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.KWHzl = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<C25876jJq> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull ValuationCurrency valuationCurrency) {
            Intrinsics.checkNotNullParameter(valuationCurrency, "");
            this.gEmmrt = valuationCurrency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull InterfaceC49371unL<C25915jLb> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.OLrzqt = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.unL<? extends java.util.List<o.jLx>>, o.unL<java.util.List<o.jLx>> */
        public final InterfaceC49371unL<List<C25937jLx>> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull InterfaceC49371unL<C25876jJq> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.djBIcL = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValuationCurrency djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.valueOf == stateListAnimator.valueOf && this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, stateListAnimator.gEmmrt) && this.AhwBna == stateListAnimator.AhwBna && this.djBIcL == stateListAnimator.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.valueOf);
            int iHashCode2 = Long.hashCode(this.EZpvd);
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = this.copydefault.hashCode();
            int iHashCode5 = this.KWHzl.hashCode();
            int iHashCode6 = this.AEQbTJ.hashCode();
            int iHashCode7 = this.gEmmrt.hashCode();
            PayloadPeriod payloadPeriod = this.AhwBna;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (payloadPeriod == null ? 0 : payloadPeriod.hashCode())) * 31) + Boolean.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FuturesAnalysisUiState(showShareAction=" + this.valueOf + ", dismissCalendarAction=" + this.EZpvd + ", overviewVo=" + this.OLrzqt + ", calendarVo=" + this.copydefault + ", rankingListVo=" + this.KWHzl + ", accountState=" + this.AEQbTJ + ", valuationCurrency=" + this.gEmmrt + ", timePeriod=" + this.AhwBna + ", showTradingFee=" + this.djBIcL + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 long))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:60) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r21v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:61) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r22v0 o.unL))
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0030: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:62) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r23v0 o.unL))
  (wrap:o.jLI:?: TERNARY null = ((wrap:int:0x003d: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: CONSTRUCTOR (null java.util.List), (null java.lang.String), (3 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:63) call: o.jLI.<init>(java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 o.jLI))
  (r25v0 com.okinc.assets.api.model.ValuationCurrency)
  (wrap:com.okinc.market.common.bean.PayloadPeriod:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.market.common.bean.PayloadPeriod) : (r26v0 com.okinc.market.common.bean.PayloadPeriod))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE (wrap:o.jIl:0x0057: SGET  A[WRAPPED] (LINE:66) o.jIl.EZpvd o.jIl) VIRTUAL call: o.jIl.AEQbTJ():boolean A[MD:():boolean (m), WRAPPED] (LINE:66)) : (r27v0 boolean))
 A[MD:(long, long, o.unL<o.jLb>, o.unL<o.jJq>, o.unL<? extends java.util.List<o.jLx>>, o.jLI, com.okinc.assets.api.model.ValuationCurrency, com.okinc.market.common.bean.PayloadPeriod, boolean):void (m)] (LINE:57) call: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel.StateListAnimator.<init>(long, long, o.unL, o.unL, o.unL, o.jLI, com.okinc.assets.api.model.ValuationCurrency, com.okinc.market.common.bean.PayloadPeriod, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(long j, long j2, InterfaceC49371unL interfaceC49371unL, InterfaceC49371unL interfaceC49371unL2, InterfaceC49371unL interfaceC49371unL3, jLI jli, ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 8) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL2, (i & 16) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL3, (i & 32) != 0 ? new jLI(null, null, 3, null) : jli, valuationCurrency, (i & 128) != 0 ? null : payloadPeriod, (i & 256) != 0 ? C25844jIl.EZpvd.AEQbTJ() : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(long j, long j2, @NotNull InterfaceC49371unL<C25915jLb> interfaceC49371unL, @NotNull InterfaceC49371unL<C25876jJq> interfaceC49371unL2, @NotNull InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL3, @NotNull jLI jli, @NotNull ValuationCurrency valuationCurrency, PayloadPeriod payloadPeriod, boolean z) {
            super(new Function1() { // from class: o.jIM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FuturesAnalysisViewModel.StateListAnimator.KWHzl((FuturesAnalysisViewModel.StateListAnimator) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL2, "");
            Intrinsics.checkNotNullParameter(interfaceC49371unL3, "");
            Intrinsics.checkNotNullParameter(jli, "");
            Intrinsics.checkNotNullParameter(valuationCurrency, "");
            this.valueOf = j;
            this.EZpvd = j2;
            this.OLrzqt = interfaceC49371unL;
            this.copydefault = interfaceC49371unL2;
            this.KWHzl = interfaceC49371unL3;
            this.AEQbTJ = jli;
            this.gEmmrt = valuationCurrency;
            this.AhwBna = payloadPeriod;
            this.djBIcL = z;
        }

        public static final StateListAnimator KWHzl(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return copy$default(stateListAnimator, 0L, 0L, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [92=4] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        FuturesAnalysisViewModel$setAccountSort$1 futuresAnalysisViewModel$setAccountSort$1;
        FuturesAnalysisViewModel futuresAnalysisViewModel;
        FuturesAnalysisViewModel futuresAnalysisViewModel2;
        Object objEZpvd;
        String str2;
        String str3;
        Object objOLrzqt;
        String str4;
        FuturesAnalysisViewModel futuresAnalysisViewModel3;
        String str5;
        if (continuation instanceof FuturesAnalysisViewModel$setAccountSort$1) {
            futuresAnalysisViewModel$setAccountSort$1 = (FuturesAnalysisViewModel$setAccountSort$1) continuation;
            int i = futuresAnalysisViewModel$setAccountSort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresAnalysisViewModel$setAccountSort$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresAnalysisViewModel$setAccountSort$1 = new FuturesAnalysisViewModel$setAccountSort$1(this, continuation);
            }
        }
        Object objOLrzqt2 = futuresAnalysisViewModel$setAccountSort$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresAnalysisViewModel$setAccountSort$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt2);
            futuresAnalysisViewModel$setAccountSort$1.L$0 = this;
            futuresAnalysisViewModel$setAccountSort$1.L$1 = str;
            futuresAnalysisViewModel$setAccountSort$1.label = 1;
            objOLrzqt2 = OLrzqt(this, futuresAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            futuresAnalysisViewModel = this;
        } else if (i2 == 1) {
            str = (String) futuresAnalysisViewModel$setAccountSort$1.L$1;
            futuresAnalysisViewModel = (FuturesAnalysisViewModel) futuresAnalysisViewModel$setAccountSort$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    futuresAnalysisViewModel2 = (FuturesAnalysisViewModel) futuresAnalysisViewModel$setAccountSort$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt2);
                    String str6 = (String) objOLrzqt2;
                    futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
                    futuresAnalysisViewModel$setAccountSort$1.L$1 = str6;
                    futuresAnalysisViewModel$setAccountSort$1.label = 4;
                    objEZpvd = futuresAnalysisViewModel2.EZpvd(futuresAnalysisViewModel$setAccountSort$1);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    str2 = str6;
                    objOLrzqt2 = objEZpvd;
                    str3 = (String) objOLrzqt2;
                    if (str2 != null) {
                        futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
                        futuresAnalysisViewModel$setAccountSort$1.L$1 = str2;
                        futuresAnalysisViewModel$setAccountSort$1.L$2 = str3;
                        futuresAnalysisViewModel$setAccountSort$1.label = 5;
                        objOLrzqt = futuresAnalysisViewModel2.OLrzqt(futuresAnalysisViewModel$setAccountSort$1);
                        if (objOLrzqt != objCopydefault) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) futuresAnalysisViewModel$setAccountSort$1.L$2;
                    str4 = (String) futuresAnalysisViewModel$setAccountSort$1.L$1;
                    futuresAnalysisViewModel3 = (FuturesAnalysisViewModel) futuresAnalysisViewModel$setAccountSort$1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt2);
                    jHT jht = (jHT) objOLrzqt2;
                    futuresAnalysisViewModel3.KWHzl.AEQbTJ((jht == null && jht.copydefault()) ? new InterfaceC8222ayf.Application(str5) : new InterfaceC8222ayf.ActionBar(str5), str4);
                    return Unit.INSTANCE;
                }
                String str7 = (String) futuresAnalysisViewModel$setAccountSort$1.L$1;
                FuturesAnalysisViewModel futuresAnalysisViewModel4 = (FuturesAnalysisViewModel) futuresAnalysisViewModel$setAccountSort$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt2);
                str2 = str7;
                futuresAnalysisViewModel2 = futuresAnalysisViewModel4;
                str3 = (String) objOLrzqt2;
                if (str2 != null && str3 != null) {
                    futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
                    futuresAnalysisViewModel$setAccountSort$1.L$1 = str2;
                    futuresAnalysisViewModel$setAccountSort$1.L$2 = str3;
                    futuresAnalysisViewModel$setAccountSort$1.label = 5;
                    objOLrzqt = futuresAnalysisViewModel2.OLrzqt(futuresAnalysisViewModel$setAccountSort$1);
                    if (objOLrzqt != objCopydefault) {
                        return objCopydefault;
                    }
                    str4 = str2;
                    futuresAnalysisViewModel3 = futuresAnalysisViewModel2;
                    str5 = str3;
                    objOLrzqt2 = objOLrzqt;
                    jHT jht2 = (jHT) objOLrzqt2;
                    if (jht2 == null) {
                        futuresAnalysisViewModel3.KWHzl.AEQbTJ((jht2 == null && jht2.copydefault()) ? new InterfaceC8222ayf.Application(str5) : new InterfaceC8222ayf.ActionBar(str5), str4);
                    }
                }
                return Unit.INSTANCE;
            }
            futuresAnalysisViewModel2 = (FuturesAnalysisViewModel) futuresAnalysisViewModel$setAccountSort$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt2);
            futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
            futuresAnalysisViewModel$setAccountSort$1.label = 3;
            objOLrzqt2 = futuresAnalysisViewModel2.AEQbTJ(futuresAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault) {
                return objCopydefault;
            }
            String str62 = (String) objOLrzqt2;
            futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
            futuresAnalysisViewModel$setAccountSort$1.L$1 = str62;
            futuresAnalysisViewModel$setAccountSort$1.label = 4;
            objEZpvd = futuresAnalysisViewModel2.EZpvd(futuresAnalysisViewModel$setAccountSort$1);
            if (objEZpvd == objCopydefault) {
            }
        }
        StateListAnimator stateListAnimator = (StateListAnimator) objOLrzqt2;
        if (!Intrinsics.EZpvd((Object) stateListAnimator.AEQbTJ().KWHzl(), (Object) str)) {
            jLI jliCopy$default = jLI.copy$default(stateListAnimator.AEQbTJ(), null, str, 1, null);
            futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel;
            futuresAnalysisViewModel$setAccountSort$1.L$1 = null;
            futuresAnalysisViewModel$setAccountSort$1.label = 2;
            if (futuresAnalysisViewModel.copydefault(jliCopy$default, futuresAnalysisViewModel$setAccountSort$1) == objCopydefault) {
                return objCopydefault;
            }
            futuresAnalysisViewModel2 = futuresAnalysisViewModel;
            futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
            futuresAnalysisViewModel$setAccountSort$1.label = 3;
            objOLrzqt2 = futuresAnalysisViewModel2.AEQbTJ(futuresAnalysisViewModel$setAccountSort$1);
            if (objOLrzqt2 == objCopydefault) {
            }
            String str622 = (String) objOLrzqt2;
            futuresAnalysisViewModel$setAccountSort$1.L$0 = futuresAnalysisViewModel2;
            futuresAnalysisViewModel$setAccountSort$1.L$1 = str622;
            futuresAnalysisViewModel$setAccountSort$1.label = 4;
            objEZpvd = futuresAnalysisViewModel2.EZpvd(futuresAnalysisViewModel$setAccountSort$1);
            if (objEZpvd == objCopydefault) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull Continuation<? super jHT> continuation) throws Throwable {
        FuturesAnalysisViewModel$getSelectedAccount$1 futuresAnalysisViewModel$getSelectedAccount$1;
        if (continuation instanceof FuturesAnalysisViewModel$getSelectedAccount$1) {
            futuresAnalysisViewModel$getSelectedAccount$1 = (FuturesAnalysisViewModel$getSelectedAccount$1) continuation;
            int i = futuresAnalysisViewModel$getSelectedAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresAnalysisViewModel$getSelectedAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresAnalysisViewModel$getSelectedAccount$1 = new FuturesAnalysisViewModel$getSelectedAccount$1(this, continuation);
            }
        }
        Object objOLrzqt = futuresAnalysisViewModel$getSelectedAccount$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresAnalysisViewModel$getSelectedAccount$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            futuresAnalysisViewModel$getSelectedAccount$1.label = 1;
            objOLrzqt = OLrzqt(this, futuresAnalysisViewModel$getSelectedAccount$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((StateListAnimator) objOLrzqt).AEQbTJ().OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AEQbTJ(@NotNull Continuation<? super String> continuation) throws Throwable {
        FuturesAnalysisViewModel$getSelectedAccountUid$1 futuresAnalysisViewModel$getSelectedAccountUid$1;
        if (continuation instanceof FuturesAnalysisViewModel$getSelectedAccountUid$1) {
            futuresAnalysisViewModel$getSelectedAccountUid$1 = (FuturesAnalysisViewModel$getSelectedAccountUid$1) continuation;
            int i = futuresAnalysisViewModel$getSelectedAccountUid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresAnalysisViewModel$getSelectedAccountUid$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresAnalysisViewModel$getSelectedAccountUid$1 = new FuturesAnalysisViewModel$getSelectedAccountUid$1(this, continuation);
            }
        }
        Object objOLrzqt = futuresAnalysisViewModel$getSelectedAccountUid$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresAnalysisViewModel$getSelectedAccountUid$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            futuresAnalysisViewModel$getSelectedAccountUid$1.label = 1;
            objOLrzqt = OLrzqt(this, futuresAnalysisViewModel$getSelectedAccountUid$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((StateListAnimator) objOLrzqt).AEQbTJ().KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull Continuation<? super String> continuation) throws Throwable {
        FuturesAnalysisViewModel$getSelectedAccountEmail$1 futuresAnalysisViewModel$getSelectedAccountEmail$1;
        if (continuation instanceof FuturesAnalysisViewModel$getSelectedAccountEmail$1) {
            futuresAnalysisViewModel$getSelectedAccountEmail$1 = (FuturesAnalysisViewModel$getSelectedAccountEmail$1) continuation;
            int i = futuresAnalysisViewModel$getSelectedAccountEmail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresAnalysisViewModel$getSelectedAccountEmail$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresAnalysisViewModel$getSelectedAccountEmail$1 = new FuturesAnalysisViewModel$getSelectedAccountEmail$1(this, continuation);
            }
        }
        Object objOLrzqt = futuresAnalysisViewModel$getSelectedAccountEmail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresAnalysisViewModel$getSelectedAccountEmail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            futuresAnalysisViewModel$getSelectedAccountEmail$1.label = 1;
            objOLrzqt = OLrzqt(this, futuresAnalysisViewModel$getSelectedAccountEmail$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        jHT jhtOLrzqt = ((StateListAnimator) objOLrzqt).AEQbTJ().OLrzqt();
        if (jhtOLrzqt != null) {
            return jhtOLrzqt.OLrzqt();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(@NotNull Continuation<? super List<jHT>> continuation) throws Throwable {
        FuturesAnalysisViewModel$getAccountList$1 futuresAnalysisViewModel$getAccountList$1;
        if (continuation instanceof FuturesAnalysisViewModel$getAccountList$1) {
            futuresAnalysisViewModel$getAccountList$1 = (FuturesAnalysisViewModel$getAccountList$1) continuation;
            int i = futuresAnalysisViewModel$getAccountList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                futuresAnalysisViewModel$getAccountList$1.label = i - Integer.MIN_VALUE;
            } else {
                futuresAnalysisViewModel$getAccountList$1 = new FuturesAnalysisViewModel$getAccountList$1(this, continuation);
            }
        }
        Object objOLrzqt = futuresAnalysisViewModel$getAccountList$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = futuresAnalysisViewModel$getAccountList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            futuresAnalysisViewModel$getAccountList$1.label = 1;
            objOLrzqt = OLrzqt(this, futuresAnalysisViewModel$getAccountList$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((StateListAnimator) objOLrzqt).AEQbTJ().AEQbTJ();
    }

    public final void djBIcL() {
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$loadAccountListData$1(this, null), 3, null), "loadAccountListData");
    }

    public final String AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) this.AYXKKw.KWHzl((Object) new jLS.StateListAnimator(this.copydefault.OLrzqt().getValue(), str));
    }

    public final void EZpvd(@NotNull AnalysisOverviewPeriod analysisOverviewPeriod) {
        Intrinsics.checkNotNullParameter(analysisOverviewPeriod, "");
        this.EZpvd = analysisOverviewPeriod;
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$loadOverviewData$1(this, analysisOverviewPeriod, null), 3, null), "loadOverviewData");
    }

    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.valueOf.EZpvd(new jLU.Application(this.copydefault.OLrzqt().getValue(), str), continuation);
    }

    public final void OLrzqt(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        this.OLrzqt = date;
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$loadCalendarData$1(this, date, null), 3, null), "loadCalendarData" + date.getTime());
    }

    public final void OLrzqt(@NotNull FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType, @NotNull FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod) {
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPnlType, "");
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPeriod, "");
        this.AhwBna = futuresAnalysisRankingPnlType;
        this.gEmmrt = futuresAnalysisRankingPeriod;
        EZpvd(BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$loadRankingListData$1(this, futuresAnalysisRankingPnlType, futuresAnalysisRankingPeriod, null), 3, null), "loadRankingListData" + futuresAnalysisRankingPnlType.name() + futuresAnalysisRankingPeriod.name());
    }

    public final Object OLrzqt(InterfaceC49371unL<C25915jLb> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateOverviewUiState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).OLrzqt((InterfaceC49371unL<C25915jLb>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object AEQbTJ(InterfaceC49371unL<C25876jJq> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateCalendarUiState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).KWHzl();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).copydefault((InterfaceC49371unL<C25876jJq>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object copydefault(InterfaceC49371unL<? extends List<C25937jLx>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateRankingUiState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).copydefault();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd((InterfaceC49371unL<? extends List<C25937jLx>>) obj2);
            }
        }, interfaceC49371unL, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object copydefault(jLI jli, Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateAccountState$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).EZpvd((jLI) obj2);
            }
        }, jli, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object EZpvd(@NotNull ValuationCurrency valuationCurrency, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateValuationCurrency$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).djBIcL();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).OLrzqt((ValuationCurrency) obj2);
            }
        }, valuationCurrency, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final Object AEQbTJ(PayloadPeriod payloadPeriod, @NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel$updateTimePeriod$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((FuturesAnalysisViewModel.StateListAnimator) obj).AhwBna();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((FuturesAnalysisViewModel.StateListAnimator) obj).AEQbTJ((PayloadPeriod) obj2);
            }
        }, payloadPeriod, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$updateShowTradingFee$1(z, this, null), 3, null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FuturesAnalysisViewModel$notifyHideCalendarMarker$1(this, null), 3, null);
    }
}

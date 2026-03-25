package com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo;
import com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC49408unw;
import o.AbstractC49411unz;
import o.C25874jJo;
import o.C25878jJs;
import o.C25879jJt;
import o.C25883jJx;
import o.C25905jKs;
import o.C33070mpX;
import o.InterfaceC49371unL;
import o.InterfaceC8218ayb;
import o.qZH;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class FundingFeeViewModel extends AbstractC49411unz<Activity> {
    public final InterfaceC8218ayb AEQbTJ;
    public FuturesAnalysisRankingPeriod EZpvd;
    public final C25879jJt KWHzl;
    public CoinPairVo OLrzqt;
    public final C25874jJo copydefault;
    public final C25878jJs gEmmrt;
    public final C25883jJx valueOf;

    /* JADX INFO: loaded from: classes15.dex */
    public static final class EmptytException extends Exception {
        public static final int $stable = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPairVo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25883jJx AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8218ayb EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25874jJo KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25879jJt OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesAnalysisRankingPeriod copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25878jJs gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public FundingFeeViewModel(@NotNull C25878jJs c25878jJs, @NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull C25874jJo c25874jJo, @NotNull C25879jJt c25879jJt, @NotNull C25883jJx c25883jJx) {
        super(new Activity(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        Intrinsics.checkNotNullParameter(c25878jJs, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(c25874jJo, "");
        Intrinsics.checkNotNullParameter(c25879jJt, "");
        Intrinsics.checkNotNullParameter(c25883jJx, "");
        this.gEmmrt = c25878jJs;
        this.AEQbTJ = interfaceC8218ayb;
        this.copydefault = c25874jJo;
        this.KWHzl = c25879jJt;
        this.valueOf = c25883jJx;
        this.EZpvd = FuturesAnalysisRankingPeriod.PERIOD_30D;
        this.OLrzqt = new CoinPairVo(null, C33070mpX.AYXKKw(qZH.PendingIntent.ORWKdN), true);
    }

    public final void copydefault(@NotNull FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod) {
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPeriod, "");
        if (futuresAnalysisRankingPeriod != this.EZpvd) {
            loadData$default(this, futuresAnalysisRankingPeriod, null, 2, null);
        }
        this.EZpvd = futuresAnalysisRankingPeriod;
    }

    public final void KWHzl(@NotNull CoinPairVo coinPairVo) {
        Intrinsics.checkNotNullParameter(coinPairVo, "");
        if (!Intrinsics.EZpvd((Object) coinPairVo.getInstId(), (Object) this.OLrzqt.getInstId())) {
            loadData$default(this, null, coinPairVo, 1, null);
        }
        this.OLrzqt = coinPairVo;
    }

    public static final class Activity extends AbstractC49408unw<Activity> {
        public String EZpvd;
        public InterfaceC49371unL<C25905jKs> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC49371unL interfaceC49371unL, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC49371unL = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.EZpvd;
            }
            return activity.KWHzl(interfaceC49371unL, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@NotNull InterfaceC49371unL<C25905jKs> interfaceC49371unL, String str) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            return new Activity(interfaceC49371unL, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC49371unL<C25905jKs> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(@NotNull InterfaceC49371unL<C25905jKs> interfaceC49371unL) {
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            String str = this.EZpvd;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FundingFeeUiState(holdFundInfo=" + this.copydefault + ", currentAccountUid=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:o.unL:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.unL:0x0008: CONSTRUCTOR (null java.lang.Object), (1 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:54) call: o.unL.StateListAnimator.<init>(java.lang.Object, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r2v0 o.unL))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(o.unL<o.jKs>, java.lang.String):void (m)] (LINE:53) call: com.okinc.business.market.features.analysis.futures.sub.funding.ui.viewmodel.FundingFeeViewModel.Activity.<init>(o.unL, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(InterfaceC49371unL interfaceC49371unL, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new InterfaceC49371unL.StateListAnimator(null, 1, null) : interfaceC49371unL, (i & 2) != 0 ? null : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC49371unL<C25905jKs> interfaceC49371unL, String str) {
            super(new Function1() { // from class: o.jKw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return FundingFeeViewModel.Activity.EZpvd((FundingFeeViewModel.Activity) obj);
                }
            });
            Intrinsics.checkNotNullParameter(interfaceC49371unL, "");
            this.copydefault = interfaceC49371unL;
            this.EZpvd = str;
        }

        public static final Activity EZpvd(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            return copy$default(activity, null, null, 3, null);
        }
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FundingFeeViewModel$setAccountUid$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void loadData$default(FundingFeeViewModel fundingFeeViewModel, FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, CoinPairVo coinPairVo, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresAnalysisRankingPeriod = fundingFeeViewModel.EZpvd;
        }
        if ((i & 2) != 0) {
            coinPairVo = fundingFeeViewModel.OLrzqt;
        }
        fundingFeeViewModel.KWHzl(futuresAnalysisRankingPeriod, coinPairVo);
    }

    public final void KWHzl(@NotNull FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, @NotNull CoinPairVo coinPairVo) {
        Intrinsics.checkNotNullParameter(futuresAnalysisRankingPeriod, "");
        Intrinsics.checkNotNullParameter(coinPairVo, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new FundingFeeViewModel$loadData$1(this, futuresAnalysisRankingPeriod, coinPairVo, null), 3, null);
    }
}

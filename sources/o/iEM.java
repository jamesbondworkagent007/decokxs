package o;

import com.okinc.business.invest_biz.data.bean.CandleResultInfo;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestmentBonusInfo;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iEM extends iYN {
    java.lang.Object AEQbTJ(long j, @NotNull InvestmentKind investmentKind, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<? extends java.util.List<CandleResultInfo>>> continuation);

    java.lang.Object AEQbTJ(long j, java.lang.Long l, java.lang.Long l2, @NotNull Continuation<? super Result<? extends java.util.List<InvestUserAssetDetailByInvestment>>> continuation);

    java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation);

    java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, long j2, boolean z, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super Result<InvestmentBonusInfo>> continuation);

    java.lang.Object KWHzl(@NotNull C23682iFk c23682iFk, boolean z, @NotNull Continuation<? super Result<C23673iFb>> continuation);

    java.lang.Object OLrzqt(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation);

    java.lang.Object copydefault(long j, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<CandleResultTvlInfo>> continuation);

    /* JADX INFO: renamed from: getPortfolio-BWLJW6A$default, reason: not valid java name */
    static /* synthetic */ java.lang.Object m8613getPortfolioBWLJW6A$default(iEM iem, long j, java.lang.Long l, java.lang.Long l2, Continuation continuation, int i, java.lang.Object obj) {
        if (obj == null) {
            return iem.AEQbTJ(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (Continuation<? super Result<? extends java.util.List<InvestUserAssetDetailByInvestment>>>) continuation);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPortfolio-BWLJW6A");
    }
}

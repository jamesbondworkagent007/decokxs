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
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailChartRepository$getChartData$1;
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailChartRepository$getChartData$2;
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailChartRepository$getProductDetails$1;
import com.okinc.business.invest_biz.mln.ui.kline.DeFiMiniDetailChartRepository$getProductDetails$2;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetBottomSheetData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iOE implements iEM {
    public final CoroutineDispatcher KWHzl;
    public final iEY OLrzqt;
    public final InterfaceC23589iBz copydefault;

    public iOE(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEY iey, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(iey, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC23589iBz;
        this.OLrzqt = iey;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iOE(@NotNull InterfaceC23589iBz interfaceC23589iBz, @NotNull iEY iey) {
        this(interfaceC23589iBz, iey, Dispatchers.getIO());
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        Intrinsics.checkNotNullParameter(iey, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(long j, @NotNull InvestmentKind investmentKind, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<? extends java.util.List<CandleResultInfo>>> continuation) {
        DeFiMiniDetailChartRepository$getChartData$1 deFiMiniDetailChartRepository$getChartData$1;
        if (continuation instanceof DeFiMiniDetailChartRepository$getChartData$1) {
            deFiMiniDetailChartRepository$getChartData$1 = (DeFiMiniDetailChartRepository$getChartData$1) continuation;
            int i = deFiMiniDetailChartRepository$getChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailChartRepository$getChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailChartRepository$getChartData$1 = new DeFiMiniDetailChartRepository$getChartData$1(this, continuation);
            }
        }
        DeFiMiniDetailChartRepository$getChartData$1 deFiMiniDetailChartRepository$getChartData$12 = deFiMiniDetailChartRepository$getChartData$1;
        java.lang.Object obj = deFiMiniDetailChartRepository$getChartData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailChartRepository$getChartData$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        DeFiMiniDetailChartRepository$getChartData$2 deFiMiniDetailChartRepository$getChartData$2 = new DeFiMiniDetailChartRepository$getChartData$2(this, j, chartInterval, investmentKind, null);
        deFiMiniDetailChartRepository$getChartData$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailChartRepository$getChartData$2, deFiMiniDetailChartRepository$getChartData$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.iEM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C23682iFk c23682iFk, boolean z, @NotNull Continuation<? super Result<C23673iFb>> continuation) {
        DeFiMiniDetailChartRepository$getProductDetails$1 deFiMiniDetailChartRepository$getProductDetails$1;
        if (continuation instanceof DeFiMiniDetailChartRepository$getProductDetails$1) {
            deFiMiniDetailChartRepository$getProductDetails$1 = (DeFiMiniDetailChartRepository$getProductDetails$1) continuation;
            int i = deFiMiniDetailChartRepository$getProductDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailChartRepository$getProductDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailChartRepository$getProductDetails$1 = new DeFiMiniDetailChartRepository$getProductDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailChartRepository$getProductDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailChartRepository$getProductDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.KWHzl;
        DeFiMiniDetailChartRepository$getProductDetails$2 deFiMiniDetailChartRepository$getProductDetails$2 = new DeFiMiniDetailChartRepository$getProductDetails$2(c23682iFk, this, null);
        deFiMiniDetailChartRepository$getProductDetails$1.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, deFiMiniDetailChartRepository$getProductDetails$2, deFiMiniDetailChartRepository$getProductDetails$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    @Override // o.iEM
    public java.lang.Object KWHzl(long j, @NotNull Continuation<? super Result<InvestmentBonusInfo>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }

    @Override // o.iEM
    public java.lang.Object AEQbTJ(long j, java.lang.Long l, java.lang.Long l2, @NotNull Continuation<? super Result<? extends java.util.List<InvestUserAssetDetailByInvestment>>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(yDY.AhwBna());
    }

    @Override // o.iEM
    public java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, long j2, boolean z, @NotNull Continuation<? super Result<InvestRedeemInitialInfo>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }

    @Override // o.iEM
    public java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }

    @Override // o.iEM
    public java.lang.Object OLrzqt(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }

    @Override // o.iEM
    public java.lang.Object copydefault(long j, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super Result<CandleResultTvlInfo>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }

    @Override // o.iYN
    public java.lang.Object copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j2, long j3, @NotNull Continuation<? super Result<AssetBottomSheetData.PositionBottomSheetData>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Not implemented")));
    }
}

package com.okinc.business.invest_biz.mln.vm;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23673iFb;
import o.C23677iFf;
import o.C23679iFh;
import o.C23682iFk;
import o.C23932iOr;
import o.C25475ixS;
import o.C25476ixT;
import o.C26536jeF;
import o.C26548jeR;
import o.C26549jeS;
import o.C26550jeT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25526iyQ;
import o.InterfaceC26557jea;
import o.InterfaceC26560jed;
import o.InterfaceC26561jee;
import o.iEM;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniProductDetailTabViewModel extends ViewModel implements InterfaceC25526iyQ {
    public final C26549jeS AEQbTJ;
    public final StateFlow<InterfaceC26560jed> AhwBna;
    public final C26548jeR EZpvd;
    public final MutableStateFlow<InterfaceC26560jed> KWHzl;
    public final C23932iOr OLrzqt;
    public final C26536jeF copydefault;
    public final C26550jeT gEmmrt;
    public final iEM valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25526iyQ
    public void KWHzl(long j, @NotNull InvestmentKind investmentKind, long j2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
    }

    @yCM
    public DeFiMiniProductDetailTabViewModel(@NotNull C23932iOr c23932iOr, @NotNull iEM iem, @NotNull C26549jeS c26549jeS, @NotNull C26548jeR c26548jeR, @NotNull C26550jeT c26550jeT, @NotNull C26536jeF c26536jeF) {
        Intrinsics.checkNotNullParameter(c23932iOr, "");
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(c26549jeS, "");
        Intrinsics.checkNotNullParameter(c26548jeR, "");
        Intrinsics.checkNotNullParameter(c26550jeT, "");
        Intrinsics.checkNotNullParameter(c26536jeF, "");
        this.OLrzqt = c23932iOr;
        this.valueOf = iem;
        this.AEQbTJ = c26549jeS;
        this.EZpvd = c26548jeR;
        this.gEmmrt = c26550jeT;
        this.copydefault = c26536jeF;
        MutableStateFlow<InterfaceC26560jed> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26560jed.Application.EZpvd);
        this.KWHzl = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<C23673iFb>> continuation) {
        DeFiMiniProductDetailTabViewModel$getProductDetails$1 deFiMiniProductDetailTabViewModel$getProductDetails$1;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$getProductDetails$1) {
            deFiMiniProductDetailTabViewModel$getProductDetails$1 = (DeFiMiniProductDetailTabViewModel$getProductDetails$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$getProductDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$getProductDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$getProductDetails$1 = new DeFiMiniProductDetailTabViewModel$getProductDetails$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$getProductDetails$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$getProductDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        pUU.EZpvd("CachedProductDetailsTabViewModel", "getProductDetails " + j);
        C23932iOr c23932iOr = this.OLrzqt;
        deFiMiniProductDetailTabViewModel$getProductDetails$1.label = 1;
        Object objKWHzl = c23932iOr.KWHzl(j, investmentKind, deFiMiniProductDetailTabViewModel$getProductDetails$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25526iyQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(long j, @NotNull InvestmentKind investmentKind, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation) {
        DeFiMiniProductDetailTabViewModel$invest$1 deFiMiniProductDetailTabViewModel$invest$1;
        Object objKWHzl;
        DeFiMiniProductDetailTabViewModel deFiMiniProductDetailTabViewModel;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$invest$1) {
            deFiMiniProductDetailTabViewModel$invest$1 = (DeFiMiniProductDetailTabViewModel$invest$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$invest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$invest$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$invest$1 = new DeFiMiniProductDetailTabViewModel$invest$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$invest$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$invest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23682iFk c23682iFk = new C23682iFk(j, investmentKind);
            iEM iem = this.valueOf;
            deFiMiniProductDetailTabViewModel$invest$1.L$0 = this;
            deFiMiniProductDetailTabViewModel$invest$1.L$1 = productDetailsUserTradeAction;
            deFiMiniProductDetailTabViewModel$invest$1.label = 1;
            objKWHzl = iem.KWHzl(c23682iFk, false, deFiMiniProductDetailTabViewModel$invest$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            deFiMiniProductDetailTabViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            productDetailsUserTradeAction = (ProductDetailsUserTradeAction) deFiMiniProductDetailTabViewModel$invest$1.L$1;
            deFiMiniProductDetailTabViewModel = (DeFiMiniProductDetailTabViewModel) deFiMiniProductDetailTabViewModel$invest$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objKWHzl);
        C26549jeS c26549jeS = deFiMiniProductDetailTabViewModel.AEQbTJ;
        C25476ixT c25476ixTOLrzqt = C25475ixS.OLrzqt((C23673iFb) objKWHzl);
        deFiMiniProductDetailTabViewModel$invest$1.L$0 = null;
        deFiMiniProductDetailTabViewModel$invest$1.L$1 = null;
        deFiMiniProductDetailTabViewModel$invest$1.label = 2;
        Object objEZpvd = c26549jeS.EZpvd(c25476ixTOLrzqt, productDetailsUserTradeAction, deFiMiniProductDetailTabViewModel$invest$1);
        return objEZpvd == objCopydefault ? objCopydefault : objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25526iyQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AEQbTJ(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation) {
        DeFiMiniProductDetailTabViewModel$redeem$1 deFiMiniProductDetailTabViewModel$redeem$1;
        Object objKWHzl;
        DeFiMiniProductDetailTabViewModel deFiMiniProductDetailTabViewModel;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$redeem$1) {
            deFiMiniProductDetailTabViewModel$redeem$1 = (DeFiMiniProductDetailTabViewModel$redeem$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$redeem$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$redeem$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$redeem$1 = new DeFiMiniProductDetailTabViewModel$redeem$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$redeem$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$redeem$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C23682iFk c23682iFk = new C23682iFk(j, investmentKind);
            iEM iem = this.valueOf;
            deFiMiniProductDetailTabViewModel$redeem$1.L$0 = this;
            deFiMiniProductDetailTabViewModel$redeem$1.label = 1;
            objKWHzl = iem.KWHzl(c23682iFk, false, deFiMiniProductDetailTabViewModel$redeem$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            deFiMiniProductDetailTabViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return ((Result) obj).m7386unboximpl();
            }
            deFiMiniProductDetailTabViewModel = (DeFiMiniProductDetailTabViewModel) deFiMiniProductDetailTabViewModel$redeem$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objKWHzl);
        C26548jeR c26548jeR = deFiMiniProductDetailTabViewModel.EZpvd;
        C25476ixT c25476ixTOLrzqt = C25475ixS.OLrzqt((C23673iFb) objKWHzl);
        deFiMiniProductDetailTabViewModel$redeem$1.L$0 = null;
        deFiMiniProductDetailTabViewModel$redeem$1.label = 2;
        Object objAYXKKw = c26548jeR.AYXKKw(c25476ixTOLrzqt, deFiMiniProductDetailTabViewModel$redeem$1);
        return objAYXKKw == objCopydefault ? objCopydefault : objAYXKKw;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) {
        DeFiMiniProductDetailTabViewModel$getOktStakingDetail$1 deFiMiniProductDetailTabViewModel$getOktStakingDetail$1;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$getOktStakingDetail$1) {
            deFiMiniProductDetailTabViewModel$getOktStakingDetail$1 = (DeFiMiniProductDetailTabViewModel$getOktStakingDetail$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$getOktStakingDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$getOktStakingDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$getOktStakingDetail$1 = new DeFiMiniProductDetailTabViewModel$getOktStakingDetail$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$getOktStakingDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$getOktStakingDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23932iOr c23932iOr = this.OLrzqt;
        deFiMiniProductDetailTabViewModel$getOktStakingDetail$1.label = 1;
        Object objKWHzl = c23932iOr.KWHzl(j, deFiMiniProductDetailTabViewModel$getOktStakingDetail$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) {
        DeFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1 deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1) {
            deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1 = (DeFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1 = new DeFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1(this, continuation);
            }
        }
        DeFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1 deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$12 = deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$1;
        Object obj = deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23932iOr c23932iOr = this.OLrzqt;
        deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$12.label = 1;
        Object objAEQbTJ = c23932iOr.AEQbTJ(j, j2, deFiMiniProductDetailTabViewModel$getLsdBatchClaimDetail$12);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC26557jea>> continuation) {
        DeFiMiniProductDetailTabViewModel$checkEligibility$1 deFiMiniProductDetailTabViewModel$checkEligibility$1;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$checkEligibility$1) {
            deFiMiniProductDetailTabViewModel$checkEligibility$1 = (DeFiMiniProductDetailTabViewModel$checkEligibility$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$checkEligibility$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$checkEligibility$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$checkEligibility$1 = new DeFiMiniProductDetailTabViewModel$checkEligibility$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$checkEligibility$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$checkEligibility$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C26536jeF c26536jeF = this.copydefault;
        deFiMiniProductDetailTabViewModel$checkEligibility$1.label = 1;
        Object objKWHzl = c26536jeF.KWHzl(productDetailsByChain, z, deFiMiniProductDetailTabViewModel$checkEligibility$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Long> continuation) throws Throwable {
        DeFiMiniProductDetailTabViewModel$getAnalyticId$1 deFiMiniProductDetailTabViewModel$getAnalyticId$1;
        Object objOLrzqt;
        C23679iFh c23679iFhKWHzl;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$getAnalyticId$1) {
            deFiMiniProductDetailTabViewModel$getAnalyticId$1 = (DeFiMiniProductDetailTabViewModel$getAnalyticId$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$getAnalyticId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$getAnalyticId$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$getAnalyticId$1 = new DeFiMiniProductDetailTabViewModel$getAnalyticId$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$getAnalyticId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$getAnalyticId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniProductDetailTabViewModel$getAnalyticId$1.label = 1;
            objOLrzqt = OLrzqt(j, investmentKind, deFiMiniProductDetailTabViewModel$getAnalyticId$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        C23673iFb c23673iFb = (C23673iFb) objOLrzqt;
        if (c23673iFb == null || (c23679iFhKWHzl = c23673iFb.KWHzl()) == null) {
            return null;
        }
        return c23679iFhKWHzl.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EZpvd(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Long> continuation) throws Throwable {
        DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1 deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1;
        Object objOLrzqt;
        if (continuation instanceof DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1) {
            deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1 = (DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1) continuation;
            int i = deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1 = new DeFiMiniProductDetailTabViewModel$getSourceInvestmentId$1(this, continuation);
            }
        }
        Object obj = deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1.label = 1;
            objOLrzqt = OLrzqt(j, investmentKind, deFiMiniProductDetailTabViewModel$getSourceInvestmentId$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        C23673iFb c23673iFb = (C23673iFb) objOLrzqt;
        if (c23673iFb == null || !C23677iFf.OLrzqt(c23673iFb)) {
            return null;
        }
        return c23673iFb.KWHzl().EZpvd();
    }

    public static /* synthetic */ InvestUserRewardInfoByInvestment getHoldData$default(DeFiMiniProductDetailTabViewModel deFiMiniProductDetailTabViewModel, long j, RewardType rewardType, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return deFiMiniProductDetailTabViewModel.OLrzqt(j, rewardType, str);
    }

    public final InvestUserRewardInfoByInvestment OLrzqt(long j, @NotNull RewardType rewardType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.OLrzqt.AEQbTJ(j, rewardType, str);
    }
}

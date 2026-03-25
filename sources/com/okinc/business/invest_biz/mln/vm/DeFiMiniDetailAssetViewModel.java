package com.okinc.business.invest_biz.mln.vm;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserClaimInfoResponse;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsParams;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.C23650iEf;
import o.C23653iEi;
import o.C23673iFb;
import o.C23677iFf;
import o.C23679iFh;
import o.C23928iOn;
import o.C26536jeF;
import o.C27493jwI;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26557jea;
import o.iYG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiMiniDetailAssetViewModel extends iYG {
    public final C23928iOn AEQbTJ;
    public final C26536jeF EZpvd;
    public final C23650iEf OLrzqt;
    public final C23653iEi copydefault;

    @yCM
    public DeFiMiniDetailAssetViewModel(@NotNull C26536jeF c26536jeF, @NotNull C23650iEf c23650iEf, @NotNull C23653iEi c23653iEi, @NotNull C23928iOn c23928iOn) {
        Intrinsics.checkNotNullParameter(c26536jeF, "");
        Intrinsics.checkNotNullParameter(c23650iEf, "");
        Intrinsics.checkNotNullParameter(c23653iEi, "");
        Intrinsics.checkNotNullParameter(c23928iOn, "");
        this.EZpvd = c26536jeF;
        this.OLrzqt = c23650iEf;
        this.copydefault = c23653iEi;
        this.AEQbTJ = c23928iOn;
    }

    @Override // o.iYG
    public void OLrzqt(@NotNull AssetDetailsParams assetDetailsParams) {
        Intrinsics.checkNotNullParameter(assetDetailsParams, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DeFiMiniDetailAssetViewModel$loadAssetDetails$1(assetDetailsParams, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object OLrzqt(long j, @NotNull Continuation<? super Result<InvestStOktDrawDetailResponse>> continuation) {
        DeFiMiniDetailAssetViewModel$getOktStakingDetail$1 deFiMiniDetailAssetViewModel$getOktStakingDetail$1;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$getOktStakingDetail$1) {
            deFiMiniDetailAssetViewModel$getOktStakingDetail$1 = (DeFiMiniDetailAssetViewModel$getOktStakingDetail$1) continuation;
            int i = deFiMiniDetailAssetViewModel$getOktStakingDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$getOktStakingDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$getOktStakingDetail$1 = new DeFiMiniDetailAssetViewModel$getOktStakingDetail$1(this, continuation);
            }
        }
        Object obj = deFiMiniDetailAssetViewModel$getOktStakingDetail$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$getOktStakingDetail$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23928iOn c23928iOn = this.AEQbTJ;
        deFiMiniDetailAssetViewModel$getOktStakingDetail$1.label = 1;
        Object objKWHzl = c23928iOn.KWHzl(j, deFiMiniDetailAssetViewModel$getOktStakingDetail$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(long j, long j2, @NotNull Continuation<? super Result<InvestUserClaimInfoResponse>> continuation) {
        DeFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1 deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1) {
            deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1 = (DeFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1) continuation;
            int i = deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1 = new DeFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1(this, continuation);
            }
        }
        DeFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1 deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$12 = deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$1;
        Object obj = deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23928iOn c23928iOn = this.AEQbTJ;
        deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$12.label = 1;
        Object objAEQbTJ = c23928iOn.AEQbTJ(j, j2, deFiMiniDetailAssetViewModel$getLsdBatchClaimDetail$12);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(@NotNull ProductDetailsByChain productDetailsByChain, boolean z, @NotNull Continuation<? super Result<? extends InterfaceC26557jea>> continuation) {
        DeFiMiniDetailAssetViewModel$checkEligibility$1 deFiMiniDetailAssetViewModel$checkEligibility$1;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$checkEligibility$1) {
            deFiMiniDetailAssetViewModel$checkEligibility$1 = (DeFiMiniDetailAssetViewModel$checkEligibility$1) continuation;
            int i = deFiMiniDetailAssetViewModel$checkEligibility$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$checkEligibility$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$checkEligibility$1 = new DeFiMiniDetailAssetViewModel$checkEligibility$1(this, continuation);
            }
        }
        Object obj = deFiMiniDetailAssetViewModel$checkEligibility$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$checkEligibility$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C26536jeF c26536jeF = this.EZpvd;
        deFiMiniDetailAssetViewModel$checkEligibility$1.label = 1;
        Object objKWHzl = c26536jeF.KWHzl(productDetailsByChain, z, deFiMiniDetailAssetViewModel$checkEligibility$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC25524iyO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Long> continuation) throws Throwable {
        DeFiMiniDetailAssetViewModel$getAnalyticId$1 deFiMiniDetailAssetViewModel$getAnalyticId$1;
        Object objOLrzqt;
        C23679iFh c23679iFhKWHzl;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$getAnalyticId$1) {
            deFiMiniDetailAssetViewModel$getAnalyticId$1 = (DeFiMiniDetailAssetViewModel$getAnalyticId$1) continuation;
            int i = deFiMiniDetailAssetViewModel$getAnalyticId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$getAnalyticId$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$getAnalyticId$1 = new DeFiMiniDetailAssetViewModel$getAnalyticId$1(this, continuation);
            }
        }
        Object obj = deFiMiniDetailAssetViewModel$getAnalyticId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$getAnalyticId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniDetailAssetViewModel$getAnalyticId$1.label = 1;
            objOLrzqt = OLrzqt(j, investmentKind, deFiMiniDetailAssetViewModel$getAnalyticId$1);
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
        DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1 deFiMiniDetailAssetViewModel$getSourceInvestmentId$1;
        Object objOLrzqt;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1) {
            deFiMiniDetailAssetViewModel$getSourceInvestmentId$1 = (DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1) continuation;
            int i = deFiMiniDetailAssetViewModel$getSourceInvestmentId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$getSourceInvestmentId$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$getSourceInvestmentId$1 = new DeFiMiniDetailAssetViewModel$getSourceInvestmentId$1(this, continuation);
            }
        }
        Object obj = deFiMiniDetailAssetViewModel$getSourceInvestmentId$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$getSourceInvestmentId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            deFiMiniDetailAssetViewModel$getSourceInvestmentId$1.label = 1;
            objOLrzqt = OLrzqt(j, investmentKind, deFiMiniDetailAssetViewModel$getSourceInvestmentId$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<C23673iFb>> continuation) {
        DeFiMiniDetailAssetViewModel$getProductDetails$1 deFiMiniDetailAssetViewModel$getProductDetails$1;
        Object objKWHzl;
        if (continuation instanceof DeFiMiniDetailAssetViewModel$getProductDetails$1) {
            deFiMiniDetailAssetViewModel$getProductDetails$1 = (DeFiMiniDetailAssetViewModel$getProductDetails$1) continuation;
            int i = deFiMiniDetailAssetViewModel$getProductDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailAssetViewModel$getProductDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailAssetViewModel$getProductDetails$1 = new DeFiMiniDetailAssetViewModel$getProductDetails$1(this, continuation);
            }
        }
        Object obj = deFiMiniDetailAssetViewModel$getProductDetails$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailAssetViewModel$getProductDetails$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                C23928iOn c23928iOn = this.AEQbTJ;
                deFiMiniDetailAssetViewModel$getProductDetails$1.label = 1;
                objKWHzl = c23928iOn.KWHzl(j, investmentKind, deFiMiniDetailAssetViewModel$getProductDetails$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objKWHzl);
            return Result.m7377constructorimpl((C23673iFb) objKWHzl);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

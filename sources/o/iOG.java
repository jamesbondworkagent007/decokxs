package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.invest_biz.data.bean.InvestProductDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByPosition;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailBridgeViewModel$clearMemoryCache$1;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailBridgeViewModel$getPositionData$1;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailBridgeViewModel$getProductDetails$1;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iOG extends ViewModel {
    public final C23932iOr KWHzl;
    public final iEO OLrzqt;

    @yCM
    public iOG(@NotNull C23932iOr c23932iOr, @NotNull iEO ieo) {
        Intrinsics.checkNotNullParameter(c23932iOr, "");
        Intrinsics.checkNotNullParameter(ieo, "");
        this.KWHzl = c23932iOr;
        this.OLrzqt = ieo;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DeFiMiniDetailBridgeViewModel$clearMemoryCache$1 deFiMiniDetailBridgeViewModel$clearMemoryCache$1;
        if (continuation instanceof DeFiMiniDetailBridgeViewModel$clearMemoryCache$1) {
            deFiMiniDetailBridgeViewModel$clearMemoryCache$1 = (DeFiMiniDetailBridgeViewModel$clearMemoryCache$1) continuation;
            int i = deFiMiniDetailBridgeViewModel$clearMemoryCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailBridgeViewModel$clearMemoryCache$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailBridgeViewModel$clearMemoryCache$1 = new DeFiMiniDetailBridgeViewModel$clearMemoryCache$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailBridgeViewModel$clearMemoryCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailBridgeViewModel$clearMemoryCache$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                iEO ieo = this.OLrzqt;
                deFiMiniDetailBridgeViewModel$clearMemoryCache$1.label = 1;
                if (ieo.copydefault(j, deFiMiniDetailBridgeViewModel$clearMemoryCache$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DeFiMiniDetailBridgeViewModel", "Error clearing memory cache", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<C23673iFb>> continuation) throws java.lang.Throwable {
        DeFiMiniDetailBridgeViewModel$getProductDetails$1 deFiMiniDetailBridgeViewModel$getProductDetails$1;
        if (continuation instanceof DeFiMiniDetailBridgeViewModel$getProductDetails$1) {
            deFiMiniDetailBridgeViewModel$getProductDetails$1 = (DeFiMiniDetailBridgeViewModel$getProductDetails$1) continuation;
            int i = deFiMiniDetailBridgeViewModel$getProductDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailBridgeViewModel$getProductDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailBridgeViewModel$getProductDetails$1 = new DeFiMiniDetailBridgeViewModel$getProductDetails$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailBridgeViewModel$getProductDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailBridgeViewModel$getProductDetails$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23932iOr c23932iOr = this.KWHzl;
        deFiMiniDetailBridgeViewModel$getProductDetails$1.label = 1;
        java.lang.Object objKWHzl = c23932iOr.KWHzl(j, investmentKind, deFiMiniDetailBridgeViewModel$getProductDetails$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, long j2, @NotNull Continuation<? super InvestUserAssetDetailByPosition> continuation) throws java.lang.Throwable {
        DeFiMiniDetailBridgeViewModel$getPositionData$1 deFiMiniDetailBridgeViewModel$getPositionData$1;
        java.lang.Object objCopydefault;
        java.util.List<InvestUserAssetDetailByPosition> positionList;
        java.lang.Object next;
        if (continuation instanceof DeFiMiniDetailBridgeViewModel$getPositionData$1) {
            deFiMiniDetailBridgeViewModel$getPositionData$1 = (DeFiMiniDetailBridgeViewModel$getPositionData$1) continuation;
            int i = deFiMiniDetailBridgeViewModel$getPositionData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailBridgeViewModel$getPositionData$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailBridgeViewModel$getPositionData$1 = new DeFiMiniDetailBridgeViewModel$getPositionData$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailBridgeViewModel$getPositionData$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = deFiMiniDetailBridgeViewModel$getPositionData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                C23932iOr c23932iOr = this.KWHzl;
                deFiMiniDetailBridgeViewModel$getPositionData$1.L$0 = str;
                deFiMiniDetailBridgeViewModel$getPositionData$1.label = 1;
                objCopydefault = c23932iOr.copydefault(j, deFiMiniDetailBridgeViewModel$getPositionData$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) deFiMiniDetailBridgeViewModel$getPositionData$1.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objCopydefault)) {
                objCopydefault = null;
            }
            InvestUserAssetDetailByInvestment investUserAssetDetailByInvestment = (InvestUserAssetDetailByInvestment) objCopydefault;
            if (investUserAssetDetailByInvestment == null || (positionList = investUserAssetDetailByInvestment.getPositionList()) == null) {
                return null;
            }
            java.util.Iterator<T> it = positionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InvestUserAssetDetailByPosition) next).getTokenId(), (java.lang.Object) str)) {
                    break;
                }
            }
            return (InvestUserAssetDetailByPosition) next;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("MiniInvestBridgeViewModel", "Error getting position data", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<InvestProductDetailResponse>> continuation) throws java.lang.Throwable {
        DeFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1 deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1;
        if (continuation instanceof DeFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1) {
            deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1 = (DeFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1) continuation;
            int i = deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1 = new DeFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1(this, continuation);
            }
        }
        java.lang.Object obj = deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C23932iOr c23932iOr = this.KWHzl;
        deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1.label = 1;
        java.lang.Object objCopydefault2 = c23932iOr.copydefault(j, investmentKind, deFiMiniDetailBridgeViewModel$getRawProductDetailsResponse$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}

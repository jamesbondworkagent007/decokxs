package com.okinc.business.invest_biz.data.repository.product_details;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.business.invest_biz.data.bean.InvestmentNetworkInfo;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23673iFb;
import o.C23682iFk;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25472ixP;
import o.iBL;
import o.iEO;
import o.iEP;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$fetchDecisiveInfo$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends ProductDetailsByChain>>, Object> {
    final /* synthetic */ C23682iFk $params;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$fetchDecisiveInfo$2(iEP iep, C23682iFk c23682iFk, Continuation<? super ProductDetailsRepositoryImpl$fetchDecisiveInfo$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$params = c23682iFk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$fetchDecisiveInfo$2(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends ProductDetailsByChain>> continuation) {
        return invoke2((Continuation<? super List<ProductDetailsByChain>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<ProductDetailsByChain>> continuation) {
        return ((ProductDetailsRepositoryImpl$fetchDecisiveInfo$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Long lOLrzqt;
        Object objOLrzqt;
        List<InvestmentNetworkInfo> list;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        ArrayList arrayList = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEO ieo = this.this$0.EZpvd;
            this.label = 1;
            if (ieo.KWHzl(this) == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                list = (List) objUnwrapResponseData$default;
                if (list != null) {
                    C23682iFk c23682iFk = this.$params;
                    arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (InvestmentNetworkInfo investmentNetworkInfo : list) {
                        arrayList.add(new ProductDetailsByChain(investmentNetworkInfo.getInvestmentId(), c23682iFk.copydefault(), new ChainInfo(investmentNetworkInfo.getChainId(), investmentNetworkInfo.getNetwork(), null, null, null, 28, null), Intrinsics.EZpvd(investmentNetworkInfo.getHasBonus(), C56443yFo.KWHzl(true)), null, null, null, false, PsExtractor.VIDEO_STREAM_MASK, null));
                    }
                }
                return arrayList == null ? yDY.AhwBna() : arrayList;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
            lOLrzqt = ((C23673iFb) objAEQbTJ).KWHzl().OLrzqt();
            if (lOLrzqt != null) {
                iEP iep = this.this$0;
                C23682iFk c23682iFk2 = this.$params;
                long jLongValue = lOLrzqt.longValue();
                InterfaceC25472ixP interfaceC25472ixPOLrzqt = iep.copydefault.OLrzqt();
                long jKWHzl = c23682iFk2.KWHzl();
                int value = c23682iFk2.copydefault().getValue();
                this.label = 3;
                objOLrzqt = interfaceC25472ixPOLrzqt.OLrzqt(jLongValue, jKWHzl, value, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objOLrzqt, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default2);
                list = (List) objUnwrapResponseData$default2;
                if (list != null) {
                }
            }
            if (arrayList == null) {
            }
        }
        iEP iep2 = this.this$0;
        C23682iFk c23682iFk3 = this.$params;
        this.label = 2;
        objAEQbTJ = iep2.AEQbTJ(c23682iFk3, this);
        if (objAEQbTJ == objCopydefault) {
            return objCopydefault;
        }
        lOLrzqt = ((C23673iFb) objAEQbTJ).KWHzl().OLrzqt();
        if (lOLrzqt != null) {
        }
        if (arrayList == null) {
        }
    }
}

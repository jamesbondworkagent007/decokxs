package com.okinc.business.invest_biz.data.repository.product_details;

import com.okinc.business.invest_biz.data.bean.InvestUserAssetDetailByInvestment;
import com.okinc.business.invest_biz.data.bean.request.InvestMyInvestmentNewParam;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC25472ixP;
import o.InterfaceC9738bbJ;
import o.iBL;
import o.iEO;
import o.iEP;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsRepositoryImpl$getPortfolio$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends InvestUserAssetDetailByInvestment>>, Object> {
    final /* synthetic */ Long $chainId;
    final /* synthetic */ Long $farmId;
    final /* synthetic */ long $investmentId;
    Object L$0;
    int label;
    final /* synthetic */ iEP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsRepositoryImpl$getPortfolio$2(iEP iep, long j, Long l, Long l2, Continuation<? super ProductDetailsRepositoryImpl$getPortfolio$2> continuation) {
        super(1, continuation);
        this.this$0 = iep;
        this.$investmentId = j;
        this.$chainId = l;
        this.$farmId = l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new ProductDetailsRepositoryImpl$getPortfolio$2(this.this$0, this.$investmentId, this.$chainId, this.$farmId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends InvestUserAssetDetailByInvestment>> continuation) {
        return invoke2((Continuation<? super List<InvestUserAssetDetailByInvestment>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<InvestUserAssetDetailByInvestment>> continuation) {
        return ((ProductDetailsRepositoryImpl$getPortfolio$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [252=4] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        InvestMyInvestmentNewParam investMyInvestmentNewParam;
        Object objEZpvd;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iEO ieo = this.this$0.EZpvd;
            long j = this.$investmentId;
            this.label = 1;
            objKWHzl = ieo.KWHzl(j, this);
            if (objKWHzl == objCopydefault2) {
                return objCopydefault2;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return list;
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
                Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objCopydefault, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                List<InvestUserAssetDetailByInvestment> list2 = (List) objUnwrapResponseData$default;
                iEO ieo2 = this.this$0.EZpvd;
                long j2 = this.$investmentId;
                this.L$0 = list2;
                this.label = 4;
                return ieo2.EZpvd(j2, list2, this) == objCopydefault2 ? objCopydefault2 : list2;
            }
            investMyInvestmentNewParam = (InvestMyInvestmentNewParam) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = obj;
            this.L$0 = null;
            this.label = 3;
            objCopydefault = ((InterfaceC25472ixP) objEZpvd).copydefault(investMyInvestmentNewParam, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objCopydefault, null, 1, null);
            Intrinsics.copydefault(objUnwrapResponseData$default2);
            List<InvestUserAssetDetailByInvestment> list22 = (List) objUnwrapResponseData$default2;
            iEO ieo22 = this.this$0.EZpvd;
            long j22 = this.$investmentId;
            this.L$0 = list22;
            this.label = 4;
            if (ieo22.EZpvd(j22, list22, this) == objCopydefault2) {
            }
        }
        List list3 = (List) objKWHzl;
        if (list3 != null) {
            return list3;
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.this$0.AEQbTJ.OLrzqt();
        if (interfaceC9738bbJOLrzqt == null) {
            return yDY.AhwBna();
        }
        investMyInvestmentNewParam = new InvestMyInvestmentNewParam(this.$farmId, C56443yFo.KWHzl(this.$investmentId), (String) null, this.this$0.EZpvd(interfaceC9738bbJOLrzqt, this.$chainId), 4, (DefaultConstructorMarker) null);
        iEP iep = this.this$0;
        this.L$0 = investMyInvestmentNewParam;
        this.label = 2;
        objEZpvd = iep.EZpvd(this);
        if (objEZpvd == objCopydefault2) {
            return objCopydefault2;
        }
        this.L$0 = null;
        this.label = 3;
        objCopydefault = ((InterfaceC25472ixP) objEZpvd).copydefault(investMyInvestmentNewParam, this);
        if (objCopydefault == objCopydefault2) {
        }
        Object objUnwrapResponseData$default22 = iBL.unwrapResponseData$default((ResponseData) objCopydefault, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default22);
        List<InvestUserAssetDetailByInvestment> list222 = (List) objUnwrapResponseData$default22;
        iEO ieo222 = this.this$0.EZpvd;
        long j222 = this.$investmentId;
        this.L$0 = list222;
        this.label = 4;
        if (ieo222.EZpvd(j222, list222, this) == objCopydefault2) {
        }
    }
}

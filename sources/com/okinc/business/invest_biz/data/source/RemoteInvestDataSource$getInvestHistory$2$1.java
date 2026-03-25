package com.okinc.business.invest_biz.data.source;

import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23691iFt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23589iBz;
import o.InterfaceC25472ixP;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoteInvestDataSource$getInvestHistory$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<InvestHomeOrderVo>>, Object> {
    final /* synthetic */ DetailOrderParam $detailOrderParam;
    final /* synthetic */ C23691iFt $this_runOrErrorResponse;
    final /* synthetic */ String $walletId;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteInvestDataSource$getInvestHistory$2$1(C23691iFt c23691iFt, String str, DetailOrderParam detailOrderParam, Continuation<? super RemoteInvestDataSource$getInvestHistory$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c23691iFt;
        this.$walletId = str;
        this.$detailOrderParam = detailOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteInvestDataSource$getInvestHistory$2$1(this.$this_runOrErrorResponse, this.$walletId, this.$detailOrderParam, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<InvestHomeOrderVo>> continuation) {
        return ((RemoteInvestDataSource$getInvestHistory$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC23589iBz interfaceC23589iBz = this.$this_runOrErrorResponse.EZpvd;
            String str = this.$walletId;
            this.label = 1;
            obj = interfaceC23589iBz.KWHzl(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        DetailOrderParam detailOrderParam = this.$detailOrderParam;
        this.label = 2;
        obj = ((InterfaceC25472ixP) obj).KWHzl(detailOrderParam, this);
        return obj == objCopydefault ? objCopydefault : obj;
    }
}

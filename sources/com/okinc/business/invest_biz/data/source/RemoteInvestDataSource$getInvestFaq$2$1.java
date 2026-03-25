package com.okinc.business.invest_biz.data.source;

import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23691iFt;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC25472ixP;

/* JADX INFO: loaded from: classes6.dex */
public final class RemoteInvestDataSource$getInvestFaq$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends InvestQaVo>>>, Object> {
    final /* synthetic */ C23691iFt $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteInvestDataSource$getInvestFaq$2$1(C23691iFt c23691iFt, Continuation<? super RemoteInvestDataSource$getInvestFaq$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c23691iFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteInvestDataSource$getInvestFaq$2$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends InvestQaVo>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<InvestQaVo>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<InvestQaVo>>> continuation) {
        return ((RemoteInvestDataSource$getInvestFaq$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC25472ixP interfaceC25472ixPOLrzqt = this.$this_runOrErrorResponse.EZpvd.OLrzqt();
            this.label = 1;
            obj = interfaceC25472ixPOLrzqt.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}

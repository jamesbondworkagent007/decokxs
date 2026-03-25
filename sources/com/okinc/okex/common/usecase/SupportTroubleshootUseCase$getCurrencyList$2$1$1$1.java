package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.TxnCurrencyBean;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45350soD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44921sfz;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportTroubleshootUseCase$getCurrencyList$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends TxnCurrencyBean>>>, Object> {
    final /* synthetic */ C45350soD $this_runOrErrorResponse;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootUseCase$getCurrencyList$2$1$1$1(C45350soD c45350soD, Continuation<? super SupportTroubleshootUseCase$getCurrencyList$2$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45350soD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootUseCase$getCurrencyList$2$1$1$1(this.$this_runOrErrorResponse, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends TxnCurrencyBean>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<TxnCurrencyBean>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<TxnCurrencyBean>>> continuation) {
        return ((SupportTroubleshootUseCase$getCurrencyList$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44921sfz interfaceC44921sfz = this.$this_runOrErrorResponse.OLrzqt;
            this.label = 1;
            obj = InterfaceC44921sfz.Activity.getTxnCurrencyList$default(interfaceC44921sfz, null, this, 1, null);
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

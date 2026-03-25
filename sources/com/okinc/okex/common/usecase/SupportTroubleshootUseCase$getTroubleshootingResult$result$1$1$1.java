package com.okinc.okex.common.usecase;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.TxnContextualModel;
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
public final class SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<TxnContextualModel>>, Object> {
    final /* synthetic */ Integer $chainId;
    final /* synthetic */ int $currencyId;
    final /* synthetic */ C45350soD $this_runOrErrorResponse;
    final /* synthetic */ String $txid;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1(C45350soD c45350soD, int i, Integer num, String str, Continuation<? super SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c45350soD;
        this.$currencyId = i;
        this.$chainId = num;
        this.$txid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1(this.$this_runOrErrorResponse, this.$currencyId, this.$chainId, this.$txid, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<TxnContextualModel>> continuation) {
        return ((SupportTroubleshootUseCase$getTroubleshootingResult$result$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44921sfz interfaceC44921sfz = this.$this_runOrErrorResponse.OLrzqt;
            int i2 = this.$currencyId;
            Integer num = this.$chainId;
            String str = this.$txid;
            this.label = 1;
            obj = interfaceC44921sfz.copydefault(i2, num, str, this);
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

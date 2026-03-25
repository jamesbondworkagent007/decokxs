package com.okinc.business.defi.dapp.webview;

import com.okinc.business.defi.dapp.net.DeFiApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C15061dxH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class TonWebAppInterface$getTonProfResult$dappDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super JsonObject>, Object> {
    final /* synthetic */ String $manifestUrl;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonWebAppInterface$getTonProfResult$dappDetail$1(String str, Continuation<? super TonWebAppInterface$getTonProfResult$dappDetail$1> continuation) {
        super(2, continuation);
        this.$manifestUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonWebAppInterface$getTonProfResult$dappDetail$1(this.$manifestUrl, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super JsonObject> continuation) {
        return ((TonWebAppInterface$getTonProfResult$dappDetail$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DeFiApiService deFiApiServiceEZpvd = C15061dxH.AEQbTJ.EZpvd();
            String str = this.$manifestUrl;
            this.label = 1;
            obj = deFiApiServiceEZpvd.getRequest(str, this);
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

package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C15935eaT;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DAppConnectRequest>, Object> {
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1(C15935eaT c15935eaT, Continuation<? super OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super DAppConnectRequest> continuation) {
        return ((OKXConnectManager$subscribeFetchAndGetSessionInfo$sessionInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableSharedFlow mutableSharedFlow = this.this$0.ejfBZ;
            this.label = 1;
            obj = FlowKt.firstOrNull(mutableSharedFlow, this);
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

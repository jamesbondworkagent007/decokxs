package com.okinc.business.defi.biz.walletconnect;

import androidx.lifecycle.PausingDispatcherKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.reown.walletkit.client.Wallet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C13982dcp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletConnectV2Manager$startSessionRequestListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletConnectV2Manager$startSessionRequestListener$1(Continuation<? super WalletConnectV2Manager$startSessionRequestListener$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectV2Manager$startSessionRequestListener$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectV2Manager$startSessionRequestListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowReceiveAsFlow = FlowKt.receiveAsFlow(C13982dcp.AYXKKw);
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.biz.walletconnect.WalletConnectV2Manager$startSessionRequestListener$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(Wallet.Model.SessionRequest sessionRequest, Continuation<? super Unit> continuation) {
                    Object objWhenStarted = PausingDispatcherKt.whenStarted(ProcessLifecycleOwner.Companion.get().getLifecycle(), new WalletConnectV2Manager$startSessionRequestListener$1$1$1(sessionRequest, null), continuation);
                    return objWhenStarted == C56442yFn.copydefault() ? objWhenStarted : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowReceiveAsFlow.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

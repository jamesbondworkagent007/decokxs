package com.okinc.business.defi.wallet.home.walletconnect;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C16061ecn;
import o.C18351fgk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletConnectViewModel$listenDAppSessionStateChanges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18351fgk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectViewModel$listenDAppSessionStateChanges$1(C18351fgk c18351fgk, Continuation<? super WalletConnectViewModel$listenDAppSessionStateChanges$1> continuation) {
        super(2, continuation);
        this.this$0 = c18351fgk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectViewModel$listenDAppSessionStateChanges$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectViewModel$listenDAppSessionStateChanges$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow<C16061ecn> flowAYXKKw = this.this$0.AYXKKw();
            final C18351fgk c18351fgk = this.this$0;
            FlowCollector<? super C16061ecn> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.home.walletconnect.WalletConnectViewModel$listenDAppSessionStateChanges$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(C16061ecn c16061ecn, Continuation<? super Unit> continuation) {
                    if (c16061ecn.EZpvd()) {
                        c18351fgk.KWHzl();
                    } else if (c16061ecn.KWHzl()) {
                        c18351fgk.copydefault().setValue(C56443yFo.AEQbTJ(2));
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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

package com.okinc.common.okcore.net;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C32534mfR;
import o.C4259BaI;
import o.C4298Bav;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes15.dex */
public final class OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1(Continuation<? super OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKCoreNetStateManager$networkBroadcastReceiver$1$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C4259BaI c4259BaI = (C4259BaI) C32534mfR.EZpvd.get();
            C4259BaI c4259BaIKWHzl = C32534mfR.AEQbTJ.KWHzl();
            pUU.KWHzl("OKCoreNetStateManager", "network state: " + c4259BaI.AEQbTJ() + ", " + c4259BaIKWHzl.AEQbTJ());
            if (!Intrinsics.EZpvd(c4259BaI, c4259BaIKWHzl)) {
                C32534mfR.EZpvd.set(c4259BaIKWHzl);
                Intrinsics.copydefault(c4259BaI);
                C4298Bav.networkDidChanged(c4259BaI, c4259BaIKWHzl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.okinc.gray.remoteconfig;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C35210nqy;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35209nqx;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C35210nqy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1(C35210nqy c35210nqy, Continuation<? super RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c35210nqy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoteConfigGrayManager$notifyWhenStrategyUpdated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Map map = this.this$0.OLrzqt;
            C35210nqy c35210nqy = this.this$0;
            for (Map.Entry entry : map.entrySet()) {
                c35210nqy.OLrzqt((String) entry.getKey(), (InterfaceC35209nqx) entry.getValue());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

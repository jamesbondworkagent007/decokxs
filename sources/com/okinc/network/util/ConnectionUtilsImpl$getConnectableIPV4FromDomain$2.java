package com.okinc.network.util;

import com.okinc.network.model.ConnectTestResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43462rpj;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes9.dex */
public final class ConnectionUtilsImpl$getConnectableIPV4FromDomain$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ConnectTestResult>, Object> {
    final /* synthetic */ String $domain;
    final /* synthetic */ int $port;
    final /* synthetic */ int $timeoutMs;
    int label;
    final /* synthetic */ C43462rpj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionUtilsImpl$getConnectableIPV4FromDomain$2(C43462rpj c43462rpj, String str, int i, int i2, Continuation<? super ConnectionUtilsImpl$getConnectableIPV4FromDomain$2> continuation) {
        super(2, continuation);
        this.this$0 = c43462rpj;
        this.$domain = str;
        this.$port = i;
        this.$timeoutMs = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConnectionUtilsImpl$getConnectableIPV4FromDomain$2(this.this$0, this.$domain, this.$port, this.$timeoutMs, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ConnectTestResult> continuation) {
        return ((ConnectionUtilsImpl$getConnectableIPV4FromDomain$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return this.this$0.AEQbTJ(this.$domain, this.$port, this.$timeoutMs);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

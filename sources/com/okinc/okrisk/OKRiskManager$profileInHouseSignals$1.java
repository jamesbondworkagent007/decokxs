package com.okinc.okrisk;

import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46979thQ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC47027tiL;

/* JADX INFO: loaded from: classes10.dex */
public final class OKRiskManager$profileInHouseSignals$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC47027tiL $callback;
    final /* synthetic */ CoroutineScope $currScope;
    final /* synthetic */ Map<String, String> $map;
    final /* synthetic */ String $riskId;
    final /* synthetic */ OKRiskLibrarySource $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKRiskManager$profileInHouseSignals$1(Map<String, String> map, OKRiskLibrarySource oKRiskLibrarySource, InterfaceC47027tiL interfaceC47027tiL, String str, CoroutineScope coroutineScope, Continuation<? super OKRiskManager$profileInHouseSignals$1> continuation) {
        super(2, continuation);
        this.$map = map;
        this.$source = oKRiskLibrarySource;
        this.$callback = interfaceC47027tiL;
        this.$riskId = str;
        this.$currScope = coroutineScope;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKRiskManager$profileInHouseSignals$1(this.$map, this.$source, this.$callback, this.$riskId, this.$currScope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKRiskManager$profileInHouseSignals$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C46979thQ.copydefault.AEQbTJ().KWHzl(this.$map, this.$source, this.$callback, this.$riskId, this.$currScope);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

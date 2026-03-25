package com.okinc.planet.biz_content.leaderboard.ws;

import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C47670tuW;
import o.C47671tuX;
import o.C47730tvd;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes19.dex */
public final class SpotlightPriceWsManager$emitPriceUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HashMap<String, C47670tuW> $cedefiSnapshot;
    final /* synthetic */ HashMap<String, C47671tuX> $cefiSnapshot;
    int label;
    final /* synthetic */ C47730tvd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightPriceWsManager$emitPriceUpdate$1(HashMap<String, C47671tuX> map, HashMap<String, C47670tuW> map2, C47730tvd c47730tvd, Continuation<? super SpotlightPriceWsManager$emitPriceUpdate$1> continuation) {
        super(2, continuation);
        this.$cefiSnapshot = map;
        this.$cedefiSnapshot = map2;
        this.this$0 = c47730tvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotlightPriceWsManager$emitPriceUpdate$1(this.$cefiSnapshot, this.$cedefiSnapshot, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotlightPriceWsManager$emitPriceUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(this.$cefiSnapshot);
            linkedHashMap.putAll(this.$cedefiSnapshot);
            MutableSharedFlow mutableSharedFlow = this.this$0.EZpvd;
            this.label = 1;
            if (mutableSharedFlow.emit(linkedHashMap, this) == objCopydefault) {
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
